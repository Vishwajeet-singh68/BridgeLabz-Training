package com.test;

import org.junit.Assert;
import org.junit.PasswordValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    PasswordValidator pv = new PasswordValidator();

    @ParameterizedTest
    @ValueSource(strings = {"abcdef12", "abc12345"})
    void invalidTest(String password) {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> pv.validator(password)
        );

        assertEquals("Invalid Password!", exception.getMessage());
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"Abc12345", "abcdef12"})
//    public void invalidTest(String password){
//        try{
//            pv.validator(password);
//        }
//        catch (Exception e){
//            Assert.assertEquals("Invalid Password!",e.getMessage());
//        }
//    }
}
