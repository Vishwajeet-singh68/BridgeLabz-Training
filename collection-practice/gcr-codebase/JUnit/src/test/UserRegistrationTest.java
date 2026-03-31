package com.test;

import org.junit.UserRegistration;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserRegistrationTest {

    UserRegistration ur = new UserRegistration();

    @ParameterizedTest
    @CsvSource({
            "123user, test@gmail.com, Abc12345",   // invalid username
            "user_123, testgmail.com, Abc12345",   // invalid email
            "user_123, test@gmail.com, abc12345"   // invalid password
    })
    void invalidUserRegistration(String username, String email, String password) {

        assertThrows(
                IllegalArgumentException.class,
                () -> ur.registerUser(username, email, password)
        );
    }
}
