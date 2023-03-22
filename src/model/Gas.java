package model;

import java.util.Date;

public class Gas extends ServiciosFundamentales implements CalcularValorControlador{


    public Gas(String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado, String codigoContrato1, double valorContadorAnt, double valorContadorAct) {
        super(codigoContrato, direccionInstalacion, fechaInstalacion, fehcaFacturacion, estado, codigoContrato1, valorContadorAnt, valorContadorAct);
    }

    @Override
    public double calcularConsumo(double tiempo, double cantidad) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
