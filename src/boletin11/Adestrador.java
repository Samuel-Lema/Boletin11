package boletin11;

public class Adestrador extends Persoa {
    
    private int idFederacion;
    
    public Adestrador(int id, String nome, String apelido, int idade, int idFederacion){
        
        super(id, nome, apelido, idade);
        this.idFederacion = idFederacion;
    }
    
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    }
    
    @Override public void viaxar(){
        
        System.out.println("Viaxa o adestrador.");
    }
}
