package testes;

public class Media {
    private  double  nota1;
    private  double  nota2;
    private  double  media;

    public void calculaMedia(double nota1, double nota2){
        this.nota1 = nota1;//INTANCIA A NOTA 1
        this.nota2 = nota2;

        media = (nota1+nota2)/2;
    }

    public double retornaMedia (){
        return media;
    }
}
