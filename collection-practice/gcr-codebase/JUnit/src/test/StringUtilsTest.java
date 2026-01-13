package com.test;
import org.junit.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    StringUtils su=new StringUtils();

    @Test
    void reverseTest(){
        assertEquals("avaj",su.reverse("java"));
    }

    @Test
    void subtractionTest(){
        assertTrue(su.isPlaindrome("madam"));
    }

    @Test
    void multiplicationTest(){
        assertEquals("JAVA", su.toUpperCase("java"));
    }
}

