package ifsc.poo.domain;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    private int tamanho;
    private int x;
    private int y;
    private String orientacao;
    private Grade grade;

    public Navio(int tamanho, int x, int y, String orientacao, Grade grade) {
        this.tamanho = tamanho;
        this.x = x;
        this.y = y;
        this.orientacao = orientacao;
        this.grade = grade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void desenhar(Draw draw){
        if (orientacao.equals("vertical")){
            draw.setPenColor(Draw.BLUE);
            for (int i = 0; i < tamanho; i++){
                for (int j = 0; j < tamanho; j++){
                    draw.filledSquare(i * x + 70, j * y + 70, 20);
                }
            }
        }
        else {

        }
    }

}
