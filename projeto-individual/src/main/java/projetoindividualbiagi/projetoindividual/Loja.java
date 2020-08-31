package projetoindividualbiagi.projetoindividual;

import projetoindividualbiagi.projetoindividual.item.Item;
import projetoindividualbiagi.projetoindividual.personagem.Personagem;

import java.util.ArrayList;
import java.util.List;


public class Loja {

    //Atributos
    private List<Item> estoque;

    public Loja() {
        this.estoque = new ArrayList<Item>();
    }

    public void adicionarItemLoja(Item i){
        estoque.add(i);
    }

    public void exibirItemLoja(){
        System.out.println("Lojinha");
        for (Item i : estoque){
            System.out.println(i);
        }
    }

    public void venderItem(Personagem p, Item i){
        if (p.getSaquinhoOuro() >= i.getValorItem()){
            p.adicionarItemBag(i);
            p.setSaquinhoOuro(p.getSaquinhoOuro() - i.getValorItem());
        }else{
            System.out.println("Aê mano, ta sem ouro.");
        }
    }

}
