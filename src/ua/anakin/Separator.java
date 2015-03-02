package ua.anakin;

import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Separator {

    final static int targetFilesQuantity = 10;
    static Target tempTarget;

    public static boolean isHeader(String line) {
        return line.startsWith("HEAD");
    }

    public static void main(String[] args) throws IOException {

        Target[] targets = new TargetFile[targetFilesQuantity];

        for (int i = 0; i < targetFilesQuantity; i++) {
            targets[i] = new TargetFile();
        }

        Source source = new SourceFile();

        while (source.hasNext()) {
            String line = source.readLine();

            if (isHeader(line)) {
                Arrays.sort(targets);
                tempTarget = targets[0];
            }

            tempTarget.writeLine(line);
        }

    }
}
