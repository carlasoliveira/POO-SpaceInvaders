package ifpr.paranavai.jogo.modelo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Personagem {
    private int posicaoX;
    private int posicaoY;

    private int deslocamentoEmX;
    private int deslocamentoEmY;

    private Image imagemPersonagem;
    private int larguraImagem;
    private int alturaImagem;  
    
    public Personagem(){
        this.posicaoX = 100;
        this.posicaoY = 100;
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("src\\recursos\\espaconave.png");
        this.imagemPersonagem = carregando.getImage();
        this.alturaImagem = this.imagemPersonagem.getWidth(null);
        this.larguraImagem = this.imagemPersonagem.getHeight(null);
    }


    public int getPosicaoX() {
        return this.posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return this.posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getDeslocamentoEmX() {
        return this.deslocamentoEmX;
    }

    public void setDeslocamentoEmX(int deslocamentoEmX) {
        this.deslocamentoEmX = deslocamentoEmX;
    }

    public int getDeslocamentoEmY() {
        return this.deslocamentoEmY;
    }

    public void setDeslocamentoEmY(int deslocamentoEmY) {
        this.deslocamentoEmY = deslocamentoEmY;
    }

    public Image getImagemPersonagem() {
        return this.imagemPersonagem;
    }

    public void setImagemPersonagem(Image imagemPersonagem) {
        this.imagemPersonagem = imagemPersonagem;
    }

    public int getLarguraImagem() {
        return this.larguraImagem;
    }

    public void setLarguraImagem(int larguraImagem) {
        this.larguraImagem = larguraImagem;
    }

    public int getAlturaImagem() {
        return this.alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }

}
