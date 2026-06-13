package testes;

public class Hospital {

    private String nome;
    private int capacidade;
    private boolean possuiUTI;

    public Hospital(String nome, int capacidade, boolean possuiUTI) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.possuiUTI = possuiUTI;
    }

    public void realizarAtendimento(String paciente) {
        System.out.println("O paciente " + paciente +
                           " está sendo atendido no hospital " + nome);
    }

    public void adicionarLeito() {
        capacidade++;
        System.out.println("Foi adicionado mais um leito ao hospital " + nome);
    }

    public void verificarDisponibilidadeUTI() {
        if (possuiUTI) {
            System.out.println("O hospital " + nome + " possui UTI");
        } else {
            System.out.println("O hospital " + nome + " não possui UTI");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isPossuiUTI() {
        return possuiUTI;
    }

    public void setPossuiUTI(boolean possuiUTI) {
        this.possuiUTI = possuiUTI;
    }

    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital ABC", 100, true);

        System.out.println("Nome do hospital: " + hospital.getNome());
        System.out.println("Capacidade do hospital: " + hospital.getCapacidade());

        hospital.realizarAtendimento("João");
        hospital.adicionarLeito();
        hospital.verificarDisponibilidadeUTI();

        hospital.setNome("Hospital Santo Antônio");
        hospital.setCapacidade(152);
        hospital.setPossuiUTI(false);

        System.out.println("Novo nome do hospital: " + hospital.getNome());
        System.out.println("Nova capacidade do hospital: " + hospital.getCapacidade());

        hospital.verificarDisponibilidadeUTI();
    }
}