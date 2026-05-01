package app;

import java.io.*;

public class ExceptionDemo {

    public void someMethod() {
        anotherMethod();
        System.out.println("Life goes on...");
    }

    public void anotherMethod() {
        try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));	
			unhappyMethod(reader);
			// placeholder so project compiles
            //throw new IOException();
        } catch (IOException e) {
            System.out.println("Handle in anotherMethod");
            e.printStackTrace();
        } finally {
            System.out.println("Clean up here...");
        }
    }

    public void unhappyMethod(BufferedReader reader) throws IOException {
        //read file and throw IOException if non-ASCII found
		while (reader.read() != -1) {
			if (reader.read() > 127) throw new IOException("NON-ASCII VALUE DETECTED");
		}

    }
}
