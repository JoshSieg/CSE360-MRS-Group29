package sample;

import java.io.*;

public class DataManager {


    //reads objects from given file path into the user manager array lists
    public void readFromFile(String filepath) {
        try {
            UserManager.clearAll();
            File file = new File(filepath);
            FileInputStream fileIn = new FileInputStream(file);
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
            objectIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //saves objects from user manager array lists into the given file path
    public void saveToFile(String filepath) {
        try {
            File file = new File(filepath);
            if(file.delete() || !file.isFile()) {
                file.createNewFile();
            } else {
                throw new Exception();
            }
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            int numPatients = UserManager.getAllPatients().size();
            int numDoctors = UserManager.getAllDoctors().size();
            int numNurses = UserManager.getAllNurses().size();
            System.out.println(numPatients);
            objectOut.writeInt(numPatients);
            System.out.println(numDoctors);
            objectOut.writeInt(numDoctors);
            System.out.println(numNurses);
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
            objectOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
