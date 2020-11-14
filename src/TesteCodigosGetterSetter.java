/*

 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ 
░░░░░||░░░░||░░||░░░░░░░░░||||||░░░||░░░░||░░░||||||░░░||||||||░░||||||||░░░░░||░░░░░░░
░░░░░||░░░░||░░||░░░||░░░||░░░░░░░░||░░░░||░░░░░░░░||░░░░░||░░░░░░░░||░░░░░░||||░░░░░░░
░░░░░░||░░||░░░░|||||||░░||░░|||░░░||||||||░░░░|||||░░░░░░||░░░░░░░░||░░░░░░░░||░░░░░░░
░░░░░░░||||░░░░░░░░░||░░░||░░░░||░░||░░░░||░░░░░░░░||░░░░░||░░░░░░░░||░░░░░░░░||░░░░░░░
░░░░░░░░||░░░░░░░░░░||░░░░░|||||░░░||░░░░||░░|||||||░░░░░░||░░░░░░░░||░░░░░░||||||░░░░░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ 
*/

//acesso aos atributos publicos de TesteCodigoCarro diretamente

public class TesteCodigosGetterSetter{

    public static void main(String[] args) {

        TesteCodigosCarro veiculo1 = new TesteCodigosCarro();
        veiculo1.motor = "2.0";
        veiculo1.cor = "Preto";
        veiculo1.marca = "Ford";

        TesteCodigosCarro veiculo2 = new TesteCodigosCarro();
        veiculo2.motor = "1.0";
        veiculo2.cor = "Prata";
        veiculo2.marca = "VW";

        TesteCodigosCarro veiculo3Pvt = new TesteCodigosCarro();
        veiculo3Pvt

        System.out.println("\n\nMarca" + "\tCor" + "\tMotor");
        System.out.println(veiculo1.marca + "\t"+veiculo1.cor + "\t"+veiculo1.motor);
        System.out.println(veiculo2.marca + "\t"+veiculo2.cor + "\t"+veiculo2.motor+"\n\n");
}
    
}
