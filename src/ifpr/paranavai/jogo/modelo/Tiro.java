package ifpr.paranavai.jogo.modelo;

import javax.swing.ImageIcon;

public class Tiro extends ElementoGrafico{

    private static int VELOCIDADE = 2;

    public Tiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY){
        this.carregarTiro();
        this.setPosicaoEmX(posicaoPersonagemEmX);
        this.setPosicaoEmY(posicaoPersonagemEmY);       
        this.setPosicaoEmY((getPosicaoEmY()- getAlturaImagem()/2));
    }

    public void carregarTiro() {
        ImageIcon carregandoTiro = new ImageIcon("src\\recursos\\tiro.png");
        this.setImagem(carregandoTiro.getImage());
        this.setAlturaImagem(getImagem().getHeight(null));
        this.setLarguraImagem(getImagem().getWidth(null));
    }    

    public void atualizar(){
        this.setPosicaoEmX((getPosicaoEmX()+VELOCIDADE));
    }

}
