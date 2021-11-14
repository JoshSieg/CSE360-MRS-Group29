package sample;

public class Patient extends User{
    public float height; //in feet
    public float weight; //in lbs
    public float bodyTemp; //in farheneit
    public float bloodPressure;

    public Doctor assignedDoctor;
    public Nurse assignedNurse;

    Patient(float height, float weight, float bodyTemp, float bloodPressure) {
        this.height = height;
        this.weight = weight;
        this.bodyTemp = bodyTemp;
        this.bloodPressure = bloodPressure;
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

}
