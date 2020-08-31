package projetoindividualbiagi.projetoindividual.item;

import projetoindividualbiagi.projetoindividual.personagem.Personagem;

public class Pocao extends Item {

    //Atributos
    private String tipoPocao;
    private Integer valorAtribuir;


    //Construtor
    public Pocao(String nomeItem, Integer codigo, Integer valorItem, String raridade, String tipoPocao, Integer valorAtribuir) {
        super(nomeItem, codigo, valorItem, raridade);
        this.tipoPocao = tipoPocao;
        this.valorAtribuir = valorAtribuir;
    }

    //Metodos

    //Passar esses métodos para a classe Personagem,
    // o projetoindividualbiagi.projetoindividual.personagem temque beber a poção não a poção beber o projetoindividualbiagi.projetoindividual.personagem.
    public void atribuirPocao(Personagem p, Item i){
        if (getCodigo() == 1 || getCodigo() == 2 || getCodigo() == 3){
            if ((valorAtribuir + p.getVida()) <= p.getVidaMaxima()) {
                System.out.println("\nglup... glup..");
                p.setVida(p.getVida() + valorAtribuir);
                i.setQuantidadeItem(i.getQuantidadeItem() -1);


           }else if (valorAtribuir + p.getVida() > p.getVidaMaxima()){
               System.out.println("\nglup... glup..");
               p.setVida(p.getVidaMaxima());
               i.setQuantidadeItem(i.getQuantidadeItem() -1);
            }
        }
    }

    public void buscarItem(Personagem p, Item i){
        for (int cont = 0; cont < p.getBag().size() ; cont ++){
            if (i instanceof Pocao){
                    atribuirPocao(p,i);
                    p.getBag().remove(i);
                    return;
            }
        }
    }

    //Getter

    public String getTipoPocao() {
        return tipoPocao;
    }

    public Integer getValorAtribuir() {
        return valorAtribuir;
    }
}


