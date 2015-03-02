package ua.anakin;

import java.io.*;

public class TargetFile implements Target {

    private static int counter;
    private int countInstance = 0;
    private int countLine = 0;
    private PrintWriter out;

    TargetFile() throws IOException {
        countInstance = ++counter;
        String fileName = "d:\\file" + countInstance;
        out = new PrintWriter(new FileOutputStream(fileName));
    }

    @Override
    public void writeLine(String line) throws IOException {
            out.println(line);
            countLine++;
    }

    @Override
    public void closeTarget() {
        if (out != null) {
            out.close();
        }
    }

    public int getCountLine() {
        return countLine;
    }

    @Override
    public int compareTo(Object o) {
        TargetFile that = (TargetFile) o;
        return this.countLine - that.countLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TargetFile that = (TargetFile) o;

        return countInstance == that.countInstance;

    }

    @Override
    public int hashCode() {
        return this.countInstance*this.countInstance*31 + this.countInstance*31;
    }

    @Override
    public String toString() {
        return "Target #" + countInstance;
    }
}
