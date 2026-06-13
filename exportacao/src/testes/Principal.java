package testes;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Media media = new Media();// instância a classe

        media.calculaMedia(8.0, 9.5);// método da classe media

        JOptionPane.showMessageDialog(null,"A media é: " +  media.retornaMedia());// metodo para mostrar a média
    }
}
