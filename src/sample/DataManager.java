package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataManager {


    //reads objects from given file path into the user manager array lists
    public void readFromFile(String filepath) {
        try {
            UserManager.clearAll();
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            int numPatients = objectIn.readInt();
            int numDoctors = objectIn.readInt();
            int numNurses = objectIn.readInt();
            for (int i = 0; i < numPatients; i++) {
                UserManager.getAllPatients().add((Patient) objectIn.readObject());
            }
            for (int i = 0; i < numDoctors; i++) {
                UserManager.getAllDoctors().add((Doctor) objectIn.readObject());
            }
            for (int i = 0; i < numNurses; i++) {
                UserManager.getAllNurses().add((Nurse) objectIn.readObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //saves objects from user manager array lists into the given file path
    public void saveToFile(String filepath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            int numPatients = UserManager.getAllPatients().size();
            int numDoctors = UserManager.getAllDoctors().size();
            int numNurses = UserManager.getAllNurses().size();
            objectOut.writeInt(numPatients);
            objectOut.writeInt(numDoctors);
            objectOut.writeInt(numNurses);
            for (Patient patient : UserManager.getAllPatients()) {
                objectOut.writeObject(patient);
            }
            for (Doctor doctor : UserManager.getAllDoctors()) {
                objectOut.writeObject(doctor);
            }
            for (Nurse nurse : UserManager.getAllNurses()) {
                objectOut.writeObject(nurse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
