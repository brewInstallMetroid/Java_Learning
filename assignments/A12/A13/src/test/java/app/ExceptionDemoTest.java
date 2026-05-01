package app;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionDemoTest {

    @Test
    void testNonAsciiThrows() throws Exception {
        ExceptionDemo ed = new ExceptionDemo();
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        assertThrows(IOException.class, () -> ed.unhappyMethod(reader));
    }
}
