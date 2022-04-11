public class Carro {

    //variaveis global
    private String motor;
    private String modelo;
    private int rodas;
    private double preco;
    private String tracao;

    public Carro(){
    
    }
//só enxergar a classe quem está dentro da

//sinal de menos (-) significa privado. agora metodos seram público e atributo será privado

//contrutor, quando colocar construtor com paramentro precisa colocar o contrutor padrão 

// variavel local só vai existir para determinado padrão criado 

    public Carro (String motor, String modelo, int rodas, double preco) {
        //this significa que é de uma classe especifica e não do parametro todo
        this.motor=motor;
        this.modelo=modelo;
        this.rodas=rodas;
        this.preco=preco;

    }
    public void dadosVeiculo(){
        System.out.println(this.motor);
    }

    public Carro(String motor, String modelo, String tracao) {
        this.motor=motor;
        this.modelo=modelo;
        this.tracao=tracao;

    }
}