package model;

import java.util.Date;

public abstract class Servicio{

    private String codigoContrato;
    private String direccionInstalacion;
    private int fechaInstalacion;
    private int fehcaFacturacion;
    private Boolean estado;

    public Servicio(String codigoContrato, String direccionInstalacion, int fechaInstalacion, int fehcaFacturacion, Boolean estado) {
        this.codigoContrato = codigoContrato;
        this.direccionInstalacion = direccionInstalacion;
        this.fechaInstalacion = fechaInstalacion;
        this.fehcaFacturacion = fehcaFacturacion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "codigoContrato='" + codigoContrato + '\'' +
                ", direccionInstalacion='" + direccionInstalacion + '\'' +
                ", fechaInstalacion=" + fechaInstalacion +
                ", fehcaFacturacion=" + fehcaFacturacion +
                ", estado=" + estado;
    }
}
