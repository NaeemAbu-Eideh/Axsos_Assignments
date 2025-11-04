package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {// this class implements the HIPAACompliantUser and HIPAACompliantAdmin interfaces and inherets from User class
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role) { // this constructor receive id and role from user and insert it to the mebmer variabels of the class
        this.setId(employeeID);
        this.employeeID = employeeID;
        this.role = role;
        securityIncidents = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() { // it came from HIPAACompliantAdmin interface , in this method I created a report and add it to the list of reports
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return getPatientNotes();
    }

    @Override
    public boolean assignPin(int pin) { // this class come from HIPAACompliantUser interface , in this method I check if the pin length is 6 or not and if true insert it into pin variable
        String strPin = "" + pin;
        if(strPin.length() ==6) {
            this.setPin(pin);
        }
        return strPin.length() == 6;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) { // this class come from HIPAACompliantUser interface , in this method I check if the id come from user is match with the id store in the object of this class , and return a boolean result, if the result is false, it created a report and store it to the list of reports
        Integer id = getId();
        if(id.equals(confirmedAuthID)) { return true;}
        else{
            authIncident();
            return false;
        }
    }

    // this is setters and getters for class member variables
    public void setPatientNotes(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
    public ArrayList<String> getPatientNotes() {
        return securityIncidents;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() { return role; }
    public Integer getEmployeeID() { return employeeID; }
    public void setEmployeeID(Integer employeeID) { this.employeeID = employeeID; }
}
