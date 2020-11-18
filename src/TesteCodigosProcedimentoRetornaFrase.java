
public class TesteCodigosProcedimentoRetornaFrase { //invoca Procedimento que imprime mensagem na tela, com e sem parametro

    static String f(){ // funcao sem argumento
        String mensagem = "Função sem parametro";
        return mensagem;
    }

    static void frase (String msg) { //procedimento sem parametro
        System.out.println(msg);
    }
    static void frase () { //procedimento com parametro
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args) {  

        String mensagem = ("Hello World!");
        frase(mensagem); // invoca procediemento e passa o parametro
        frase(); // invoca procedimento sem parametro
        System.out.println(f()); // imprime dado repassado pela função
    }
}