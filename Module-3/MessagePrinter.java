class MessagePrinter extends Thread {
    private String message;
    public MessagePrinter(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
    public static void main(String[] args) {
        MessagePrinter thread1 = new MessagePrinter("Hello from Thread 1");
        MessagePrinter thread2 = new MessagePrinter("Hello from Thread 2");
        thread1.start();
        thread2.start();
    }
}
