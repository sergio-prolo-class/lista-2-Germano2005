package ifsc.poo.domain;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    private int tamanho; // tamanho do Navio
    private int x; // Cordenada X
    private int y; // Cordenada Y
    private String orientacao; // Orientação na Vertical ou Horizontal
    private Grade grade; // Ligação entre a grade e o navio

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

    // Método que desenha um navio
    public void desenhar(Draw draw){
        if (orientacao.equals("horizontal")){
            draw.setPenColor(Draw.BOOK_RED);
            for (int i = 0; i < tamanho; i++){ // for para imprimir os quadrados do navio na horizontal
                draw.filledSquare(i  * 20 + x, y+20, 10);
            }
        }
        else {
            draw.setPenColor(Draw.BOOK_RED);
            for (int i = 0; i < tamanho; i++){ // for para imprimir os quadrados do navio na vertical
                draw.filledSquare(x + 20, i * 20+y, 10);
            }
        }
    }

}
