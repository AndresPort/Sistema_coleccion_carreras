package modelos;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Colec_autos{
    //atributos
    private Auto auto;
    private List<Auto> autos= new ArrayList<>();
    //metodos
    //constructor
    public Colec_autos(){
    }
    
    public void agre_auto(Auto auto){
      this.autos.add(auto);
    }
    
    public void rem_auto(int _codigo){
        int mensaje=0;
        for (int i=0;i<this.autos.size();i++){
            this.auto= this.autos.get(i);
            if(_codigo== this.auto.getCodigo()){
                this.autos.remove(i);
                mensaje=1;
                JOptionPane.showMessageDialog(null, "Se ha borrado correctamente el auto con el codigo "+ _codigo);
            }
        }
        
        if(mensaje==0){
            JOptionPane.showMessageDialog(null, "No se encontró el auto con el codigo "+ _codigo+ " en la lista de autos");
        }
        
    }
    
    public void consul_auto(int _codigo){
        int mensaje=0;
        for (int i=0;i<this.autos.size();i++){
            this.auto= this.autos.get(i);
            if(_codigo== this.auto.getCodigo()){
                mensaje=1;
                JOptionPane.showMessageDialog(null, "Codigo: "+ _codigo+ "   Marca: "+this.auto.getMarca()+"   Equipo: "+this.auto.getEquipo()+"   Piloto: "+this.auto.getNombre_piloto());
            }
        }
        
        if(mensaje==0){
            JOptionPane.showMessageDialog(null, "No se encontró auto con el codigo "+ _codigo+ " en la lista de autos");
        }   
    }
    
    public void mostrar_autos(){
        for(int i=0;i<this.autos.size();i++){
            this.auto= this.autos.get(i);
            JOptionPane.showMessageDialog(null, "Auto "+(i+1)+":\nCodigo: "+ this.auto.getCodigo()+ "   Marca: "+this.auto.getMarca()+"   Equipo: "+this.auto.getEquipo()+"   Piloto: "+this.auto.getNombre_piloto());
        }
    }

}
