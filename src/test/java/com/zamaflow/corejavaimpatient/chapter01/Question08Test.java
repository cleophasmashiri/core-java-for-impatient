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

public class Question08Test {

    private static InputStream inOriginalStream;
    private static PrintStream outOriginalStream;

    private ByteArrayOutputStream out;
    private static String inputStr = "abc\n" +
	"ab\n" + 
	"a\n" +
	"bc\n" +
	"b\n" +
	"c\n";

    @BeforeClass 
    public static void setUpClass() {
        inOriginalStream = System.in;
        outOriginalStream = System.out;
    }
    
    @Before
    public void setup() {
        ByteArrayInputStream in = new ByteArrayInputStream("abc".getBytes());
        out = new ByteArrayOutputStream(inputStr.length()*2);
        System.setIn(in);
        System.setOut(new PrintStream(out));
    }

    @Test
    public void nomaliseAngleTest() {
        Question08.main(null);
        assertEquals(inputStr, out.toString());
    }

    @AfterClass
    public static void cleanup() {
        System.setIn(inOriginalStream);
        System.setOut(outOriginalStream);
    }


}
