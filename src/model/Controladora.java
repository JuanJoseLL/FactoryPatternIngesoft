package model;
import java.util.ArrayList;
import java.util.Date;

public class Controladora {

    private Cliente cliente;

    private ArrayList<Cliente> clientes;

    public Controladora() {
        cliente = new Cliente();
        this.clientes = new ArrayList<Cliente>();
    }

    public void crearCliente(String nombre, String id, int fechaRegistro, String direccionFac, String correoElec, String telefono, int estado){

        clientes.add(new Cliente(nombre, id,fechaRegistro,direccionFac,correoElec,telefono,estado));

    }

    public void crearServicio(String id, int a, String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado, String codigoServ, double valorContadorAnt, double valorContadorAct, int tipoServicio, double minLoc, double minNac, double consumo, double megas){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getId().equals(id)){
                clientes.get(i).anadirServicio(a, codigoContrato, direccionInstalacion, fechaInstalacion, fehcaFacturacion, estado, codigoServ, valorContadorAnt, valorContadorAct, tipoServicio, minLoc, minNac, consumo, megas);
            }
        }
    }

    public void actualizar(){
        //System.out.println("tamano del arreglo cliente"+clientes.size());


    }

    public void inactivar(String id){

    }

    public void consultar(String id){

    }

    public void mostrarUsuarios(){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
            for (int j = 0; j < clientes.get(i).servicios.size(); j++) {
                System.out.println(clientes.get(i).servicios.get(j));
            }
        }
    }


}
