class LowercaseThread extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
}

class UppercaseThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}

public class MultithreadedLetters {
    public static void main(String[] args) {
        LowercaseThread lower = new LowercaseThread();
        UppercaseThread upper = new UppercaseThread();

        lower.start();
        upper.start();
    }
}
