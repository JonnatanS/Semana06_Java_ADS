package Exercicio2;

public class Principal {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Jonnatan", "40028922", 120);
        cl1.calculaJuros(10);
        cl1.print();


        Fornecedor fr1 = new Fornecedor("Diony", "40028922", 1500);
        fr1.calculaImpostos(300);
        fr1.print();

    }
    
}
