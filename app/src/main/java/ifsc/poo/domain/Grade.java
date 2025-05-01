package ifsc.poo.domain;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private final double altura = 20;
    private final double largura = 20;
    private int x;
    private int y;
    private int letraX;
    private int letraY;
    private int numX;
    private int numY;

    public Grade(int x, int y, int letrax, int letray, int numx, int numy) {
        this.x = x;
        this.y = y;
        this.letraX = letrax;
        this.letraY = letray;
        this.numX = numx;
        this.numY = numy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLetraX() {
        return letraX;
    }

    public void setLetraX(int letraX) {
        this.letraX = letraX;
    }

    public int getLetraY() {
        return letraY;
    }

    public void setLetraY(int letraY) {
        this.letraY = letraY;
    }

    public int getNumX() {
        return numX;
    }

    public void setNumX(int numX) {
        this.numX = numX;
    }

    public int getNumY() {
        return numY;
    }

    public void setNumY(int numY) {
        this.numY = numY;
    }

    public double getX() {
        return altura;
    }

    public double getY() {
        return largura;
    }

    public void desenhar(Draw draw){
        draw.setXscale(0, 600);
        draw.setYscale(0, 400);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                draw.square(i * altura + x, j * largura + y, 20);
            }
        }
        draw.setPenColor(Draw.RED);

        for (int i = 0; i < 10; i++) {
            draw.text(i * altura + numY, numX, String.valueOf(i));
        }


        for (int j = 0; j < 10; j++) {
            char letter = (char) ('A' + j);
            draw.text(letraX, j * largura + letraY, String.valueOf(letter));
        }

    }
}
