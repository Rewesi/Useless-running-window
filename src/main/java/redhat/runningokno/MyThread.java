package redhat.runningokno;

public class MyThread extends Thread {

    private final MyWindow localOkno;

    public MyThread(MyWindow okno) {

        this.localOkno = okno;
    }

    public void run() {
        int u = 0;
        int z = 1;
        float x = 0;
        float y = 0;

        localOkno.setLocation((int) (512 + (x * 768) * z), (int) (612 + (y * 512)));

        while (true) {

            if(localOkno.but.getText() == "Stop") {
                if ((u % 360) < 90) {
                    x = (float) (Math.sin((u) * (Math.PI / 180)));
                } else if ((u % 360) < 180) {
                    y = (float) (Math.cos((u) * (Math.PI / 180)));
                } else if ((u % 360) < 270) {
                    x = 1 + (float) (Math.sin((u) * (Math.PI / 180)));
                } else {
                    y = -1 + (float) (Math.cos((u) * (Math.PI / 180)));
                }

                localOkno.setLocation((int) (512 + (x * 768) * z), (int) (612 + (y * 512)));

                u = u + 2;
            }

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
            }
        }
    }
}
