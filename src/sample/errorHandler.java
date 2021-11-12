package sample;

public class errorHandler {

    //error for when user enters invalid login information (will be connected with loginPageController)
    public void invalidLogin(boolean validlogin){
        if(validlogin == false){
            system.out.println("invalid login try again!");
            sc.switchToLoginPage(event); //RETURN TO LOGIN SCREEN
        }
    }

    //ACCOUNT CREATION PAGE: error for when users fails to create an account
    //check for valid password inside account creation class
    public void accountCreationCheck(string newPassword, string newUsername){

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

        if(validAcc == false){
            System.out.println("Invalid account creation parameters try again!");
            //RETURN TO ACCOUNT CREATION PAGE
            //sc.switchToAccountCreation(event); (needs to be made)
        }
    }

}   //end of class
