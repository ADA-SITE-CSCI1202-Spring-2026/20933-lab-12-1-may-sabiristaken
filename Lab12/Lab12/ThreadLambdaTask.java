public class ThreadLambdaTask {

    public static void main(String[] args) {

        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        numberThread.start();

        System.out.println("Main method finished.");
    }
}