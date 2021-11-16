package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Nurse extends User implements Serializable {
    public ArrayList<Doctor> assignedDoctors;

    public Nurse(String name, String username, String password) {
        super(name, username, password);
        assignedDoctors = new ArrayList<Doctor>();
    }

    public void assignToDoctor(Doctor doctor) {
        assignedDoctors.add(doctor);
    }

    public ArrayList<Patient> getPatientList() {
        ArrayList<Patient> allPatients = new ArrayList<Patient>();
        for (Doctor doctor:assignedDoctors) {
            allPatients.addAll(doctor.getPatientList());
        }
        return allPatients;
    }
}
