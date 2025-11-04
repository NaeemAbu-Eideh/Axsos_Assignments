package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
    public Physician(Integer num){
        this.setId(num);
    }
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
    public boolean assignPin(int pin) {
        String strPin = "" + pin;
        if(strPin.length() == 4){
            this.setPin(pin);
        }
        return strPin.length() == 4;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        Integer id = this.getId();
        return id.equals(confirmedAuthID);
    }

    // TO DO: Setters & Getters
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
