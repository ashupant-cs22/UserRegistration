package com.company.UserRegistration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {

    UserValidation userValidation = new UserValidation();

    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        try {
            Assert.assertTrue(userValidation.validateFirstName("Ashu"));
            // Assertions.assertTrue(result);
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }

    }

    @Test
    public void givenFirstName_WhenEntryFieldNull_shouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        try {
            Assert.assertFalse(userValidation.validateFirstName("Ashu"));
        } catch (UserValidationException exception) {
            NullPointerException.class.getClass();
            System.out.println("Entry Field Should not be null");
        }
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        try {
            Assert.assertFalse(userValidation.validateFirstName("As"));
        } catch (UserValidationException exception) {
            exception.printStackTrace();
            System.out.println("First Name should not be less than 3 Characters");
        }
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        try {
            Assert.assertFalse(userValidation.validateFirstName("Ashu1"));
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateFirstName("Ashu@");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateLastName("Ashu");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateFirstName("Ka");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateLastName("Kahar1");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateFirstName("Kahar@");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateEmailId("abc.syz@bl.co.in");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateMobileNum("91 9960077482");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateMobileNum("919960077482");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateMobileNum("9960077482");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateMobileNum("1234507748");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("nDj1k2*jf");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("Ma1%f");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("3Rmdg*nK");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("Mad1bt&Bx");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("mDkk%fDB");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("mDkk%fD1");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnTrue() {
        boolean result = true;
        try {
            result = userValidation.validatePassword("mDkkfD12");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnTrue() {
        boolean result = true;
        try {
            result = userValidation.validatePassword("mDkk%#D1d");
        } catch (UserValidationException exception) {
            exception.printStackTrace();
        }
        Assert.assertTrue(result);
    }
}
