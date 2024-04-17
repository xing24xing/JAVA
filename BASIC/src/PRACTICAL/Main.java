 import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new SurfacePane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public interface Surface {
        public Dimension getSize();

        public void repaint();
    }

    public class SurfacePane extends JPanel implements Surface {
        public SurfacePane() {
            setLayout(null);
            for (int index = 0; index < 5; index++) {
                Ball ball = new Ball(
                        /* Random positions from 0 to windowWidth or windowHeight */
                        (int) Math.floor(Math.random() * 400),
                        (int) Math.floor(Math.random() * 400),
                        /* Random size from 10 to 30 */
                        (int) Math.floor(Math.random() * 20) + 10,
                        /* Random RGB colors*/
                        new Color(
                                (int) Math.floor((Math.random() * 256)),
                                (int) Math.floor((Math.random() * 256)),
                                (int) Math.floor((Math.random() * 256))
                        ),
                        /* Random velocities from -5 to 5 */
                        (int) Math.floor((Math.random() * 10) - 5),
                        (int) Math.floor((Math.random() * 10) - 5),
                        this
                );
                add(ball);
                ball.start();
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 400);
        }
    }

    public class Ball extends JPanel {
        private int posX, posY, size;
        private Color color;

        private int vx = 5;
        private int vy = 5;

        private Surface surface;
        private Timer timer;

        public Ball(int posX, int posY, int size, Color color, int vx, int vy, Surface surface) {
            this.posX = posX;
            this.posY = posY;
            this.size = size;
            this.color = color;
            this.vx = vx;
            this.vy = vy;
            this.surface = surface;
            setBackground(color);
            setSize(size, size);
            setOpaque(false);
        }

        public void start() {
            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    update();
                    surface.repaint();
                }
            });
            timer.start();
        }

        public void stop() {
            if (timer == null) {
                return;
            }
            timer.stop();
        }

        protected void update() {
            int width = surface.getSize().width;
            int height = surface.getSize().height;
            if (posX > width || posX < 0) {
                vx *= -1;
            }

            if (posY > height || posY < 0) {
                vy *= -1;
            }

            if (posX > width) {
                posX = width;
            }

            if (posX < 0) {
                posX = 0;
            }

            if (posY > height) {
                posY = height;
            }

            if (posY < 0) {
                posY = 0;
            }

            this.posX += vx;
            this.posY += vy;

            setLocation(posX, posY);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
            g.setColor(color);
            g.fillOval(0, 0, size, size);
        }
    }
}