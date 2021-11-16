package sample;

import java.util.ArrayList;

public class Patient extends User{
    private ArrayList<Visit> visits;

    public Doctor assignedDoctor;
    public Nurse assignedNurse;

    Patient(String name, String username, String password) {
        super(name, username, password);
        visits = new ArrayList<Visit>();
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
