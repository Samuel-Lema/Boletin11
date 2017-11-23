package boletin11;

public class Boletin11 {

    public static void main(String[] args) {
    
        // Instancio un obxecto de cada clase
        
        Xogador xogador1 = new Xogador(1,"Samuel","Lema", 19, 9, "Prueba");
        Adestrador adestrador1 = new Adestrador(1,"Samuel","Lema", 19, 1);
        Masaxista masaxista1 = new Masaxista(1,"Samuel","Lema", 19, "Prueba", 9);
        
        // Instacio un obxecto coa clase Super
        
        Persoa xogadorSel1 = new Xogador(2,"Samuel2","Lema2", 19, 14, "Prueba");
        
        // Invocando o metodo concentrase de todos os obxectos das clases
        
        xogador1.concentrarse();
        adestrador1.concentrarse();
        masaxista1.concentrarse();
        
        // Invocando o metodo viaxar de todos os obxectos das clases
        
        xogador1.viaxar();
        adestrador1.viaxar();
        masaxista1.viaxar();
        
        // Invocar metodo da SuperClase cun obxecto da SubClase
        
        xogador1.viaxar(); // No
        
        // Invocar metodo da SubClase cun obxecto da SuperClase
        
        xogadorSel1.viaxar(); // Si
    }
    
}
