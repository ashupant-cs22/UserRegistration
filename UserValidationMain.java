package com.company.UserRegistration;

public class UserValidationMain {

    public static void main(String[] args) {
        UserValidation myObj = new UserValidation();
        myObj.firstNameValidate();
        myObj.lastNameValidate();
        myObj.emailValidate();
        myObj.mobileValidate();
        myObj.passwordValidate();
    }

}
