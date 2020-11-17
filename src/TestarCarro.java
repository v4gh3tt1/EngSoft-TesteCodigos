/*
Teste de codigos desenvolvidos durante a materia de 
Programação Orientafa a Objetos
Bel. Engenharia de Software
Novembro de 2020
Charles Vaghetti
https://github.com/v4gh3tt1

|| Classe para instanciar objetos e chamar metodos  ligada a classe Carro.java||

 █ █ ▄▀▄ ▄▀  █▄█ ▀██ ▀█▀ ▀█▀ ▄█
 ▀▄▀ █▀█ ▀▄█ █ █ ▄▄█  █   █   █

*/
public class TestarCarro {

    public static void main(String[] args) {

        Carro car[] = new Carro[30]; //instancia array de 30 posições, chamada 'car', de objetos do tipo 'Carro'

        // instancia 30 objetos do tipo carro, atribuindo cada um deles a um indice diferente
        for (int indice=0; indice <30; indice ++){
            car[indice] = new Carro();
        }

        // define a velocidade de cara carro, em seu respectivo indice, no valor padrao '0'
        for (int i=0; i<30; i++){
            car[i].setVelocidade (0);
            car[i].setMarca("Marca padrão");
            car[i].setCor("Cor padrão");
            car[i].setMotor("1.0");
        }


        car[0].setVelocidade(10); // define o atributo velocidade, do objeto no indice 0, no valor 10
        car[8].setMotor("1.8"); // define o atributo motor, do objeto no indice 8, no valor 1.8
        car[8].setCor("Amarelo\t"); // define o atributo cor, do objeto no indice 8, no valor Amarelo

        car[6].setMotor("2.0");
        car[11].setMotor("1.8");
        car[16].setMotor("1.6");
        car[19].setMotor("1.8");
        car[20].setMotor("2.0");
        car[23].setMotor("2.4");
        car[25].setMotor("1.4");
        car[28].setMotor("2.0");

        // se carro possui motor 2.0 ou maior velocidade maxima = 300; se motor > 1.4 e < 2.0 velocidade maxima = 220; se motor < 1.4 vel max 180 km/h

        for (int j=0; j < 30; j++){
            if (Double.parseDouble(car[j].getMotor()) >= 2.0) 
            // obs1 - Convert 'String' to 'Double' using Double.parseDouble(String) method. 
            // obs 2 - Convert String to Double in Java using Double.valueOf(String)
                car[j].setVelocidade(300);
            else if (Double.parseDouble( car[j].getMotor()) < 2.0 && Double.parseDouble (car[j].getMotor()) > 1.4 )
                car[j].setVelocidade(220);
            else
                car[j].setVelocidade (180);
        }


        // se motor . 2.0 marca = GM; se motor < 2.0 e > 1.4 marca = WV; se motor < 1.4 marca =Fiat
        for (int k=0; k < 30; k++){
            if (Double.parseDouble(car[k].getMotor()) >= 2.0) 
                car[k].setMarca("GM");
            else if (Double.parseDouble( car[k].getMotor()) < 2.0 && Double.parseDouble (car[k].getMotor()) > 1.4 )
                car[k].setMarca("VW");
            else
                car[k].setMarca ("Fiat");
        }

        // impressão de todos os objetos da array 'car[]' com a respectiva velocidade

        for (int i=0; i<30; i++){
            System.out.println("Carro # " + (i+1) + "\t" + car[i].getMarca() + "\t" +
            car[i].getCor() + "\tMotor [ " + car[i].getMotor() + " ]\t" +
            "\tVel Maxima [ " + car[i].getVelocidade() + "km/h ]");
        }
        
        Carro c1 = new Carro(); //instancia objeto 'carro" chamado c1
        Carro c2 = new Carro(); //instancia objeto 'carro" chamado c1

        c1.setCor("Vermelho");  // utiliza metodo set para atribuir dados ao objeto dedterminado
        c1.setMarca("Citroen");
        c1.setMotor("1.8");

        c2.setCor("Preto");
        c2.setMarca("VW");
        c2.setMotor("1.0");


        // c1.imprimeDados(); // utiliza metodo do objeto determinado -> nomeObjeto.nomeMetodo()
        // c2.imprimeDados();

        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t▄ ▄ ▄   ▄▄▄ ▄ ▄ ▄▄▄ ▄▄▄ ▄▄▄  ▄");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t█ █ █▄█ █   █▄█  ▄█  █   █  ▀█");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t▀▄▀   █ ▀▄█ █ █ ▄▄█  █   █   █\n");   
    }
    
}
