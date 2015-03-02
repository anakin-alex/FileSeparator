package ua.anakin;


import java.io.IOException;

public interface Target extends Comparable {

    void writeLine(String line) throws IOException;
    void closeTarget();
}
