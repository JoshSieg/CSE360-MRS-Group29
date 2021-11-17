package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Doctor extends User implements Serializable {
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

    public String getAssignedNurseName() {
        return assignedNurse.getName();
    }

    public Nurse getAssignedNurse() {
        return assignedNurse;
    }

}
