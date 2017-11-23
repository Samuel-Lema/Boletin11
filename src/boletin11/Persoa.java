package boletin11;

public class Persoa {
    
    protected int id;
    protected String nome;
    protected String apelido;
    protected int idade;
    
    public Persoa(int id, String nome, String apelido, int idade){
        
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }

    // Sets y Gets
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // Funciones
    
    public void concentrarse(){
        
        System.out.println("Concentrase a selección.");
    }
    public void viaxar(){
        
        System.out.println("Viaxe a selección.");
    }
    
}
