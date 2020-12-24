package modelos;

public class InformacionAdicionalProfesor {
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;

    public InformacionAdicionalProfesor(int añosdeTrabajo, String facultad, double BonoFijo) {
        this.añosdeTrabajo = añosdeTrabajo;
        this.facultad = facultad;
        this.BonoFijo = BonoFijo;
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }
    
}
