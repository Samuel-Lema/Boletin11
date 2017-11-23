package boletin11;

public class Xogador extends Persoa{

    private int dorsal;
    private String demarcacion;
    
    public Xogador(int id, String nome, String apelido, int idade, int dorsal, String demarcacion){
        
        super(id, nome, apelido, idade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    // Sets y Gets

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    // Funciones
    
    public void xogarPartido(){
        
    }
    public void entrenar(){
        
    }
    @Override public void viaxar(){
        
        System.out.println("Viaxa o xogador.");
    }
}
