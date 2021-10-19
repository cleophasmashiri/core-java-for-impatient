package com.zamaflow.corejavaimpatient.chapter01;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Question04Test {

    private static InputStream inOriginalStream;
    private static PrintStream outOriginalStream;

    private ByteArrayOutputStream out;
    private static String inputStr = "Smallest positive: 4,90000e-324\n" +
    "Largest positive: 1,79769e+308\n";

    @BeforeClass 
    public static void setUpClass() {
        inOriginalStream = System.in;
        outOriginalStream = System.out;
    }
    
    @Before
    public void setup() {
        out = new ByteArrayOutputStream(inputStr.length()*2);
        System.setOut(new PrintStream(out));
    }

    @Test
    public void nomaliseAngleTest() {
        Question04.main(null);
        assertEquals(inputStr, out.toString());
    }

    @AfterClass
    public static void cleanup() {
        System.setIn(inOriginalStream);
        System.setOut(outOriginalStream);
    }


}
