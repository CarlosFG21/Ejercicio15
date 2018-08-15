 
package ejercicio15video20;

import java.util.*;
import javax.swing.JOptionPane;

public class genero {
    
    public void metodo(){
        
        String genero = "";
        
        do{
           
            genero = JOptionPane.showInputDialog("INTRODUCE TU GENERO (H/M)");
            
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE TU ALTURA EN CM"));
        
        int pesoideal = 0;
        
        if(genero.equalsIgnoreCase("H")){
            
            pesoideal = altura-110;
            
        }else if(genero.equalsIgnoreCase("M")){
            
            pesoideal = altura-120;
        }
        
        System.out.println("TU PESO IDEAL ES " + pesoideal);
    }
}
