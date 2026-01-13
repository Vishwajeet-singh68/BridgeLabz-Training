package org.junit;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {

        if (username == null || !username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")) {
            throw new IllegalArgumentException("Invalid Username");
        }

        if (email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new IllegalArgumentException("Invalid Email");
        }

        if (password == null || !password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            throw new IllegalArgumentException("Invalid Password");
        }
    }
}

