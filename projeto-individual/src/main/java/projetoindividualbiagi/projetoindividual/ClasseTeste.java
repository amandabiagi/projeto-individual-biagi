package projetoindividualbiagi.projetoindividual;

import projetoindividualbiagi.projetoindividual.item.Pocao;
import projetoindividualbiagi.projetoindividual.personagem.Adversario;
import projetoindividualbiagi.projetoindividual.personagem.Mago;

public class ClasseTeste {
    public static void main(String[] args) {

        Mago m1 = new Mago("Leoncio","Masculino",30.0);

        Pocao vida = new Pocao("Poção Vida",1,0,"Comum","vida",2);
        Pocao vida2 = new Pocao("Poção vida 2",2,0,"Raro","vida", 4);

        Adversario a1 = new Adversario("Vlad",1,8.0,3.0,1.0,50.0,5,vida);
        Adversario a2 = new Adversario("Cronu",2,12.0,8.0,0.6,90.0,10,vida);

        Loja lojinha = new Loja();
        Confronto c1 = new Confronto();

        m1.classeInicial();
        m1.exibirPersonagem();

        m1.exibirBag();

        c1.confronto(m1,a1);
        c1.confronto(m1,a1);
        c1.confronto(m1,a1);

        m1.comprarItem(lojinha,vida2);
        m1.comprarItem(lojinha,vida2);
        m1.comprarItem(lojinha,vida2);

        m1.exibirPersonagem();
        m1.exibirBag();

        m1.beberPocao(vida2);
        m1.exibirBag();

        m1.beberPocao(vida2);
        m1.exibirPersonagem();
        m1.exibirBag();

    }
}
