package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Patient extends User implements Serializable {
    private ArrayList<Visit> visits;
    private Date dateOfBirth;

    public Doctor assignedDoctor;
    public Nurse assignedNurse;

    Patient(String name, String username, String password, int year, int month, int day) {
        super(name, username, password);
        visits = new ArrayList<Visit>();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        dateOfBirth = cal.getTime();
    }

    public void setAssignedDoctor(Doctor assignedDoc) {
        assignedDoctor = assignedDoc;
    }

    public void setAssignedNurse(Nurse assignedNur) {
        assignedNurse = assignedNur;
    }

    public String getAssignedDoctor() {
        return assignedDoctor.getName();
    }

    public String getAssignedNurse() {
        return assignedNurse.getName();
    }

    public void newVisit(float height, float weight, float bodyTemp, float bloodPressure, String reasonForVisit) {
        Visit newVisit = new Visit(height, weight, bodyTemp, bloodPressure, reasonForVisit);
        visits.add(newVisit);
    }
}
