<<<<<<< HEAD
public class TesteCodigosProcedimentoRetornaFrase { //invoca Procedimento que imprime mensagem na tela

    static void frase () {
=======
public class TesteCodigosProcedimentoRetornaFrase { //invoca Procedimento que imprime mensagem na tela, com e sem parametro

    static void frase (String msg) { //procedimento sem parametro
        System.out.println(msg);
    }
    static void frase () { //procedimento com parametro
>>>>>>> Codes
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args) {  

<<<<<<< HEAD
    frase();
=======
        String mensagem = ("Hello World!");
        frase(mensagem); // invoca procediemento e passa o parametro
        frase(); // invoca procedimento sem parametro
>>>>>>> Codes
  
    }
}