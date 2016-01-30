package rysi.web.holaweb.entidades;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jaguilar
 */
public class Articulo {

    private String clave;
    private String nombre;
    private BigDecimal precioUnitario;
    private Date fechaIntroduccion;
    private Integer existencia;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaIntroduccion() {
        return fechaIntroduccion;
    }

    public void setFechaIntroduccion(Date fechaIntroduccion) {
        this.fechaIntroduccion = fechaIntroduccion;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
    
    
}
