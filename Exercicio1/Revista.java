package Exercicio1;

public class Revista extends Publicacao {
    private String editor;
    private String local;


    public Revista(String t, String d, String e, String l) {
        super(t, d);
        this.editor = e;
        this.local = l;
    }


    public String getEditor() {
        return editor;
    }


    public void setEditor(String editor) {
        this.editor = editor;
    }


    public String getLocal() {
        return local;
    }


    public void setLocal(String local) {
        this.local = local;
    }

    public void imprimir(){
        System.out.println("Titulo: " +this.getTitulo() + "\nData: "+this.getDataPuplicacao()+ 
        "\nEditora: "+this.getEditor()+"\nLocal: "+this.getLocal());
        System.out.println("-------------------------------------------------------------");
        
    }

    
    
}
