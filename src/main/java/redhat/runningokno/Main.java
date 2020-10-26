package redhat.runningokno;

public class Main {
    public static void main(String[] args) {
        MyWindow okno = new MyWindow("Testik");
        okno.setResizable(true);
        okno.setVisible(true);

        MyThread myThread = new MyThread(okno);
        myThread.start();
    }
}
