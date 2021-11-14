package sample;

import javafx.event.ActionEvent;

import java.util.ArrayList;

//TODO check inheritance
public class ErrorHandler {
    private SceneController sc = new SceneController();

    //TODO password check might be moved to accountController
    //error for when user enters invalid login information (will be connected with loginPageController)
    public void invalidLogin(boolean validlogin){
        if(!validlogin){
            System.out.println("invalid login try again!");
        }
    }

    //ACCOUNT CREATION PAGE: error for when users fails to create an account
    //check for valid password inside account creation class
    public void accountCreationCheck(String newPassword, String newUsername){

        boolean validAcc;

        if(newPassword.length() >= 5){   //checking if password is longer than 5
             validAcc = true;
        }else{
            System.out.println("invalid password length");
            validAcc = false;
        }

        if(newUsername.length() >= 4){   //checking if username is longer than 3
            validAcc = true;
        }else{
            System.out.println("invalid username length");
            validAcc = false;
        }

        if(!validAcc){
            System.out.println("Invalid account creation parameters try again!");
            //RETURN TO ACCOUNT CREATION PAGE
            //sc.switchToAccountCreation(event); (needs to be made)
        }
    }

    //fixme array passing may need to be modified
    public Patient checkPatient(String aPatient, ArrayList<Patient> patientList){
        Patient searchedPatient = null;
        for (Patient patient : patientList) {
            if (patient.getName().equals(aPatient)) {
                searchedPatient = patient;
            }
        }
        return searchedPatient;
    }



}   //end of class
