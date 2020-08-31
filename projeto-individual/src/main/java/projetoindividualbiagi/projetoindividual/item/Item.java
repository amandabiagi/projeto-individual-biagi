package projetoindividualbiagi.projetoindividual.item;

import java.util.Random;

public abstract class Item {

    //Atributos
    private String nomeItem;
    private Integer codigo;
    private Integer valorItem;
    private String raridade;
    private Integer nivelRaridade;
    private Integer quantidadeItem;
    private Integer contadorItem;


    //Construtor
    public Item(String nomeItem, Integer codigo,Integer valorItem, String raridade) {
        this.nomeItem = nomeItem;
        this.codigo = codigo;
        this.valorItem = valorItem;
        this.raridade = raridade;
        this.nivelRaridade = nivelRaridade;
        this.quantidadeItem = 0;
        this.contadorItem = 1;
    }

    //Métodos
    public void sortearRaridade(){
        Random sortearRaridade = new Random();
        nivelRaridade = sortearRaridade.nextInt(100);
    }

    //ToString
    @Override
    public String toString() {
        return "\nItem{" +
                "\nnomeItem='" + nomeItem +
                "\ncodigo=" + codigo +
                "\nvalorItem=" + valorItem +
                "\nraridade='" + raridade +
                "\nnivelRaridade=" + nivelRaridade +
                "\nquantidadeItem=" + quantidadeItem +
                "\ncontadorItem=" + contadorItem ;
    }

    //Getter
    public String getNomeItem() {
        return nomeItem;
    }

    public String getRaridade() {
        return raridade;
    }

    public Integer getQuantidadeItem() {
        return quantidadeItem;
    }

    public Integer getNivelRaridade() {
        return nivelRaridade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getValorItem() {
        return valorItem;
    }

    public Integer getContadorItem() {
        return contadorItem;
    }

    //Setter


    public void setContadorItem(Integer contadorItem) {
        this.contadorItem = contadorItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setValorItem(Integer valorItem) {
        this.valorItem = valorItem;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setNivelRaridade(Integer nivelRaridade) {
        this.nivelRaridade = nivelRaridade;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
}
