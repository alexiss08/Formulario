package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class CongeladosPorNitrogeno extends Congelados {

    protected String metodoCongelacion;
    protected String tiempoExposicion;

    public CongeladosPorNitrogeno(String metodoCongelacion, String tiempoExposicion, String fechaEnvasado, String paisOrigen, String nombre, String fechaCaducidad, int lote, double temperaturaRecomendada) {
        super(fechaEnvasado, paisOrigen, nombre, fechaCaducidad, lote, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public String getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(String tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nLote # " + this.lote + "\nFecha de envasado: " + this.fechaEnvasado
                + "\nPaís de orígen: " + this.paisOrigen
                + "\nTemperatura recomendada: " + this.temperaturaRecomendada
                + "\nMetodo de congelacion: \n" + getMetodoCongelacion()
                + "\nTiempo de exposicion: \n" + getTiempoExposicion() + " minutos");
    }
}
