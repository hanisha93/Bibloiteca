package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void testingForDisplayMessage() {
        BibliotecaApp displayMessage=new BibliotecaApp();
        assertEquals("Welcome_to_biboleteca",displayMessage.printWelcomeMessage());
    }
}
