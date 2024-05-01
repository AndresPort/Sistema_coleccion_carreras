package modelos;

public class Equipo {
    //atributos
    private int codigo;
    private String nombre; 
    
    //metodos
    //constructor
    public Equipo(){
    }
    
    //getters
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    //setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
