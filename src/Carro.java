

public class Carro {

    // cria atributos da classe
    private String motor;
    private String cor;
    private String marca;
    private int velocidade;

    // metodos  getters e setter da classe

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // metodos para imprimir dados dos objetos acessivel: nomeObjeto.nomeMetodo() -> c1.imprimeDados()

    public void imprimeDados(){
        System.out.println("Motor: " + motor);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);

    }
    public static void main(String[] args) {

     
    
    }
}
