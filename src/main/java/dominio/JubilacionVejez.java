
package dominio;

public class JubilacionVejez extends Jubilado {

    public JubilacionVejez(String cedula, String nombre, double salarioBase, int aniosSeguro) {
        super(cedula, nombre, salarioBase, aniosSeguro);
    }

    @Override
    public double calcularPension(){
        double bono= this.getSalarioBase()*0.15;
       double valorP= this.pensionInicial()+bono;
       
        return valorP;
    }
    
    @Override
    public void tipoJubilado(){
        System.out.println("Jubilación por Vejez ");
    }

    
}
