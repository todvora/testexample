package cz.tomasdvorak.testexample;

import org.junit.Assert;
import org.junit.Before;

public class OsobaTest {

    private Osoba osoba;

    @Before
    public void setUp() throws Exception {
        osoba = new Osoba("Adam", "Bernau", 12, 35);
    }

    @org.junit.Test
    public void verifyToString() throws Exception {
        Assert.assertEquals("Adam Bernau má 12 let a váží 35.0 kg", osoba.toString());
    }
}
