

public class TesteCodigosFuncoes {

    static String frase(){ // funcao sem parametro
        String mensagem = "Hello World!";
        return mensagem;
    }

    static String frase2(String msg){ // funcao esperando parametro
        String mensagem = msg;
        return mensagem;
    }
    public static void main(String[] args) {
        
        System.out.println(frase());
        
        String texto = frase2("Hello Hello!"); // invocação da funcao repassando parametro
        System.out.println(texto); 
    }
}