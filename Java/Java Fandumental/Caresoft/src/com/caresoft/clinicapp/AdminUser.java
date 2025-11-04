package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role) {
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
    public void authIncident() {
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
    public boolean assignPin(int pin) {
        String strPin = "" + pin;
        if(strPin.length() ==6) {
            this.setPin(pin);
        }
        return strPin.length() == 6;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        Integer id = getId();
        if(id.equals(confirmedAuthID)) { return true;}
        else{
            authIncident();
            return false;
        }
    }

    public void setPatientNotes(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }
    public ArrayList<String> getPatientNotes() {
        return securityIncidents;
    }
}
