public class Principal {
    public static void main(String [] args) {
        Bicicleta bike=new Bicicleta();

        Carro car =new Carro(); //contrução de objeto, declarando um objeto 
        Carro car2=new Carro("1.0","Up", 4, 63000); //de acordo com a sequência das informações 
        Carro car3=new Carro("4.0", "John Deere", "total");

        car2.dadosVeiculo();
        car3.dadosVeiculo();

    }
    
}
