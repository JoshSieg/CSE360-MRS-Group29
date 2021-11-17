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

    Patient(String name, String username, String password, int year, int month, int day) {
        super(name, username, password);
        visits = new ArrayList<Visit>();
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, year);
        dateOfBirth.set(Calendar.MONTH, month);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, day);
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
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
