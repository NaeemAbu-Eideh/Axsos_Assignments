package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser { // this class implements the HIPAACompliantUser interface and inherets from User class
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
    public Physician(Integer num){
        this.setId(num);
    } //this constructor receive one argument named ID and stor it
    // TO DO: Implement HIPAACompliantUser!
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    @Override
    public boolean assignPin(int pin) { // this class come from HIPAACompliantUser interface , in this method I check if the pin length is 4 or not and if true insert it into pin variable
        String strPin = "" + pin;
        if(strPin.length() == 4){
            this.setPin(pin);
        }
        return strPin.length() == 4;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) { // this class come from HIPAACompliantUser interface , in this method I check if the id come from user is match with the id store in the object of this class , and return a boolean result
        Integer id = this.getId();
        return id.equals(confirmedAuthID);
    }

    // TO DO: Setters & Getters
    // this is setters and getters for the class member variable
    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }
    public void addPatientNotes(String notes, String patientName) {
        this.patientNotes.add(notes + patientName);
    }
}
