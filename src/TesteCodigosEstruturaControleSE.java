
/*

 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ 
░░░░░||░░░░||░░||░░░░░░░░░||||||░░░||░░░░||░░░||||||░░░||||||||░░||||||||░░░░░||░░░░░░░
░░░░░||░░░░||░░||░░░||░░░||░░░░░░░░||░░░░||░░░░░░░░||░░░░░||░░░░░░░░||░░░░░░||||░░░░░░░
░░░░░░||░░||░░░░|||||||░░||░░|||░░░||||||||░░░░|||||░░░░░░||░░░░░░░░||░░░░░░░░||░░░░░░░
░░░░░░░||||░░░░░░░░░||░░░||░░░░||░░||░░░░||░░░░░░░░||░░░░░||░░░░░░░░||░░░░░░░░||░░░░░░░
░░░░░░░░||░░░░░░░░░░||░░░░░|||||░░░||░░░░||░░|||||||░░░░░░||░░░░░░░░||░░░░░░||||||░░░░░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ 
*/
public class TesteCodigosEstruturaControleSE {

    private double saldo = 0;
    
    public void setSaldo (double vSaldo) {
        saldo = vSaldo;
    }

    @Override
    public String toString() {
        return "{" +
            " saldo='" + getSaldo() + "'" +
            "}";
    }

    public double getSaldo(){
        return saldo;
    }


    public void sacar (double vValor){
        if (vValor >= saldo)
            System.out.println("Saldo insuficiente");
        else
            saldo = saldo - vValor;
    }

   
public static void main(String[] args) {
    TesteCodigosEstruturaControleSE contaCorrente = new TesteCodigosEstruturaControleSE();
    contaCorrente.saldo = 500;

    System.out.println("Descricao \t\t"+ "Valor");
    System.out.println("Saldo inicial \t\t"+ contaCorrente.getSaldo());
    //System.out.println(contaCorrente.toString());

    
    System.out.println("Saque realizado \t"+ "300,00");
    contaCorrente.sacar(300);
    System.out.println("Saldo atual\t\t"+ contaCorrente.getSaldo());

    
    System.out.println("Saque realizado \t"+ "300,00");
    contaCorrente.sacar(300);
    System.out.println("Saldo atual\t\t"+ contaCorrente.getSaldo());






} 
}
