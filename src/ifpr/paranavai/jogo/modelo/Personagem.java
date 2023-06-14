package ifpr.paranavai.jogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Personagem {
    private int posicaoX;
    private int posicaoY;

    private int deslocamentoEmX;
    private int deslocamentoEmY;

    private Image imagemPersonagem;
    private int larguraImagem;
    private int alturaImagem;  

    private int velocidadeDeslocamento;

    private static final int POSICAO_INICIAL_EM_X = 100;
    private static final int POSICAO_INICIAL_EM_Y = 100;

    
    public Personagem(int velocidadeDeslocamento){
        this.posicaoX = 100;
        this.posicaoY = 100;
        this.velocidadeDeslocamento = velocidadeDeslocamento;
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("src\\recursos\\espaconave.png");
        this.imagemPersonagem = carregando.getImage();
        this.alturaImagem = this.imagemPersonagem.getWidth(null);
        this.larguraImagem = this.imagemPersonagem.getHeight(null);
    }

    public void atualizar(){
        this.posicaoX = this.posicaoX + this.deslocamentoEmX;
        this.posicaoY = this.posicaoY + this.deslocamentoEmY;
    }

    public void mover(KeyEvent tecla){
        int codigoTecla = tecla.getKeyCode();
        switch (codigoTecla) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = -this.velocidadeDeslocamento;
                break;

            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = this.velocidadeDeslocamento;
                break;

            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = -this.velocidadeDeslocamento;
                break;

            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmX = this.velocidadeDeslocamento;
                break;
        }
    }

    public void parar(KeyEvent tecla){
        int codigoTecla = tecla.getKeyCode();
        switch (codigoTecla) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = 0;
                break;

            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = 0;
                break;

            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = 0;
                break;

            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmX = 0;
                break;
        }
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
