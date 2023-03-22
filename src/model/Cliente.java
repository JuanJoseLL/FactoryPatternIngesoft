package model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {

    private String nombre;
    private String id;
    private int fechaRegistro;
    private String direccionFac;
    private String correoElec;
    private String telefono;
    private Estado estado;

    public ArrayList<Servicio> servicios;

    public Cliente(){
        servicios = new ArrayList<Servicio>();
    }

    public Cliente(String nombre,String id, int fecha,String direccion, String correo, String telefono, int est){
        this.nombre=nombre;
        this.id=id;
        fechaRegistro=fecha;
        direccionFac=direccion;
        correoElec=correo;
        servicios = new ArrayList<Servicio>();
        this.telefono=telefono;
        switch(est){
            case 1: estado=Estado.RETIRADO;
            break;
            case 2: estado=Estado.CARTERACASTIGADA;
            break;
            case 3: estado=Estado.MOROSO;
            break;
            case 4: estado=Estado.CONDEUDA;
            break;
            case 5: estado=Estado.PAZ_SALVO;
            break;
            case 6: estado=Estado.POTENCIAL;
            break;
        }
    }
    public void anadirServicio(int a, String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado, String codigoServ, double valorContadorAnt, double valorContadorAct, int tipoServicio, double minLoc, double minNac, double consumo, double megas){

        FabricaServicios fabrica = new FabricaServicios();
        Servicio s = fabrica.crearServicios(a, codigoContrato, direccionInstalacion, fechaInstalacion, fehcaFacturacion, estado, codigoServ, valorContadorAnt, valorContadorAct, tipoServicio, minLoc, minNac, consumo, megas);
        servicios.add(s);
        //return fabrica.crearServicios(a, codigoContrato, direccionInstalacion, fechaInstalacion, fehcaFacturacion, estado, codigoServ, valorContadorAnt, valorContadorAct, tipoServicio, minLoc, minNac, consumo, megas);
        System.out.println("medoto anadirServicio"+" tamano del arreglo servicio"+servicios.size());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(int fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDireccionFac() {
        return direccionFac;
    }

    public void setDireccionFac(String direccionFac) {
        this.direccionFac = direccionFac;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String toString(){
        return "Nombre: "+nombre+" Id: "+id+" Fecha de registro: "+fechaRegistro+" Direccion de facturacion: "+direccionFac+" Correo electronico: "+correoElec+" Telefono: "+telefono+" Estado: "+estado;
    }
}
