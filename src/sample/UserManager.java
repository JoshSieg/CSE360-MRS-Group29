package sample;

import java.util.ArrayList;

//GlobalUser class has static variable currentUser and two static get and set functions, used to keep track of the current user of the system.
public class UserManager {
    private static User currentUser;
    private static ArrayList<Patient> allPatients = new ArrayList<Patient>();
    private static ArrayList<Doctor> allDoctors = new ArrayList<Doctor>();
    private static ArrayList<Nurse> allNurses = new ArrayList<Nurse>();

    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public static User getCurrentUser() {
        return currentUser;
    }
//    if(currentUser.getClass() = Patient){
//        public static Patient getCurrentUser() {
//            return currentUser;
//        }
//    } else if(currentUser.getClass() = Nurse) {
//        public static Nurse getCurrentUser() {
//            return currentUser;
//        }
//    } else {
//        public static Doctor getCurrentUser() {
//            return currentUser;
//        }
//    }


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
