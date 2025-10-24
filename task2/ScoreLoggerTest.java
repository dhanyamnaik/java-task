package studentexam;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

class ScoreLoggerTest {

    @Test
    void testStudentScoresAreLogged() throws IOException, InterruptedException {
        String testFile = "test_scores.csv";
        Files.deleteIfExists(Paths.get(testFile));
        ScoreLogger logger = new ScoreLogger(testFile);
        Student alice = new Student("Alice", 1, 85);
        Student bob = new Student("Bob", 2, 90);
        Thread thread1 = new StudentThread(alice, logger);
        Thread thread2 = new StudentThread(bob, logger);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        BufferedReader reader = new BufferedReader(new FileReader(testFile));
        String firstLine = reader.readLine();
        String secondLine = reader.readLine();
        reader.close();

        assertTrue(firstLine.contains("Alice") || firstLine.contains("Bob"));
        assertTrue(secondLine.contains("Alice") || secondLine.contains("Bob"));
    }
}
