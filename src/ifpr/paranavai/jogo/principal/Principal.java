package ifpr.paranavai.jogo.principal;

import javax.swing.JFrame;
import ifpr.paranavai.jogo.modelo.Fase;

public class Principal extends JFrame{

    public Principal(){
        Fase fase = new Fase();
        super.add(fase);
        super.setTitle("Space Invaders - POO");
        super.setSize(1024, 728);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
