package projetoindividualbiagi.projetoindividual;

import projetoindividualbiagi.projetoindividual.personagem.Adversario;
import projetoindividualbiagi.projetoindividual.personagem.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Confronto {
    private List<Personagem> listaPersonagem;
    private List<Adversario> listaAdversario;


    //Construtor
    public Confronto() {
        this.listaPersonagem = new ArrayList<Personagem>();
        this.listaAdversario = new ArrayList<Adversario>();
    }


    //Método
    public void adicionarPersonagem(Personagem p){
        listaPersonagem.add(p);
    }
    public void adicionarAdversario(Adversario a){
        listaAdversario.add(a);
    }

    public void exibirPersonagem(){
        System.out.println(listaPersonagem);
    }

    public void confronto(Personagem p, Adversario a) {
        System.out.println(String.format("\nCombate [%s X %s] \n",p.getNickName(),a.getNickNameAdv()));
        do {
            a.setVidaAdv((a.getVidaAdv() - p.getDanoBase()) + a.getDefesaAdv());
            if (a.getVidaAdv() > 0) {
                p.setVida((p.getVida() - a.getDanoBaseAdv()) + p.getDefesa());
            }
        } while (a.getVidaAdv() <= 0 || p.getVida() <= 0);

        if (p.getVida() > 0) {
            p.levelUp();
            p.setXp(p.getXp() + a.getXpAdv());
            a.quantOuro();
            p.setSaquinhoOuro(p.getSaquinhoOuro() + a.getOuroDrop());
            a.getItemDrop().sortearRaridade();
                if (a.getItemDrop().getRaridade() == "Comum" && a.getItemDrop().getNivelRaridade() <= 50) {
                    p.adicionarItemBag(a.getItemDrop());
                } else if (a.getItemDrop().getRaridade() == "Raro" && a.getItemDrop().getNivelRaridade() > 50 && a.getItemDrop().getNivelRaridade() <= 85) {
                    p.adicionarItemBag(a.getItemDrop());
                } else if(a.getItemDrop().getRaridade() == "Epico" && a.getItemDrop().getNivelRaridade() > 85 && a.getItemDrop().getNivelRaridade() <= 100){
                    p.adicionarItemBag(a.getItemDrop());
                }
        }
    }

}

