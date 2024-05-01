package modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Colec_equipos {
    //Atributos
    Equipo equipo;
    List<Equipo> equipos= new ArrayList<>();
    
    //metodos
    //constructor
    public Colec_equipos(){
    }
    
    public void agre_equipo(Equipo equipo){
        this.equipos.add(equipo);
    }
    
    public void rem_equipo(int _codigo){
        int mensaje=0;
        for (int i=0; i<this.equipos.size();i++){
            this.equipo=this.equipos.get(i);
            if(this.equipo.getCodigo()== _codigo){
                this.equipos.remove(i);
                mensaje=1;
                JOptionPane.showConfirmDialog(null, "Se borró correctamente el equipo con el código "+_codigo);
            }
        }
        if(mensaje==0){
            JOptionPane.showConfirmDialog(null, "No se encontró el equipo con el código "+_codigo);
        }
    }
    
    public void colsul_equipo(int _codigo){
        int mensaje=0;
        for (int i=0; i<this.equipos.size();i++){
            this.equipo=this.equipos.get(i);
            if(this.equipo.getCodigo()== _codigo){
                mensaje=1;
                JOptionPane.showConfirmDialog(null,"Código: "+_codigo+"   Nombre: "+this.equipo.getNombre());
            }
        }
        if(mensaje==0){
            JOptionPane.showConfirmDialog(null, "No se encontró el equipo con el código "+_codigo);
        }
    }
 
    public void mostrar_equipos(){
        for (int i=0;i<this.equipos.size();i++){
            this.equipo=this.equipos.get(i);
            JOptionPane.showConfirmDialog(null,"Equipo "+(i+1)+"/nCódigo: "+this.equipo.getCodigo()+"   Nombre: "+this.equipo.getNombre());
        }
    }
}
