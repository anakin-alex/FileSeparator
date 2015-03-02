package ua.anakin;

import java.io.*;
import java.util.Scanner;

public class SourceFile implements Source {

    private Scanner scanner;

    SourceFile() throws FileNotFoundException {
       scanner = new Scanner(new File("d:\\source"));
    }

    @Override
    public boolean hasNext() throws IOException {
        return scanner.hasNext();
    }

    @Override
    public String readLine() throws IOException {
        return scanner.nextLine();
    }

    @Override
    public void closeSource() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
