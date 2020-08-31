package projetoindividualbiagi.projetoindividual.personagem;

public class Mago extends Personagem {

    //Atributos
    private Double danoMagico;

    //Contrutor
    public Mago(String nickName, String sexo, Double danoMagico) {
        super(nickName, sexo);
        this.danoMagico = danoMagico;
    }

    //Métodos
    @Override
    public void classeInicial() {
        setLevel(1);
        setClasse("Mago") ;
        setVidaMaxima(10.0);
        setVida(10.0);
        setDanoBase(2.0);
        setDefesa(1.0);
        setXp(0.0);
        setXpMeta(100.0);
        setSaquinhoOuro(0);
    }

    @Override
    public void uparClasseLevel15() {
        setClasse("Bruxo");
    }

    @Override
    public void uparClasseLevel50() {
        setClasse("Necromante");
    }


    //ToString
    @Override
    public String toString() {
        return "\nClasse Mago" +
                super.toString() +
                "\nDano mágico: " + danoMagico ;
    }

    //Getter
    public Double getDanoMagico() {
        return danoMagico;
    }

    //Setter
    public void setDanoMagico(Double danoMagico) {
        this.danoMagico = danoMagico;
    }
}
