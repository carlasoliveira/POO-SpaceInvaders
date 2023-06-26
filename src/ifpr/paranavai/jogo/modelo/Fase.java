package ifpr.paranavai.jogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements KeyListener, ActionListener{
    private Image fundo;
    private Personagem personagem;
    private Timer timer;

    private static final int DELAY = 5;
    private static final int VELOCIDADE_DE_DESLOCAMENTO = 3;

    private static final int LARGURA_DA_JANELA = 1024;

    public Fase(){
        this.setFocusable(true);
        this.setDoubleBuffered(true);
        ImageIcon carregando = new ImageIcon("src\\recursos\\fundo-game.png");
        this.fundo = carregando.getImage();
        personagem = new Personagem(VELOCIDADE_DE_DESLOCAMENTO);
        personagem.carregar();
        addKeyListener(this);
        this.timer = new Timer(DELAY, this);
        this.timer.start();
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(personagem.getImagemPersonagem(), personagem.getPosicaoX(), personagem.getPosicaoY(), this);
        ArrayList<Tiro> tiros = personagem.getTiros();
        ArrayList<SuperTiro> superTiros = personagem.getSuperTiros();
        for(Tiro tiro: tiros){
            tiro.carregarTiro();
            graficos.drawImage(tiro.getImagemTiro(), tiro.getPosicaoEmX(), tiro.getPosicaoEmY(), this);
        }
        for (SuperTiro tiro: superTiros){
            tiro.carregarSuperTiro();
            graficos.drawImage(tiro.getImagemSuperTiro(), tiro.getPosicaoEmX(), tiro.getPosicaoEmY(), this);
        }
        g.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            this.personagem.atirar();
        } else if(e.getKeyCode() == KeyEvent.VK_Q){
            this.personagem.atirarSuper();
        } else {
            this.personagem.mover(e);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.personagem.parar(e);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.personagem.atualizar();
        ArrayList<Tiro> tiros = personagem.getTiros();
        for (int i = 0; i < tiros.size(); i++) {
            if (tiros.get(i).getPosicaoEmX() > LARGURA_DA_JANELA){
                tiros.remove(i);
            } else {
                tiros.get(i).atualizar();
            }
        }
        ArrayList<SuperTiro> superTiros = personagem.getSuperTiros();
        for (int i = 0; i < superTiros.size(); i++) {
            if (superTiros.get(i).getPosicaoEmX() > LARGURA_DA_JANELA){
                superTiros.remove(i);
            } else {
                superTiros.get(i).atualizar();
            }
        }
        repaint();
    }
}
