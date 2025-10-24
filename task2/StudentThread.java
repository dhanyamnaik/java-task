package studentexam;

public class StudentThread extends Thread {
 private final Student student;
 private final ScoreLogger logger;

 public StudentThread(Student student, ScoreLogger logger) {
     this.student = student;
     this.logger = logger;
 }

 @Override
 public void run() {
     logger.logScore(student); 
     System.out.println(Thread.currentThread().getName() 
         + " has submitted score for " + student);
 }
}
