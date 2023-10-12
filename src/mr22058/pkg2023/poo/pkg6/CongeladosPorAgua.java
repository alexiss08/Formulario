package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class CongeladosPorAgua extends Congelados {

    protected double salinidadAgua;

    public CongeladosPorAgua(String nombre, String fechaCaducidad, int lote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, double salinidadAgua) {
        super(nombre, fechaCaducidad, lote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nLote # " + this.lote + "\nFecha de envasado: " + this.fechaEnvasado
                + "\nPaís de orígen: " + this.paisOrigen
                + "\nTemperatura recomendada: " + this.temperaturaRecomendada
                + "\nSalinidad del agua: \n" + this.salinidadAgua + " g/l");
    }

}
