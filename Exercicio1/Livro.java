package Exercicio1;

public class Livro extends Publicacao{

    private String editora;

    public Livro(String t, String d, String e) {
        super(t, d);
        this.editora = e;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void imprimir(){
        System.out.println("Titulo: " +this.getTitulo() + "\nData: "+this.getDataPuplicacao()+ 
        "\nEditora: "+getEditora());
    }
    
}
