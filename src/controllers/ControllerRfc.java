
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelRfc;
import views.ViewRfc;

public class ControllerRfc implements ActionListener{
    ModelRfc modelRfc;
    ViewRfc viewRfc;

    public ControllerRfc(ModelRfc modelRfc, ViewRfc viewRfc) {
        this.modelRfc = modelRfc;
        this.viewRfc = viewRfc;
        this.viewRfc.jB_calcular_rfc.addActionListener(this);
        initComponets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewRfc.jB_calcular_rfc){
          jB_calcular_action_performed();  
            
        }
            
    }
    
    public void jB_calcular_action_performed(){
       modelRfc.setApellido_pa(String.valueOf(viewRfc.jTF_apellido_paterno.getText()));
       modelRfc.setApellido_ma(String.valueOf(viewRfc.jTF_apellido_materno.getText()));
       modelRfc.setNombre(String.valueOf(viewRfc.jTF_nombre.getText()));
       modelRfc.setDia(String.valueOf( viewRfc.jCB_dia.getSelectedItem()));
       modelRfc.setMes(String.valueOf(viewRfc.jCB_mes.getSelectedItem()));
       modelRfc.setAnio(String.valueOf(viewRfc.jCB_anio.getSelectedItem()));
       modelRfc.CalcularRfc();
       viewRfc.jL_rfc.setText(String.valueOf(modelRfc.getInterpretacion()));
            
    }
    public void initComponets(){
        viewRfc.setVisible(true);
        viewRfc.setVisible(true);
        viewRfc.jTF_apellido_paterno.setText(modelRfc.getApellido_pa());
        viewRfc.jTF_apellido_materno.setText(modelRfc.getApellido_ma());
        viewRfc.jTF_nombre.setText(modelRfc.getNombre());
    }
}
