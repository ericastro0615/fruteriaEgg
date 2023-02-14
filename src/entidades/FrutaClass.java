package entidades;

public class FrutaClass {

    private String nombre;
    private String forma;
    private String color;
    private String sabor;
    private String tamanio;
    private Double peso;

    public FrutaClass() {
    }

    public FrutaClass(String nombre, String forma, String color, String sabor, String tamanio, Double peso) {
        this.nombre = nombre;
        this.forma = forma;
        this.color = color;
        this.sabor = sabor;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "FrutaClass{" +
                "nombre='" + nombre + '\'' +
                ", forma='" + forma + '\'' +
                ", color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", peso=" + peso +
                '}';
    }
}
