package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class Congelados extends Frescos {

    protected double temperaturaRecomendada;

    public Congelados(String nombre, String fechaCaducidad, int lote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada) {
        super(nombre, fechaCaducidad, lote, fechaEnvasado, paisOrigen);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nLote # " + this.lote + "\nFecha de envasado: " + this.fechaEnvasado
                + "\nPaís de orígen: " + this.paisOrigen
                + "\nTemperatura recomendada: " + this.temperaturaRecomendada);
    }

}
