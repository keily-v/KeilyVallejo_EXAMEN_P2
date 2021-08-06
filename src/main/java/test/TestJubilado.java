
package test;

import dominio.*;
import java.util.ArrayList;

public class TestJubilado {
    public static void main(String[] args) {
        
   
        ArrayList<Jubilado> jubilados = new ArrayList<>();
        
        JubilacionVejez p1 = new JubilacionVejez ("1234567891","Sofia Moncayo",700,15);
        JubilacionDiscapacidad p2 = new JubilacionDiscapacidad("2345678911","Luz Moreno",800,30,35);
        JubilacionPatronal p3 = new JubilacionPatronal("2345678911","Nicolás Díaz",1200,40,4.28);
        jubilados.add(p1);
        jubilados.add(p2);
        jubilados.add(p3);
        
         System.out.println(jubilados);
        
        
        
    }
}
