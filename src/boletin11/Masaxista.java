package boletin11;

public class Masaxista extends Persoa{
    
    private String titulacion;
    private int anosExperiencia;
    
    public Masaxista(int id, String nome, String apelido, int idade, String titulacion, int anosExperiencia){
        
        super(id, nome, apelido, idade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darMasaxes(){
        
    }
    
    @Override public void viaxar(){
        
        System.out.println("Viaxa o masaxista.");
    }
}
