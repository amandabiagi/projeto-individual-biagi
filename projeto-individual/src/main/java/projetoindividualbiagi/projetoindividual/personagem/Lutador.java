package projetoindividualbiagi.projetoindividual.personagem;

public class Lutador extends Personagem {

    //Atributos
    private Double danoFisico;

    //Construtor
    public Lutador(String nickName, String sexo, Double danoFisico) {
        super(nickName, sexo);
        this.danoFisico = danoFisico;
    }

    //Métodos
    @Override
    public void classeInicial() {
        setLevel(1);
        setClasse("Lutador") ;
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
        setClasse("Guerreiro");
    }

    @Override
    public void uparClasseLevel50() {
        setClasse("Paladino");
    }

    //ToString

    @Override
    public String toString() {
        return "Lutador{" +
                "danoFisico=" + danoFisico +
                '}';
    }

    //Getter
    public Double getDanoFisico() {
        return danoFisico;
    }

    //Setter
    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }
}
