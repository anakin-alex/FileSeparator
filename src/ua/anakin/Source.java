package ua.anakin;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Source {

    boolean hasNext() throws IOException;
    String readLine() throws IOException;
    void closeSource();


}
