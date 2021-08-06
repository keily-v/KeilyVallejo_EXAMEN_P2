
package dominio;

public class JubilacionDiscapacidad extends Jubilado {
    
    private int pdiscapacidad;

    public JubilacionDiscapacidad(String cedula, String nombre, double salarioBase, int aniosSeguro,int pdiscapacidad) {
        super(cedula, nombre, salarioBase, aniosSeguro);
        this.pdiscapacidad= pdiscapacidad;
    }

    public int getPdiscapacidad() {
        return pdiscapacidad;
    }

    public void setPdiscapacidad(int pdiscapacidad) {
        this.pdiscapacidad = pdiscapacidad;
    }
    

     @Override
    public double calcularPension(){
        
       double bono= this.getSalarioBase()*(this.pdiscapacidad/100);
       double valorP= this.pensionInicial()+bono;
       
        return valorP;
    }
    
    @Override
    public void tipoJubilado(){
        System.out.println("Jubilación por Discapacidad ");
    }
    
}
