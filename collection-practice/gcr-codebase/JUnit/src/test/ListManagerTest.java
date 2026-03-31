package com.test;

import java.util.*;
import org.junit.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    ListManager manager;
    List<Integer> list;

    @BeforeEach
    void initialize(){
        manager=new ListManager();
        list=new ArrayList<>();
    }


    @Test
    void addOperationTest(){
        manager.addElement(list,10);
        manager.addElement(list,20);

        assertTrue(list.contains(10));
        assertTrue(list.contains(20));

        assertEquals(2,manager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);

        manager.removeElement(list, 10);

        assertFalse(list.contains(10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    void testGetSize() {
        manager.addElement(list, 5);
        manager.addElement(list, 15);
        manager.addElement(list, 25);

        assertEquals(3, manager.getSize(list));
    }
}
