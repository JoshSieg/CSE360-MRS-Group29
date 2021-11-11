package sample;

public class Doctor extends User {
    public Patient patientList[];
    public Nurse assignedNurse;
    public int sizeArr;

    public void Doctor(String name, Nurse assignedNurse) {

    }

    public void setPatientList(Patient patientList[]) {
        for(int i = 0; i <= patientList[].length; i++) {
            this.patientList[i] = patientList[i];
        }
    }

    public void setAssignedNurse(Nurse assignedNur) {
        assignedNurse = assignedNur;
    }

    public void addPatientToList(Patient patient, Patient patientList[]) {
        int size = getSizeArr(patientList[]);
        this.patientList[size] = patient;
    }

    public int getSizeArr(Patient patientList[]) {
        int size = 0;
        while(patientList[size] != NULL) {
            size++;
        }
        return size;
    }

    public Patient getPatientList() {
        return patientList[];
    }

    public String getAssignedNurse() {
        return assignedNurse.getName();
    }

}
