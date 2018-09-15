/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class ModelRfc {
    private String apellido_pa;
    private String apellido_ma;
    private String nombre;
    private String dia;
    private String mes;
    private String anio;
    private String interpretacion;
    private String rfc;
   
    
    
    public void CalcularRfc(){
        
       apellido_pa=apellido_pa.substring(0,2);
       apellido_ma=apellido_ma.substring(0,1);
       nombre=nombre.substring(0,1);
       anio=anio.substring(2);
       mes=mes.substring(0,2);
       dia=dia.substring(0, 2);
       
        interpretacion=(apellido_pa+apellido_ma+nombre+anio+mes+dia);
      
        
    }

    public String getApellido_pa() {
        return apellido_pa;
    }

    public void setApellido_pa(String apellido_pa) {
        this.apellido_pa = apellido_pa;
    }

    public String getApellido_ma() {
        return apellido_ma;
    }

    public void setApellido_ma(String apellido_ma) {
        this.apellido_ma = apellido_ma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    

    

   
    
}
