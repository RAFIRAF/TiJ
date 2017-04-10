package interfaces.nesting;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 300;
    public static final int HEIGHT = WIDTH / 16 * 12;
    public static final int SCALE = 3;
    public static String TITLE = "Thank You";

    private boolean running = false;
    private Thread thread;

    private final int[] pixels;

    private final BufferedImage screenImage;

    private JFrame frame;
    private Canvas canvas;

    public Game() {
        frame = getJFrame();
        canvas = getCanvas();
        frame.add(canvas);
        frame.pack();
        start();
        screenImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        pixels = ((DataBufferInt) screenImage.getRaster().getDataBuffer()).getData();

    }

    public synchronized void start() {
        thread = new Thread(this, "MainThread");
        thread.start();
        running = true;

    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public JFrame getJFrame() {

        JFrame frame = new JFrame(TITLE);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        return frame;
    }

    public Canvas getCanvas() {

        Canvas canvas = new Canvas();
        Dimension d = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
        canvas.setPreferredSize(d);
        canvas.setMaximumSize(d);
        canvas.setMinimumSize(d);

        return canvas;
    }

    public void run() {

        while (running) {

            render();
            update();

        }

    }

    public void render() {

        BufferStrategy bs = canvas.getBufferStrategy();
        if (bs == null) {
            canvas.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();


        g.drawImage(screenImage, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
        for (int x = 0; x < WIDTH * SCALE; x += 200) {
            for (int y = 0; y < HEIGHT * SCALE; y += 100) {

                g.setColor(Color.RED);
                g.drawString("THANK YOU JAMES GOSLING", x, y);

            }
        }


        g.dispose();
        bs.show();

    }

    public void update() {

    }

    public static void main(String[] args) {
        new Game();
    }
}