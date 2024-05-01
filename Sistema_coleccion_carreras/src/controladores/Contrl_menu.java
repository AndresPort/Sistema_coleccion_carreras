package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Colec_autos;
import modelos.Colec_equipos;
import modelos.Colec_marca;
import vistas.Menu_GUI;


public class Contrl_menu implements ActionListener{
    //Atributos
    private Colec_marca marcas;
    private Colec_equipos equipos;
    private Colec_autos autos;
    private Menu_GUI vista_menu;
    private Contrl_agr_marca agr_marca;
    private Contrl_agr_equipo agr_equipo;
    private Contrl_agr_auto agr_auto;
    
    //metodos
    //constructor
    public Contrl_menu(){
        this.marcas= new Colec_marca(); 
        this.equipos= new Colec_equipos();
        this.autos= new Colec_autos();
        this.vista_menu= new Menu_GUI();
        
        
        //mostrar el menu
        this.vista_menu.setVisible(true);
        
        //Agregar los escuchas de los botones de la vista vista_menu
        this.vista_menu.bt_agr_auto.addActionListener(this);
        this.vista_menu.bt_agr_equipo.addActionListener(this);
        this.vista_menu.bt_agr_marca.addActionListener(this);
        this.vista_menu.btn_consul_auto.addActionListener(this);
        this.vista_menu.btn_consul_equipo.addActionListener(this);
        this.vista_menu.btn_consul_marca.addActionListener(this);
        this.vista_menu.btn_most_autos.addActionListener(this);
        this.vista_menu.btn_most_equipos.addActionListener(this);
        this.vista_menu.btn_most_marcas.addActionListener(this);
        this.vista_menu.btn_rem_auto.addActionListener(this);
        this.vista_menu.btn_rem_equipo.addActionListener(this);
        this.vista_menu.btn_most_marcas.addActionListener(this);
        this.vista_menu.tf_cod_auto.addActionListener(this);
        this.vista_menu.tf_cod_equipo.addActionListener(this);
        this.vista_menu.tf_cod_marca.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //agregar_marca
        if(e.getSource()==this.vista_menu.bt_agr_auto){
            this.agr_marca = new Contrl_agr_marca();
            //set_Contrl_menu
        }
        //borrar_marca
        if(e.getSource()==this.vista_menu.btn_rem_marca){
            this.marcas.rem_marca(Integer.parseInt(this.vista_menu.tf_cod_marca.getText()));
        }
        //consultar_marca
        if(e.getSource()== this.vista_menu.btn_consul_marca){
            this.marcas.consul_marca(Integer.parseInt(this.vista_menu.tf_cod_marca.getText()));
        }
        //mostrar_marcas
        if(e.getSource()==this.vista_menu.btn_most_marcas){
            this.marcas.mostrar_marcas();
        }
        
        
        //agregar_equipos
        if(e.getSource()==this.vista_menu.bt_agr_equipo){
            this.agr_equipo= Contrl_agr_equipo();
            //set_Contrl_menu
        }
        //borrar_equipo
        if(e.getSource()==this.vista_menu.btn_rem_equipo){
            this.equipos.rem_equipo(Integer.parseInt(this.vista_menu.tf_cod_equipo.getText()));
        }
        //consultar_equipo
        if(e.getSource()== this.vista_menu.btn_consul_equipo){
            this.equipos.consul_equipo(Integer.parseInt(this.vista_menu.tf_cod_equipo.getText()));
        }
        //mostrar_equipos
        if(e.getSource()==this.vista_menu.btn_most_equipos){
            this.equipos.mostrar_equipos();
        }
        
        
        //agregar_auto
        if(e.getSource()==this.vista_menu.bt_agr_auto){
            this.agr_auto= Contrl_agr_auto();
            //set_Contrl_menu
        }
        //borrar_auto
        if(e.getSource()==this.vista_menu.btn_rem_auto){
            this.autos.rem_auto(Integer.parseInt(this.vista_menu.tf_cod_auto.getText()));
        }
        //consultar_auto
        if(e.getSource()== this.vista_menu.btn_consul_auto){
            this.autos.consul_auto(Integer.parseInt(this.vista_menu.tf_cod_auto.getText()));
        }
        //mostrar_autos
        if(e.getSource()==this.vista_menu.btn_most_autos){
            this.autos.mostrar_autos();
        }
    }

    public void coult_vista_menu(){
        this.vista_menu.dispose();
    }

    public Colec_marca getMarcas() {
        return marcas;
    }

    public Colec_equipos getEquipos() {
        return equipos;
    }

    public Colec_autos getAutos() {
        return autos;
    }
    
    
}
