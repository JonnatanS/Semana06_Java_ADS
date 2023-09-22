package Exercicio2;

public class Cliente extends Pessoa  {
    private  double valorDivida;

    

    public Cliente() {
    }


    public Cliente(String n, String f, double v) {
        super(n, f);
        this.setValorDivida(v);;
    }


    public double getValorDivida() {
        return valorDivida;
    }


    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }


    public void print(){
        System.out.println("Nome: "+this.getNome()+"\nFone: "+this.getFone()+ "\nValor: "+this.getValorDivida()+"\nJuros: "+this.calculaJuros(valorDivida));
        System.out.println("------------------------------------------------------------");
    }
    

    public double calculaJuros(double tx){
        tx = (valorDivida * 25) / 100;
       return tx;
    }
   
    
}
