/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfcmvc;
import models.ModelRfc;
import views.ViewRfc;
import controllers.ControllerRfc;

public class RFCMvc {
    private static ViewRfc viewRfc;
    private static ModelRfc modelRfc;
    private static ControllerRfc controllerRfc;
    
    public static void main(String[] args) {
        ModelRfc modelRfc = new ModelRfc();
        ViewRfc viewRfc = new ViewRfc();
        ControllerRfc controllerRfc = new ControllerRfc(modelRfc, viewRfc);
    }
    
}
