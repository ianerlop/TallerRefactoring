package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    private ArrayList<Paralelo> paralelosAsignados;

    Ayudante(Persona p, Estudiante e,ArrayList<Paralelo> paralelosAsignados){
    	super(p,e.getFacultad(),e.getMatricula(),e.getParalelos());
        this.paralelosAsignados=paralelosAsignados;
    }

    public ArrayList<Paralelo> getParalelosAsignados() {
        return paralelosAsignados;
    }

    public void setParalelosAsignados(ArrayList<Paralelo> paralelosAsignados) {
        this.paralelosAsignados = paralelosAsignados;
    }           

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelosAsignados){
            //Muestra la info general de cada paralelo
        }
    }
}
