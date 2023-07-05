package ifpr.paranavai.jogo.modelo;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Personagem extends ElementoGrafico{
    private int deslocamentoEmX;
    private int deslocamentoEmY;

    private int velocidadeDeslocamento;

    private ArrayList<Tiro> tiros;
    private ArrayList<SuperTiro> superTiros;

    private static final int POSICAO_INICIAL_EM_X = 0;
    private static final int POSICAO_INICIAL_EM_Y = 0;

    public Personagem(int velocidadeDeslocamento) {
        setPosicaoEmX(POSICAO_INICIAL_EM_X);
        setPosicaoEmY(POSICAO_INICIAL_EM_Y);
        this.velocidadeDeslocamento = velocidadeDeslocamento;
        this.tiros = new ArrayList<Tiro>();
        this.superTiros = new ArrayList<SuperTiro>();
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("src\\recursos\\espaconave.png");
        this.setImagem(carregando.getImage());
        this.setAlturaImagem(this.getImagem().getHeight(null));
        this.setLarguraImagem(this.getImagem().getWidth(null));
    }

    public void atualizar() {
        this.setPosicaoEmX((this.getPosicaoEmX() + this.getDeslocamentoEmX()));
        this.setPosicaoEmY((this.getPosicaoEmY() + this.getDeslocamentoEmY()));
    }

    public void mover(KeyEvent tecla) {
        int codigoTecla = tecla.getKeyCode();
        switch (codigoTecla) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = -this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_W:
                this.deslocamentoEmY = -this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_S:
                this.deslocamentoEmY = this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = -this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_A:
                this.deslocamentoEmX = -this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmX = this.velocidadeDeslocamento;
                break;
            case KeyEvent.VK_D:
                this.deslocamentoEmX = this.velocidadeDeslocamento;
                break;
        }
    }

    public void parar(KeyEvent tecla) {
        int codigoTecla = tecla.getKeyCode();
        switch (codigoTecla) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_W:
                this.deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_S:
                this.deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = 0;
                break;
            case KeyEvent.VK_A:
                this.deslocamentoEmX = 0;
                break;
            case KeyEvent.VK_RIGHT:
                this.deslocamentoEmX = 0;
                break;
            case KeyEvent.VK_D:
                this.deslocamentoEmX = 0;
                break;
        }
    }

    public void atirar() {
        int frenteNave = this.getPosicaoEmX() + this.getLarguraImagem();
        int meioNave = this.getPosicaoEmY() + (this.getAlturaImagem() / 2);
        Tiro tiro = new Tiro(frenteNave, meioNave);
        this.tiros.add(tiro);
    }

    public void atirarSuper() {
        int frenteNave = this.getPosicaoEmX() + this.getLarguraImagem();
        int meioNave = this.getPosicaoEmY() + (this.getAlturaImagem() / 2);
        SuperTiro superTiro = new SuperTiro(frenteNave, meioNave);
        this.superTiros.add(superTiro);
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
    
    public int getVelocidadeDeslocamento() {
        return this.velocidadeDeslocamento;
    }

    public void setVelocidadeDeslocamento(int velocidadeDeslocamento) {
        this.velocidadeDeslocamento = velocidadeDeslocamento;
    }

    public ArrayList<Tiro> getTiros() {
        return this.tiros;
    }

    public void setTiros(ArrayList<Tiro> tiros) {
        this.tiros = tiros;
    }

    public ArrayList<SuperTiro> getSuperTiros() {
        return this.superTiros;
    }

    public void setSuperTiros(ArrayList<SuperTiro> superTiros) {
        this.superTiros = superTiros;
    }

}