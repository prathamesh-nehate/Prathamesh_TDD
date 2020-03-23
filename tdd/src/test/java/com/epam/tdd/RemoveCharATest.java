package com.epam.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveCharATest{

    RemoveCharA testObject;

    @BeforeAll
    void setUp(){
        testObject = new RemoveCharA();
    }

    @Test
    void testRemoveStart1A(){
        assertEquals("BCD",testObject.remove("ABCD"));
        assertEquals("",testObject.remove("A"));
    }

    @Test
    void testRemoveStart2A(){
        assertEquals("BCD",testObject.remove("AABCD"));
        assertEquals("AAA",testObject.remove("AAAAA"));
        assertEquals("",testObject.remove("AA"));
    }

    @Test
    void testRemove1A(){
        assertEquals("BCD",testObject.remove("BACD"));
        assertEquals("BACD",testObject.remove("BAACD"));
    }

    @Test
    void testRemove0A(){
        assertEquals("BCD",testObject.remove("BCD"));
    }

    @Test
    void testRemoveAfterOccurenceIndex1(){
        assertEquals("BCAAD",testObject.remove("BCAAD"));
    }
}