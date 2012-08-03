import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void alta() {
        perro u = new perro ("toby", 7).save();
        razas r = new razas ("Frenchpul","lanudo").save();
    }
    
    @Test
    public void buscar() {
       perro u = perro.find("byNombre","toby").first();
       razas r = razas.find("byTipo","Frenchpul").first();
        
        System.out.println("El nombre es: "+ u.nombre);
        System.out.println("La raza es: "+ r.tipo);
               
    }
    
    @Test
    public void cambio() {
    	perro u = perro.find("byNombre","toby").first();
    	razas r = razas.find("byTipo","Frenchpul").first();
    	
        
    	u.nombre = "tobyto";
    	r.tipo = "Aleman";
    	u.save();
    	r.save();
        System.out.println("El nombre es: "+ u.nombre); 
        System.out.println("La raza es: "+ r.tipo);
        
    }
    
    @Test
    public void del() {
    	perro u = perro.find("byNombre","tobyto").first();
    	razas r = razas.find("byTipo","Aleman").first();
        
    	
    	u.delete();
    	r.delete();
        
    }
}
