package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class CongeladosPorAgua extends Congelados {

    protected String salinidadAgua;

    public CongeladosPorAgua(String salinidadAgua, String fechaEnvasado, String paisOrigen, String nombre, String fechaCaducidad, int lote, double temperaturaRecomendada) {
        super(fechaEnvasado, paisOrigen, nombre, fechaCaducidad, lote, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public String getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(String salinidadAgua) {
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
