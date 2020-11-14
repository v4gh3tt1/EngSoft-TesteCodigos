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

        
        System.out.println("\n\nMarca" + "\tCor" + "\tMotor");
        System.out.println(veiculo1.marca + "\t"+veiculo1.cor + "\t"+veiculo1.motor);
        System.out.println(veiculo2.marca + "\t"+veiculo2.cor + "\t"+veiculo2.motor);

        TesteCodigosCarro veiculo3Pvt = new TesteCodigosCarro(); // instancia objeto com nome veiculo3Pvt

        veiculo3Pvt.setMotorPvt ("1.4"); //modifica atributo privado
        veiculo3Pvt.setCorPvt ("Amarelo");
        veiculo3Pvt.setMarcaPvt ("Jeep");
        
        TesteCodigosCarro veiculo4Pvt = new TesteCodigosCarro(); // instancia objeto com nome veiculo4Pvt
        veiculo4Pvt.setMotorPvt ("1.6"); //modifica atributo privado
        veiculo4Pvt.setCorPvt ("Azul");
        veiculo4Pvt.setMarcaPvt ("Fiat");

        System.out.println(veiculo3Pvt.getMarcaPvt() + "\t" + veiculo3Pvt.getCorPvt() + "\t" + veiculo3Pvt.getMotorPvt()); //acessa atributo privado
        System.out.println(veiculo4Pvt.getMarcaPvt() + "\t" + veiculo4Pvt.getCorPvt() + "\t" + veiculo4Pvt.getMotorPvt() + "\n"); //acessa atributo privado
}
    
}
