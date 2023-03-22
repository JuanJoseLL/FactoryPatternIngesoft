package model;

import java.util.Date;

public abstract class ServiciosFundamentales extends Servicio{

    private String codigoContrato;
    private double valorContadorAnt;
    private double valorContadorAct;

    public ServiciosFundamentales(String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado, String codigoContrato1, double valorContadorAnt, double valorContadorAct) {
        super(codigoContrato, direccionInstalacion, fechaInstalacion, fehcaFacturacion, estado);
        this.codigoContrato = codigoContrato1;
        this.valorContadorAnt = valorContadorAnt;
        this.valorContadorAct = valorContadorAct;
    }

    @Override
    public String toString() {
        return super.toString() +
                "codigoContrato='" + codigoContrato + '\'' +
                ", valorContadorAnt=" + valorContadorAnt +
                ", valorContadorAct=" + valorContadorAct ;
    }
}
