package model;

import java.util.Date;

public class FabricaServicios {

    public Servicio crearServicios(int a, String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado, String codigoServ, double valorContadorAnt, double valorContadorAct, int tipoServicio, double minLoc, double minNac, double consumo, double megas){

        if(a == 1){

            return new Gas(codigoContrato,  direccionInstalacion,  fechaInstalacion,  fehcaFacturacion,  estado, codigoServ, valorContadorAnt, valorContadorAct);

        } else if(a == 2){

            return new Agua(codigoContrato,  direccionInstalacion,  fechaInstalacion,  fehcaFacturacion,  estado, codigoServ, valorContadorAnt, valorContadorAct);

        }else if(a == 3){

            return new Energia(codigoContrato,  direccionInstalacion,  fechaInstalacion,  fehcaFacturacion,  estado, codigoServ, valorContadorAnt, valorContadorAct);


        }else if(a == 4){

            String tipo = "";
            if(tipoServicio == 1) {
                 tipo = "Ilimitado";
            }else if(tipoServicio == 2){
                 tipo = "Limitado";
            } else{
                 tipo = "Prepgago";
            }

            Telefonia telefonia = new Telefonia(codigoContrato,  direccionInstalacion,  fechaInstalacion,  fehcaFacturacion,  estado, tipo, minLoc, minNac);
            return telefonia;

        }else if(a == 5){

            String tipo = "";
            if(tipoServicio == 1) {
                tipo = "Ilimitado";
            }else if(tipoServicio == 2){
                tipo = "Limitado";
            } else{
                tipo = "Prepgago";
            }

            Internet internet = new Internet(codigoContrato,  direccionInstalacion,  fechaInstalacion,  fehcaFacturacion,  estado, tipo, consumo, megas);
            return internet;

        }else{
            return null;
        }

    }



}
