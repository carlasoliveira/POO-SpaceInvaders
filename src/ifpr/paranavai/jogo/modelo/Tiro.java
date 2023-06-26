package ifpr.paranavai.jogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tiro {
    
    private int posicaoEmX;
    private int posicaoEmY;

    private Image imagemTiro;
    private int larguraImagemTiro;
    private int alturaImagemTiro;

    private static int VELOCIDADE = 2;

    public Tiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY){
        this.posicaoEmX = posicaoPersonagemEmX;
        this.posicaoEmY = posicaoPersonagemEmY;
    }

    public void carregarTiro() {
        ImageIcon carregandoTiro = new ImageIcon("src\\recursos\\tiro.png");
        this.imagemTiro = carregandoTiro.getImage();
        this.alturaImagemTiro = this.imagemTiro.getWidth(null);
        this.larguraImagemTiro = this.imagemTiro.getHeight(null);        
    }    

    public void atualizar(){
          this.posicaoEmX = this.posicaoEmX + VELOCIDADE;
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

    public Image getImagemTiro() {
        return this.imagemTiro;
    }

    public void setImagemTiro(Image imagemTiro) {
        this.imagemTiro = imagemTiro;
    }

    public int getLarguraImagemTiro() {
        return this.larguraImagemTiro;
    }

    public void setLarguraImagemTiro(int larguraImagemTiro) {
        this.larguraImagemTiro = larguraImagemTiro;
    }

    public int getAlturaImagemTiro() {
        return this.alturaImagemTiro;
    }

    public void setAlturaImagemTiro(int alturaImagem) {
        this.alturaImagemTiro = alturaImagem;
    }

}
