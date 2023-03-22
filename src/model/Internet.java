package model;

import java.util.Date;

public class Internet extends ServiciosFundamentales  implements CalcularValorControlador{

    private TipoContrato tipoContrato;
    private double cantConsumo;
    private double consumoMegas;

    public Internet(String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado, String codigoContrato1, double valorContadorAnt, double valorContadorAct) {
        super(codigoContrato, direccionInstalacion, fechaInstalacion, fehcaFacturacion, estado, codigoContrato1, valorContadorAnt, valorContadorAct);
    }

    @Override
    public double calcularConsumo(double tiempo, double cantidad) {
        return 0;
    }

}
