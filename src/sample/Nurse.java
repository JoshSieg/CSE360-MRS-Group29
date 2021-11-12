package sample;

public class Nurse extends User {

    public Patient[] patientList;
    public Patient assignedPatient;
    public int sizeArr;

    public void setPatientList(Patient[] patientList) {
        for(int i = 0; i <= patientList.length; i++) {
            this.patientList[i] = patientList[i];
        }
    }

    public void setAssignedPatient(Patient aPatient) {
        assignedPatient = aPatient;
    }

    public void addPatientToList(Patient patient, Patient[] patientList) {
        int size = getSize(patientList);
        this.patientList[size] = patient;
    }

    public int getSize(Patient patientList[]) {
        int size = 0;
        while(patientList[size] != null) {
            size++;
        }
        return size;
    }

    public Patient[] getPatientList() {
        return this.patientList;
    }

    public String getPatient() {
        return assignedPatient.getName();
    }

}
