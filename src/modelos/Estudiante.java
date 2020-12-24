package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    //Informacion del estudiante
    private String matricula;
    private String facultad;
    private ArrayList<Paralelo> paralelos;
    
    public Estudiante(Persona p, String matricula, String facultad, ArrayList<Paralelo> paralelos){
        super(p.getNombre(),p.getApellido(),p.getEdad(),p.getDireccion(),p.getTelefono());
        this.matricula=matricula;
        this.facultad=facultad;
        this.paralelos=paralelos;
    }        
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }   
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }            
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;                
            }
        }
        return notaTotal;        
    }
}
        
    
    
    
            
        
        
