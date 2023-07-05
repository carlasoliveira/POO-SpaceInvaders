package ifpr.paranavai.jogo.modelo;

import javax.swing.ImageIcon;

public class SuperTiro extends ElementoGrafico{

    private static int VELOCIDADE = 2;

    public SuperTiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY){
        this.setPosicaoEmX(posicaoPersonagemEmX);
        this.setPosicaoEmY(posicaoPersonagemEmY);            
        this.setPosicaoEmY((this.getPosicaoEmY()- this.getAlturaImagem()/2));
    }

    public void carregarSuperTiro(){
        ImageIcon carregandoSuperTiro = new ImageIcon("src\\recursos\\super-tiro.png");
        this.setImagem(carregandoSuperTiro.getImage());
        this.setAlturaImagem(getImagem().getHeight(null));
        this.setLarguraImagem(getImagem().getWidth(null));
    }

    public void atualizar(){
        this.setPosicaoEmX((this.getPosicaoEmX()+VELOCIDADE));
    }

}
