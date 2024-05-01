package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Colec_marca {
    //atributos
    private Marca marca= new Marca();
    private List<Marca> marcas= new ArrayList<>();
    
    //metodos
    //constructor
    public Colec_marca(){
    }
    
    public void agre_marca(Marca marca){
        this.marcas.add(marca);
    }
    
    public void rem_marca(int _codigo){
        int mensaje=0;
        for (int i=0;i<this.marcas.size();i++){
            this.marca= this.marcas.get(i);
            if(_codigo== this.marca.getCodigo()){
                this.marcas.remove(i);
                mensaje=1;
                JOptionPane.showMessageDialog(null, "Se ha borrado correctamente la marca con el codigo "+ _codigo);
            }
        }
        
        if(mensaje==0){
            JOptionPane.showMessageDialog(null, "No se encontró la marca con el codigo "+ _codigo+ " en la lista de marcas");
        }
    }
    
    public void consul_marca(int _codigo){
       int mensaje=0;
        for (int i=0;i<this.marcas.size();i++){
            this.marca= this.marcas.get(i);
            if(_codigo== this.marca.getCodigo()){
                this.marcas.remove(i);
                mensaje=1;
                JOptionPane.showMessageDialog(null, "Codigo: "+ _codigo+"   Nombre: "+this.marca.getNombre()+ "   Pais de origen: "+ this.marca.getPais_origen());
            }
        }
        
        if(mensaje==0){
            JOptionPane.showMessageDialog(null, "No se encontró la marca con el codigo "+ _codigo+ " en la lista de marcas");
        } 
    }
    
    public void mostrar_marcas(){
        for (int i=0; i<this.marcas.size();i++){
            this.marca= this.marcas.get(i);
            JOptionPane.showMessageDialog(null, "Marca "+(i+1)+":\nCodigo: "+ this.marca.getCodigo()+"   Nombre: "+this.marca.getNombre()+ "   Pais de origen: "+ this.marca.getPais_origen());
        }
    }
    
    
}
