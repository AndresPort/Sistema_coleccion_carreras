package modelos;


public class Auto {
    //atributos
    private int codigo;
    private String marca;
    private String equipo;
    private String nombre_piloto;
    
    //meotodos
    //constructor
    public Auto(){
        
    }
    
    //getters
    
    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getNombre_piloto() {
        return nombre_piloto;
    }
    
    //setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setNombre_piloto(String nombre_piloto) {
        this.nombre_piloto = nombre_piloto;
    }

    
    
}
