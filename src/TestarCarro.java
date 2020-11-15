/*
Teste de codigos desenvolvidos durante a materia de 
Programação Orientafa a Objetos
Bel. Engenharia de Software
Novembro de 2020
Charles Vaghetti
https://github.com/v4gh3tt1

|| Classe para instanciar objetos e chamar metodos ||

 █ █ ▄▀▄ ▄▀  █▄█ ▀██ ▀█▀ ▀█▀ ▄█
 ▀▄▀ █▀█ ▀▄█ █ █ ▄▄█  █   █   █

*/
public class TestarCarro {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setCor("Vermelho");
        c1.setMarca("Citroen");
        c1.setMotor("'1.8");

        c2.setCor("Preto");
        c2.setMarca("VW");
        c2.setMotor("1.0 TSi");


        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t▄ ▄ ▄   ▄▄▄ ▄ ▄ ▄▄▄ ▄▄▄ ▄▄▄  ▄");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t█ █ █▄█ █   █▄█  ▄█  █   █  ▀█");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t▀▄▀   █ ▀▄█ █ █ ▄▄█  █   █   █\n");   
    }
    
}
