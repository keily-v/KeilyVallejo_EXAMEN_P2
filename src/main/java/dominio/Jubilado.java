
package dominio;

abstract public class Jubilado   {
    
    private String cedula;
    private String nombre;
    private double salarioBase;
    private int aniosAporte;
    
    public abstract double calcularPension();
    public abstract String tipoJubilado();
    
    
    //método constructor
    public Jubilado(String cedula, String nombre, double salarioBase, int aniosAporte) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.aniosAporte = aniosAporte;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAniosAporte() {
        return aniosAporte;
    }

    public void setAniosAporte(int aniosAporte) {
        this.aniosAporte= aniosAporte;
    }
    
    //pension inicial a obtener de forma general
    public double pensionInicial(){
        
        double salario;
        if (this.aniosAporte>0 && this.aniosAporte<11){
            salario= this.salarioBase*0.5;
        return salario;
        } else if (this.aniosAporte>10 && this.aniosAporte<21){
            salario= this.salarioBase*0.6;
            return salario;
        }else if (this.aniosAporte>20 && this.aniosAporte<31){
            salario= this.salarioBase*0.7;
            return salario;
        }else if (this.aniosAporte>31 && this.aniosAporte<35){
            salario= this.salarioBase*0.8;
            return salario;
        }else if (this.aniosAporte>35 && this.aniosAporte<40){
            salario= this.salarioBase*0.9;
            return salario;
        } 
        else if (this.aniosAporte>39){
            salario= this.salarioBase;
            return salario;
        } 
        return 0;
        }
  
    @Override
    public String toString() {

        return tipoJubilado()+" "+this.cedula+" "+this.nombre+" Pensión: $"+calcularPension()+"\n" ;
    }
            
    }

    

    

