package projetoindividualbiagi.projetoindividual.personagem;

import projetoindividualbiagi.projetoindividual.item.Item;

import java.util.Random;

public class Adversario {

    //Atributos
    private String nickNameAdv;
    private Integer levelAdv;
    private Double vidaAdv;
    private Double danoBaseAdv;
    private Double defesaAdv;
    private Double xpAdv;
    private Integer ouro;
    private Integer ouroDrop;
    private Item itemDrop;

    //Construtor
    public Adversario(String nickNameAdv, Integer levelAdv, Double vidaAdv, Double danoBaseAdv, Double defesaAdv, Double xpAdv, Integer ouro, Item itemDrop) {
        this.nickNameAdv = nickNameAdv;
        this.levelAdv = levelAdv;
        this.vidaAdv = vidaAdv;
        this.danoBaseAdv = danoBaseAdv;
        this.defesaAdv = defesaAdv;
        this.xpAdv = xpAdv;
        this.ouro = ouro;
        this.itemDrop = itemDrop;
    }

    //Método
    public void quantOuro(){
        Random geradorMoeda = new Random();
        ouroDrop = geradorMoeda.nextInt(ouro);
        setOuroDrop(ouroDrop);
    }


    //Getter
    public Integer getOuroDrop() {
        return ouroDrop;
    }

    public String getNickNameAdv() {
        return nickNameAdv;
    }

    public Integer getLevelAdv() {
        return levelAdv;
    }

    public Double getVidaAdv() {
        return vidaAdv;
    }

    public Double getDanoBaseAdv() {
        return danoBaseAdv;
    }

    public Double getDefesaAdv() {
        return defesaAdv;
    }

    public Double getXpAdv() {
        return xpAdv;
    }

    public Integer getOuro() {
        return ouro;
    }

    public Item getItemDrop() {
        return itemDrop;
    }

    //Setter

    public void setOuroDrop(Integer ouroDrop) {
        this.ouroDrop = ouroDrop;
    }

    public void setNickNameAdv(String nickNameAdv) {
        this.nickNameAdv = nickNameAdv;
    }

    public void setLevelAdv(Integer levelAdv) {
        this.levelAdv = levelAdv;
    }

    public void setVidaAdv(Double vidaAdv) {
        this.vidaAdv = vidaAdv;
    }

    public void setDanoBaseAdv(Double danoBaseAdv) {
        this.danoBaseAdv = danoBaseAdv;
    }

    public void setDefesaAdv(Double defesaAdv) {
        this.defesaAdv = defesaAdv;
    }

    public void setXpAdv(Double xpAdv) {
        this.xpAdv = xpAdv;
    }

    public void setOuro(Integer ouro) {
        this.ouro = ouro;
    }
}


