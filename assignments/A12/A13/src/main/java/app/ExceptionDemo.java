package app;

import java.io.*;

public class ExceptionDemo {

    public void someMethod() {
        anotherMethod();
        System.out.println("Life goes on...");
    }

    public void anotherMethod() {
        try {
            // placeholder so project compiles
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Handle in anotherMethod");
            e.printStackTrace();
        } finally {
            System.out.println("Clean up here...");
        }
    }

    public void unhappyMethod(BufferedReader reader) throws IOException {
        // TODO: read file and throw IOException if non-ASCII found
    }
}
