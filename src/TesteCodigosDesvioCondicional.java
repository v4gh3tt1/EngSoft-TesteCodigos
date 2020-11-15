/*
Teste de codigos desenvolvidos durante a materia de 
Programação Orientafa a Objetos
Bel. Engenharia de Software
Novembro de 2020
Charles Vaghetti
https://github.com/v4gh3tt1

|| Calculo de media de notas com retorno do respectivo conceito ||

 █ █ ▄▀▄ ▄▀  █▄█ ▀██ ▀█▀ ▀█▀ ▄█
 ▀▄▀ █▀█ ▀▄█ █ █ ▄▄█  █   █   █

*/



public class TesteCodigosDesvioCondicional {

    private static double n1, n2, media;

    public double getN1(){
        return n1;
    }

    public void setN1(double nota1){
        n1 = nota1;
    }

    public double getN2(){
        return n2;
    }

    public void setN2 (double nota2) {
        n2 = nota2;
    }

    public static void calcularMedia(){
        media = (n1 + n2)/2;
        if (media < 4)
            System.out.println("Conceito D");
        else if ( media >=4 &&  media < 6)
            System.out.println("Conceito C");
        else if ( media >=6 &&  media < 8)
            System.out.println("Conceito B");
        else 
            System.out.println("Cocneito A");

    }

public static void main(String[] args) {
    TesteCodigosDesvioCondicional boletim1 = new TesteCodigosDesvioCondicional();

    boletim1.setN1(6.8);
    boletim1.setN2(3.4);
    
    System.out.println("Nota 1 \tNota 2");

    System.out.println(boletim1.getN1() + "\t" + boletim1.getN2());
    calcularMedia();
    


    System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t▄ ▄ ▄   ▄▄▄ ▄ ▄ ▄▄▄ ▄▄▄ ▄▄▄  ▄");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t█ █ █▄█ █   █▄█  ▄█  █   █  ▀█");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t▀▄▀   █ ▀▄█ █ █ ▄▄█  █   █   █\n");   
}
    
}