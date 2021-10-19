package com.zamaflow.corejavaimpatient.chapter01;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Question01Test {

    private static PrintStream originalOut;
    private static InputStream originalIn;

    private ByteArrayOutputStream out;

    private final String want = "Binary: 1000000011011\n" +
            "Octal: 10033\n" +
            "Hexadecimal: 101b\n" +
            "Hexadecimal floating point: 0x1.fca5a873bcb19p-13\n";

    @BeforeClass
    public static void setupClass() {
        originalOut = System.out;
        originalIn = System.in;
    }

    @Before
    public void setupEach() {
        ByteArrayInputStream in = new ByteArrayInputStream("4123".getBytes());
        out = new ByteArrayOutputStream(want.length()*2);
        System.setIn(in);
        System.setOut(new PrintStream(out));
    }

    @AfterClass 
    public static void cleanUpAll() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    public void convertDecimalToBinaryTest() {
        Question01.main(null);
        assertEquals(want, out.toString());
    }



}
