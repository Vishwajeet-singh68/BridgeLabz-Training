package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

    DatabaseConnection db;

    // 🔹 Runs before EACH test
    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    // 🔹 Runs after EACH test
    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    // ✅ Test connection is established
    @Test
    void testDatabaseConnection() {
        assertTrue(db.isConnected());
    }

    // ✅ Test connection is closed after test
    @Test
    void testDatabaseDisconnection() {
        assertTrue(db.isConnected());
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
