package sample;

import java.util.ArrayList;

//GlobalUser class has static variable currentUser and two static get and set functions, used to keep track of the current user of the system.
public class UserManager {
    private static String currentUserType;
    private static Doctor currentDoctor = null;
    private static Nurse currentNurse = null;
    private static Patient currentPatient = null;
    private static ArrayList<Patient> allPatients = new ArrayList<Patient>();
    private static ArrayList<Doctor> allDoctors = new ArrayList<Doctor>();
    private static ArrayList<Nurse> allNurses = new ArrayList<Nurse>();

    public static void setCurrentUserType(String userType) {
        currentUserType = userType;
    }

    public static String getCurrentUserType() {
        return currentUserType;
    }

    public static void setCurrentDoctor(Doctor doctor) {
        currentDoctor = doctor;
    }

    public static void setCurrentPatient(Patient patient) {
        currentPatient = patient;
    }

    public static void setCurrentNurse(Nurse nurse) {
        currentNurse = nurse;
    }

    public static Doctor getCurrentDoctor() {
        return  currentDoctor;
    }

    public static Patient getCurrentPatient() {
        return currentPatient;
    }

    public static Nurse getCurrentNurse() {
        return currentNurse;
    }

    public static ArrayList<Patient> getAllPatients() {
        return allPatients;
    }

    public static ArrayList<Doctor> getAllDoctors() {
        return allDoctors;
    }

    public static ArrayList<Nurse> getAllNurses() {
        return allNurses;
    }

    public static void clearAll() {
        allPatients.clear();
        allDoctors.clear();
        allNurses.clear();
    }
}
