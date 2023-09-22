package Exercicio1;


public abstract class Publicacao {

    private String titulo;
    private String dataPuplicacao;

    

    public Publicacao() {
    }


    public Publicacao(String t, String d) {
        this.setTitulo(t);
        this.setDataPuplicacao(d);
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDataPuplicacao() {
        return dataPuplicacao;
    }


    public void setDataPuplicacao(String dataPuplicacao) {
        this.dataPuplicacao = dataPuplicacao;
    }

    public abstract void imprimir();

    
        
    
}
