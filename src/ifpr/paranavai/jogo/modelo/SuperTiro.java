package ifpr.paranavai.jogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class SuperTiro{
    
    private Image imagemSuperTiro;
    private int larguraImagemSuperTiro;
    private int alturaImagemSuperTiro;

    private int posicaoEmX;
    private int posicaoEmY;

    private static int VELOCIDADE = 2;

    public SuperTiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY){
        this.posicaoEmX = posicaoPersonagemEmX;
        this.posicaoEmY = posicaoPersonagemEmY;
    }

    public void carregarSuperTiro(){
        ImageIcon carregandoSuperTiro = new ImageIcon("src\\recursos\\super-tiro.png");
        this.imagemSuperTiro = carregandoSuperTiro.getImage();
        this.alturaImagemSuperTiro = this.imagemSuperTiro.getWidth(null);
        this.larguraImagemSuperTiro = this.imagemSuperTiro.getHeight(null);
    }

    public Image getImagemSuperTiro() {
        return this.imagemSuperTiro;
    }

    public void setImagemSuperTiro(Image imagemSuperTiro) {
        this.imagemSuperTiro = imagemSuperTiro;
    }

    public void atualizar(){
        this.posicaoEmX = this.posicaoEmX + VELOCIDADE;
    }


    public int getLarguraImagemSuperTiro() {
        return this.larguraImagemSuperTiro;
    }

    public void setLarguraImagemSuperTiro(int larguraImagemSuperTiro) {
        this.larguraImagemSuperTiro = larguraImagemSuperTiro;
    }

    public int getAlturaImagemSuperTiro() {
        return this.alturaImagemSuperTiro;
    }

    public void setAlturaImagemSuperTiro(int alturaImagemSuperTiro) {
        this.alturaImagemSuperTiro = alturaImagemSuperTiro;
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

}
