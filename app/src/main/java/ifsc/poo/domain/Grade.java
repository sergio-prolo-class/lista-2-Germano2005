package ifsc.poo.domain;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private final double x = 20;
    private final double y = 20;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void desenhar(Draw draw){
        draw.setXscale(0, 600);
        draw.setYscale(0, 400);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                draw.square(i * x + 70, j * y + 70, 20);
            }
        }
        draw.setPenColor(Draw.RED);

        for (int i = 0; i < 10; i++) {
            draw.text(i * x + 65, 25, String.valueOf(i));
        }


        for (int j = 0; j < 10; j++) {
            char letter = (char) ('A' + j);
            draw.text(25, j * y + 65, String.valueOf(letter));
        }
    }
}
