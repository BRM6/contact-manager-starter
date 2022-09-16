package com.programming.techie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    @Test
    public void test(){
        Contact contact = new Contact("DI","MA","0123456789");
        Assertions.assertEquals("DI",contact.getFirstName(),"This is testing getfirstname function");

    }
}