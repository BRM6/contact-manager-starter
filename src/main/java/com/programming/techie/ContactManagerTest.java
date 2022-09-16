package com.programming.techie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {

    @Test
    public void test(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("DI", "MA", "0343988128");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
    }
}