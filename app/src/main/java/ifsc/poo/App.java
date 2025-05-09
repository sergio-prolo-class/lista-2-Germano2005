/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import ifsc.poo.domain.Grade;
import ifsc.poo.domain.Navio;

public class App {
    Draw draw;

    public App() {
        draw = new Draw();
        draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        draw.setCanvasSize(1000, 600);
        draw.setXscale(0, 1000);
        draw.setYscale(0, 600);
    }
    public static void main(String[] args) {
        App app = new App();
        app.draw.show();

        app.draw.enableTimer(1); // Chama a classe Draw em 1 segundo

        Grade grade1  = new Grade(70, 70, 25, 65, 25, 65);
        grade1.desenhar(app.draw); // desenha grade 1

        Navio navio1 = new Navio(4, 60, 40, "horizontal", grade1);
        navio1.desenhar(app.draw); // Encouraçado

        Navio navio2 = new Navio(5, 100, 100, "vertical", grade1);
        navio2.desenhar(app.draw); //Porta-aviões

        Navio navio3 = new Navio(3, 140, 80, "vertical", grade1);
        navio3.desenhar(app.draw);//Cruzador

        Navio navio4 = new Navio(3, 180, 160, "vertical", grade1);
        navio4.desenhar(app.draw);//Submarino

        Navio navio5 = new Navio(2, 80, 200, "horizontal", grade1);
        navio5.desenhar(app.draw);//Contratorpedeiro

        app.draw.setPenColor(Draw.BLACK);

        Grade grade2  = new Grade(70, 70, 25, 65, 25, 65);
        grade2.desenhar(app.draw); // Grade 2 que destaca melhor a grade 1

        app.draw.setPenColor(Draw.BLACK);

        Grade grade3 = new Grade(350, 70, 310, 60, 30, 340);
        grade3.desenhar(app.draw); // Grade 3 vazia




    }
}
