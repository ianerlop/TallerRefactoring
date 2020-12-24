package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {
    private String codigo;    
    private ArrayList<Paralelo> paralelos;
    private InformacionAdicionalProfesor info;
    
    public Profesor(Persona p, String codigo, ArrayList<Paralelo> paralelos, InformacionAdicionalProfesor info) {
        super(p.getNombre(),p.getApellido(),p.getEdad(),p.getDireccion(),p.getTelefono());
        this.codigo = codigo;
        this.paralelos = paralelos;
        this.info=info;
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public InformacionAdicionalProfesor getInfo(){
        return info;
    }
    
    public double calcularSueldo(Profesor prof){        
        return prof.getInfo().getAñosdeTrabajo()*600 + prof.getInfo().getBonoFijo();
    } 
}
