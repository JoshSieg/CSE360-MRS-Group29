package sample;

public class Doctor extends User {
    public Patient[] patientList;
    public Nurse assignedNurse;
    public int sizeArr;

    public Doctor(String name, Nurse assignedNurse) {

    }

    public void setPatientList(Patient[] patientList) {
        if (patientList.length + 1 >= 0) System.arraycopy(patientList, 0, this.patientList, 0, patientList.length + 1);
    }

    public void setAssignedNurse(Nurse assignedNur) {
        assignedNurse = assignedNur;
    }

    public void addPatientToList(Patient patient, Patient[] patientList) {
        int size = getSizeArr(patientList);
        this.patientList[size] = patient;
    }

    public int getSizeArr(Patient[] patientList) {
        int size = 0;
        while(patientList[size] != null) {
            size++;
        }
        return size;
    }

    public Patient[] getPatientList() {
        return patientList;
    }

    public String getAssignedNurse() {
        return assignedNurse.getName();
    }

}
