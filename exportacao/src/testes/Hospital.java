package testes;

public class Hospital { // Declaração da classe Hospital

    private String nome; // Atributo que armazena o nome do hospital
    private int capacidade; // Atributo que armazena a quantidade de leitos
    private boolean possuiUTI; // Atributo que indica se o hospital possui UTI

    // Construtor da classe, utilizado para criar objetos Hospital
    public Hospital(String nome, int capacidade, boolean possuiUTI) {
        this.nome = nome; // Inicializa o atributo nome
        this.capacidade = capacidade; // Inicializa o atributo capacidade
        this.possuiUTI = possuiUTI; // Inicializa o atributo possuiUTI
    }

    // Método que simula o atendimento de um paciente
    public void realizarAtendimento(String paciente) {
        System.out.println("O paciente " + paciente +
                           " está sendo atendido no hospital " + nome);
        // Exibe uma mensagem informando o atendimento do paciente
    }

    // Método que adiciona um leito à capacidade do hospital
    public void adicionarLeito() {
        capacidade++; // Incrementa a capacidade em 1
        System.out.println("Foi adicionado mais um leito ao hospital " + nome);
        // Exibe mensagem informando a adição do leito
    }

    // Método que verifica se o hospital possui UTI
    public void verificarDisponibilidadeUTI() {
        if (possuiUTI) { // Verifica se possuiUTI é verdadeiro
            System.out.println("O hospital " + nome + " possui UTI");
            // Exibe mensagem caso possua UTI
        } else { // Caso não possua UTI
            System.out.println("O hospital " + nome + " não possui UTI");
            // Exibe mensagem caso não possua UTI
        }
    }

    // Método getter para obter o nome do hospital
    public String getNome() {
        return nome; // Retorna o valor do atributo nome
    }

    // Método setter para alterar o nome do hospital
    public void setNome(String nome) {
        this.nome = nome; // Atualiza o atributo nome
    }

    // Método getter para obter a capacidade do hospital
    public int getCapacidade() {
        return capacidade; // Retorna o valor da capacidade
    }

    // Método setter para alterar a capacidade do hospital
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade; // Atualiza o atributo capacidade
    }

    // Método getter para verificar se possui UTI
    public boolean isPossuiUTI() {
        return possuiUTI; // Retorna true ou false
    }

    // Método setter para alterar a informação sobre UTI
    public void setPossuiUTI(boolean possuiUTI) {
        this.possuiUTI = possuiUTI; // Atualiza o atributo possuiUTI
    }

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Cria um objeto da classe Hospital
        Hospital hospital = new Hospital("Hospital ABC", 100, true);

        // Exibe o nome do hospital
        System.out.println("Nome do hospital: " + hospital.getNome());

        // Exibe a capacidade do hospital
        System.out.println("Capacidade do hospital: " + hospital.getCapacidade());

        // Chama o método para realizar atendimento
        hospital.realizarAtendimento("João");

        // Chama o método para adicionar um leito
        hospital.adicionarLeito();

        // Verifica se o hospital possui UTI
        hospital.verificarDisponibilidadeUTI();

        // Altera o nome do hospital
        hospital.setNome("Hospital Santo Antônio");

        // Altera a capacidade do hospital
        hospital.setCapacidade(152);

        // Altera a informação sobre UTI
        hospital.setPossuiUTI(false);

        // Exibe o novo nome do hospital
        System.out.println("Novo nome do hospital: " + hospital.getNome());

        // Exibe a nova capacidade do hospital
        System.out.println("Nova capacidade do hospital: " + hospital.getCapacidade());

        // Verifica novamente a disponibilidade de UTI
        hospital.verificarDisponibilidadeUTI();
    }
}
