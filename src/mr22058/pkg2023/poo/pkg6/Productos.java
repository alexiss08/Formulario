package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class Productos {

    protected String nombre;
    protected String fechaCaducidad;
    protected int lote;

    public Productos(String nombre, String fechaCaducidad, int lote) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
    }

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nLote # " + this.lote);
    }

}
