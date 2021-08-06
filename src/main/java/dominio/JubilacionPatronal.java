
package dominio;

public class JubilacionPatronal extends Jubilado {

    private Empresa empresa;
    private double inflacion;
    
    public JubilacionPatronal(String cedula, String nombre, double salarioBase, int aniosSeguro,double inflacion) {
        super(cedula, nombre, salarioBase, aniosSeguro);
        this.inflacion=inflacion;
        
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getInflacion() {
        return inflacion;
    }

    public void setInflacion(double inflacion) {
        this.inflacion = inflacion;
    }

     @Override
    public double calcularPension(){
        
        double bono=(inflacion/100)*this.getSalarioBase();
        double valorP=this.pensionInicial()+bono;
       
        return valorP;
    }
    
    @Override
    public String tipoJubilado(){
        return "Jubilación patronal :";
    }
}
