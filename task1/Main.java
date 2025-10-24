package studentexam;
public class Main {
    public static void main(String[] args) {
        String fileName = "student_scores.csv";
        ScoreLogger logger = new ScoreLogger(fileName);
        Student dhanya = new Student("Dhanya", 101, 95);
        Student Trupti = new Student("Trupti", 102, 88);
        Student diti = new Student("diti", 103, 76);
        Student disha = new Student("disha", 104, 90);
        Thread dhanyaThread = new StudentThread(dhanya, logger);
        Thread TruptiThread = new StudentThread(Trupti, logger);
        Thread ditiThread = new StudentThread(diti, logger);
        Thread dishaThread = new StudentThread(disha, logger);
        dhanyaThread.start();
        TruptiThread.start();
        ditiThread.start();
        dishaThread.start();
        try {
            dhanyaThread.join();
            TruptiThread.join();
            ditiThread.join();
            dishaThread.join();
        } catch (InterruptedException e) {
            System.out.println("Oops! A thread was interrupted: " + e.getMessage());
        }

        System.out.println("All student scores have been logged successfully!");
    }
}
