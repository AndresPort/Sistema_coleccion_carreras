package modelos;

public class Marca {
    //atributos
    private int codigo;
    private String nombre;
    private String pais_origen;
    
    //metodos
    //constructor
    public Marca(){    
    }
    
    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais_origen() {
        return pais_origen;
    }
    
    //setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }
    
    
}
