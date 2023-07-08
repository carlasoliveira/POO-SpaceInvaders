package ifpr.paranavai.jogo.principal;

import javax.swing.JFrame;
import ifpr.paranavai.jogo.modelo.FaseUm;

public class Principal extends JFrame{

    public Principal(){
        FaseUm fase = new FaseUm();
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
