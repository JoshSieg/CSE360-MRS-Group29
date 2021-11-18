package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Patient extends User implements Serializable {
    private ArrayList<Visit> visits;
    private Calendar dateOfBirth;
    private String pharmacyName;
    private String pharmacyAddress;
    private String pharmacyPhoneNumber;
    private ArrayList<String[]> prescriptions;
    private String insuranceProvider;
    private String healthPlanNumber;
    private String memberID;

    public Doctor assignedDoctor;
    public Nurse assignedNurse;

    Patient(String name, String username, String password, int year, int month, int day, Doctor doctor, Nurse nurse) {
        super(name, username, password);
        visits = new ArrayList<Visit>();
        dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, year);
        dateOfBirth.set(Calendar.MONTH, month);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, day);
        assignedDoctor = doctor;
        assignedNurse = nurse;
        prescriptions = new ArrayList<>();
        doctor.addPatientToList(this);
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    public String getPharmacyPhoneNumber() {
        return pharmacyPhoneNumber;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public String getHealthPlanNumber() {
        return healthPlanNumber;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setHealthPlanNumber(String healthPlanNumber) {
        this.healthPlanNumber = healthPlanNumber;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setPharmacyAddress(String pharmacyAddress) {
        this.pharmacyAddress = pharmacyAddress;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public void setPharmacyPhoneNumber(String pharmacyPhoneNumber) {
        this.pharmacyPhoneNumber = pharmacyPhoneNumber;
    }

    public ArrayList<String[]> getPrescriptions() {
        return prescriptions;
    }

    public void addPrescription(String[] prescriptions) {
        this.prescriptions.add(prescriptions);
    }

    public void removePrescription(String[] prescriptions) {
        this.prescriptions.remove(prescriptions);
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAssignedDoctorName(Doctor assignedDoc) {
        assignedDoctor = assignedDoc;
    }

    public void setAssignedNurseName(Nurse assignedNur) {
        assignedNurse = assignedNur;
    }

    public String getAssignedDoctorName() {
        return assignedDoctor.getName();
    }

    public String getAssignedNurseName() {
        return assignedNurse.getName();
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public Nurse getAssignedNurse() {
        return assignedNurse;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public void newVisit(float height, float weight, float bodyTemp, float bloodPressure, String reasonForVisit) {
        Visit newVisit = new Visit(height, weight, bodyTemp, bloodPressure, reasonForVisit);
        visits.add(newVisit);
    }
}
