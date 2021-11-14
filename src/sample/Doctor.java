package sample;

import java.util.ArrayList;
import java.util.Collections;

public class Doctor extends User {
    private ArrayList<Patient> patientList;
    private Nurse assignedNurse;

    public Doctor(String name, String username, String password, Nurse assignedNurse) {
        super(name, username, password);
        patientList = new ArrayList<Patient>(0);
    }

    public void setPatientList(Patient[] patientList) {
        Collections.addAll(this.patientList, patientList);
    }

    public void setAssignedNurse(Nurse assignedNurse) {
        this.assignedNurse = assignedNurse;
    }

    public void addPatientToList(Patient patient) {
        patientList.add(patient);
    }

    public int getNumPatients() {
        return patientList.size();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public String getAssignedNurse() {
        return assignedNurse.getName();
    }

}
