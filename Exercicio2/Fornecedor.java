package Exercicio2;

public class Fornecedor extends Pessoa {
    private double valorCompra;

    public Fornecedor() {
    }

    

    public Fornecedor(String n, String f, double vc) {
        super(n, f);
        double valorCompra = vc;
        this.setValorCompra(vc);
    }



    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void print(){
        double imposto = 50;
        System.out.println("Nome: "+this.getNome()+"\nFone: "+this.getFone()+ "\nValor: "+this.getValorCompra()+"\nImposto: "+this.calculaImpostos(imposto));
    }
    
    public double calculaImpostos(double imposto){
        double retorno = this.getValorCompra() * (imposto / 100);
        
        return retorno;
    }
}
