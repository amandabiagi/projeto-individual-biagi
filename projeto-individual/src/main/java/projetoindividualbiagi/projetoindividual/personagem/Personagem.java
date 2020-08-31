package projetoindividualbiagi.projetoindividual.personagem;

import projetoindividualbiagi.projetoindividual.item.Item;
import projetoindividualbiagi.projetoindividual.item.Pocao;
import projetoindividualbiagi.projetoindividual.Loja;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

    //Atributos
    private String nickName;
    private Integer level;
    private String sexo;
    private Double vida;
    private Double vidaMaxima;
    private Double danoBase;
    private Double defesa;
    private String classe;
    private Double xp;
    private Double xpMeta;
    private Integer saquinhoOuro;
    private List<Item> bag;

    //Contrutor
    public Personagem(String nickName, String sexo) {
        this.nickName = nickName;
        this.sexo = sexo;
        this.bag = new ArrayList<Item>();
    }

    //Métodos
    public void atributosLevel() {
        setVidaMaxima(vidaMaxima += vidaMaxima * 0.2);
        setVida(vida += vida * 0.3);
        setDanoBase(danoBase += danoBase * 0.1);
        setDefesa(defesa += defesa * 0.03);
        setXpMeta(xpMeta += xpMeta * 0.9);
    }

    public void comprarItem(Loja loja, Item item){
        if (getSaquinhoOuro() >= item.getValorItem()){
            adicionarItemBag(item);
            setSaquinhoOuro(getSaquinhoOuro() - item.getValorItem());
        }else{
            System.out.println("Aê mano, ta sem ouro.");
        }
    }

    public void atribuirPocao(Pocao pocao){
        if (pocao.getCodigo() == 1 || pocao.getCodigo() == 2 || pocao.getCodigo() == 3){
            if ((pocao.getValorAtribuir() + getVida()) <= getVidaMaxima()) {
                System.out.println("\nglup... glup...\n");
                setVida(getVida() + pocao.getValorAtribuir());
                pocao.setQuantidadeItem(pocao.getQuantidadeItem() -1);

            }else if (pocao.getValorAtribuir() + getVida() > getVidaMaxima()){
                System.out.println("\nglup... glup...\n");
                setVida(getVidaMaxima());
                pocao.setQuantidadeItem(pocao.getQuantidadeItem() -1);
            }
        }
    }

    public void beberPocao(Pocao pocao){
        for (int cont = 0; cont < getBag().size() ; cont ++){
            if (pocao instanceof Pocao){
                atribuirPocao(pocao);
                bag.remove(pocao);
                cont = getBag().size();
            }
        }
    }

    public void levelUp(){
        if (getXp() >= getXpMeta()){
            level = level + 1;
            atributosLevel();
        }
    }

    public void adicionarItemBag(Item i){
         bag.add(i);
         i.setQuantidadeItem(i.getQuantidadeItem() + 1);
    }

    public void exibirBag(){
        for (Item i : bag) {
            if (i.getContadorItem() == 0) {
                i.setContadorItem(1);
            }
        }
        System.out.println("\nItens na Bag");
        if(bag.isEmpty()){
            System.out.println("Bag vazia");
        }else{
            for (Item i : bag) {
                if (i.getContadorItem() == 1) {
                    System.out.println(i.getNomeItem() + " Quantidade: " + i.getQuantidadeItem());
                    i.setContadorItem(0);
                }
            }
        }
    }

    public void exibirPersonagem(){
        System.out.println(String.format("%s lvl:%d \nDano base: %.2f Defesa: %.2f \nVida: %.2f \nGold: %d",
                getNickName(),getLevel(),getDanoBase(),getDefesa(),porcentagemVida(),getSaquinhoOuro()));
    }

    public Double porcentagemVida(){
        return ((getVida()/getVidaMaxima()) * 100);
    }


    public abstract void classeInicial();

    public abstract void uparClasseLevel15();

    public abstract void uparClasseLevel50();


    //ToString
    @Override
    public String toString() {
        return "\n" + nickName +
                "  lvl" + level +
                "\nVida: " + vida +
                "\nDano base: " + danoBase +
                "\nDefesa: " + defesa +
                "\nExperiência: " + xp +
                "\nSaquinho de ouro: " + saquinhoOuro +
                "\nBag: " + bag;
    }


    //Getter
    public String getNickName() {
        return nickName;
    }

    public Integer getLevel() {
        return level;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getVida() {
        return vida;
    }

    public Double getDanoBase() {
        return danoBase;
    }

    public Double getDefesa() {
        return defesa;
    }

    public String getClasse() {
        return classe;
    }

    public Double getXp() {
        return xp;
    }

    public Double getXpMeta() {
        return xpMeta;
    }

    public Integer getSaquinhoOuro() {
        return saquinhoOuro;
    }

    public Double getVidaMaxima() {
        return vidaMaxima;
    }

    public List<Item> getBag() {
        return bag;
    }

    //Setter
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setDanoBase(Double danoBase) {
        this.danoBase = danoBase;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public void setXpMeta(Double xpMeta) {
        this.xpMeta = xpMeta;
    }

    public void setSaquinhoOuro(Integer saquinhoOuro) {
        this.saquinhoOuro = saquinhoOuro;
    }

    public void setVidaMaxima(Double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }
}


