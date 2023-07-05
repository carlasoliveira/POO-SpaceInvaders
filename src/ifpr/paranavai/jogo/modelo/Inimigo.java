package ifpr.paranavai.jogo.modelo;

import javax.swing.ImageIcon;


public class Inimigo extends ElementoGrafico{

    private static final int VELOCIDADE = 2;

    public Inimigo(int xAleatorio, int yAleatorio) {
        this.setPosicaoEmX(xAleatorio);
        this.setPosicaoEmY(yAleatorio);
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("src\\recursos\\inimigo.png");
        this.setImagem(carregando.getImage());
        this.setAlturaImagem(getImagem().getWidth(null));
        this.setLarguraImagem(getImagem().getHeight(null));
    }

    public void atualizar() {
        this.setPosicaoEmX((this.getPosicaoEmX()- VELOCIDADE));
    }
    
}
