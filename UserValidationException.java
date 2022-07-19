package com.company.UserRegistration;

public class UserValidationException extends Exception {

    static String message;

    enum ExceptionType {
        ENTERED_NULL, ENTERED_INVALID
    }

    ExceptionType type;

    public UserValidationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }


}
