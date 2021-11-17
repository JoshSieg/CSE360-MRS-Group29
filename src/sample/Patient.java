package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Patient extends User implements Serializable {
    private ArrayList<Visit> visits;
    private Calendar dateOfBirth;

    public Doctor assignedDoctor;
    public Nurse assignedNurse;

    Patient(String name, String username, String password, int year, int month, int day, Doctor doctor, Nurse nurse) {
        super(name, username, password);
        visits = new ArrayList<Visit>();
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, year);
        dateOfBirth.set(Calendar.MONTH, month);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, day);
        assignedDoctor = doctor;
        assignedNurse = nurse;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAssignedDoctorName(Doctor assignedDoc) {
        assignedDoctor = assignedDoc;
    }

    public void setAssignedNurseName(Nurse assignedNur) {
        assignedNurse = assignedNur;
    }

    public String getAssignedDoctorName() {
        return assignedDoctor.getName();
    }

    public String getAssignedNurseName() {
        return assignedNurse.getName();
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public Nurse getAssignedNurse() {
        return assignedNurse;
    }

    public void newVisit(float height, float weight, float bodyTemp, float bloodPressure, String reasonForVisit) {
        Visit newVisit = new Visit(height, weight, bodyTemp, bloodPressure, reasonForVisit);
        visits.add(newVisit);
    }
}
