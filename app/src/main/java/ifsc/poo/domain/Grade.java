package ifsc.poo.domain;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private final double tamanho = 20; //Tamanho dos quadrados da Grade em Pixels
    private int x; // Cordenadas X da grade
    private int y; // Cordenadas Y da grade
    private int letraX; // Cordenadas X das letras
    private int letraY; // Cordenadas Y das letras
    private int numX; // Cordenadas X dos numeros
    private int numY; // Cordenadas Y dos números

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

    public double getTamanho() {
        return tamanho;
    }

    //Método que desenha uma grade
    public void desenhar(Draw draw){
        draw.setXscale(0, 600);
        draw.setYscale(0, 400);
        //For que desenha uma matriz de quadrados e fazer uma grade
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                draw.square(i * tamanho + x, j * tamanho + y, 20);
            }
        }
        draw.setPenColor(Draw.BOOK_RED); // seta a cor das letras e números

        //for para fazer os números de 0 a 9 e retornar em forma de String
        for (int i = 0; i < 10; i++) {
            draw.text(i * tamanho + numY, numX, String.valueOf(i));
        }


        //for para fazer as letras de A até J e retornar em forma de String
        for (int j = 0; j < 10; j++) {
            char letra = (char) ('A' + j);
            draw.text(letraX, j * tamanho + letraY, String.valueOf(letra));
        }

    }
}
