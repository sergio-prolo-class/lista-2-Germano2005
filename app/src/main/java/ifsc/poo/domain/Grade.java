package ifsc.poo.domain;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int altura;
    private int largura;
    private Draw draw;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public Draw getDraw() {
        return draw;
    }

    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    public void desenhar(Draw draw){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 0; j++){
                draw.square(i * 10, j * 10, 20);
            }
        }
    }
}
