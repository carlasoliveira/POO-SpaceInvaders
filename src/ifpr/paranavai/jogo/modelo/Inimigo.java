package ifpr.paranavai.jogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;


public class Inimigo {
    private int posicaoEmX;
    private int posicaoEmY;

    private Image imagemInimigo;

    private int larguraImagemInimigo;
    private int alturaImagemInimigo;

    private static final int VELOCIDADE = 2;

    public Inimigo(int xAleatorio, int yAleatorio) {
    this.posicaoEmX = xAleatorio;
    this.posicaoEmY = yAleatorio;
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("src\\recursos\\inimigo.png");
        this.imagemInimigo = carregando.getImage();
        this.alturaImagemInimigo = this.imagemInimigo.getWidth(null);
        this.larguraImagemInimigo = this.imagemInimigo.getHeight(null);
    }

    public void atualizar() {
        this.posicaoEmX = this.posicaoEmX - VELOCIDADE;
    }


    public int getPosicaoEmX() {
        return this.posicaoEmX;
    }

    public void setPosicaoEmX(int posicaoEmX) {
        this.posicaoEmX = posicaoEmX;
    }

    public int getPosicaoEmY() {
        return this.posicaoEmY;
    }

    public void setPosicaoEmY(int posicaoEmY) {
        this.posicaoEmY = posicaoEmY;
    }

    public Image getImagemInimigo() {
        return this.imagemInimigo;
    }

    public void setImagemInimigo(Image imagemInimigo) {
        this.imagemInimigo = imagemInimigo;
    }

    public int getLarguraImagemInimigo() {
        return this.larguraImagemInimigo;
    }

    public void setLarguraImagemInimigo(int larguraImagemInimigo) {
        this.larguraImagemInimigo = larguraImagemInimigo;
    }

    public int getAlturaImagemInimigo() {
        return this.alturaImagemInimigo;
    }

    public void setAlturaImagemInimigo(int alturaImagemInimigo) {
        this.alturaImagemInimigo = alturaImagemInimigo;
    }

}
