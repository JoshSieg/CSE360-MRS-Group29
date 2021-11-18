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
            Patient currentPatient;
            Nurse currentNurse;
            Doctor currentDoctor;
            String currentPatientUsername;
            String currentDoctorUsername;
            int numPatients = objectIn.readInt();
            int numDoctors = objectIn.readInt();
            int numNurses = objectIn.readInt();
            int numVisits;
            int numPatientsToDoctor;
            int numDoctorsToNurse;
            for (int i = 0; i < numPatients; i++) {
                currentPatient = (Patient) objectIn.readObject();
                UserManager.getAllPatients().add(currentPatient);
                numVisits = objectIn.readInt();
                for (int j = 0; j < numVisits; j++) {
                    currentPatient.addVisit((Visit) objectIn.readObject());
                }
                currentPatient.setAssignedDoctorName((Doctor) objectIn.readObject());
                currentPatient.setAssignedNurseName((Nurse) objectIn.readObject());
            }
            for (int i = 0; i < numDoctors; i++) {
                currentDoctor = (Doctor) objectIn.readObject();
                UserManager.getAllDoctors().add(currentDoctor);
                numPatientsToDoctor = objectIn.readInt();
                for (int j = 0; j < numPatientsToDoctor; j++) {
                    currentPatientUsername = (String) objectIn.readObject();
                    for (Patient patient : UserManager.getAllPatients()) {
                        if (patient.getUsername().equals(currentPatientUsername)) {
                            currentDoctor.addPatientToList(patient);
                        }
                    }
                }

            }
            for (int i = 0; i < numNurses; i++) {
                currentNurse = (Nurse) objectIn.readObject();
                UserManager.getAllNurses().add(currentNurse);
                numDoctorsToNurse = objectIn.readInt();
                for (int j = 0; j < numDoctorsToNurse; j++) {
                    currentDoctorUsername = (String) objectIn.readObject();
                    for (Doctor doctor : UserManager.getAllDoctors()) {
                        if (doctor.getUsername().equals(currentDoctorUsername)) {
                            currentNurse.assignToDoctor(doctor);
                        }
                    }
                }
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
                objectOut.writeInt(patient.getVisits().size());
                for (Visit visit : patient.getVisits()) {
                    objectOut.writeObject(visit);
                }
                objectOut.writeObject(patient.assignedDoctor);
                objectOut.writeObject(patient.assignedNurse);
            }
            for (Doctor doctor : UserManager.getAllDoctors()) {
                objectOut.writeObject(doctor);
                objectOut.writeInt(doctor.getNumPatients());
                for (Patient patient : doctor.getPatientList()) {
                    objectOut.writeObject(patient.getUsername());
                }
            }
            for (Nurse nurse : UserManager.getAllNurses()) {
                objectOut.writeObject(nurse);
                objectOut.writeInt(nurse.getAssignedDoctors().size());
                for (Doctor doctor : nurse.getAssignedDoctors()) {
                    objectOut.writeObject(doctor.getUsername());
                }
            }
            objectOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
