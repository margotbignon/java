package advancedconcept;

public class CustomThread implements Runnable {
    @Override
    public void run() {
        System.out.println("The thread is executing...");
    }
}
