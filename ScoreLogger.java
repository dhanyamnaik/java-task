package studentexam;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ScoreLogger {
    private final String fileName;

    public ScoreLogger(String fileName) {
        this.fileName = fileName;
    }
    public synchronized void logScore(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(student.toString());
            writer.newLine(); // Add a new line for each student
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong while writing: " + e.getMessage());
        }
    }
}

