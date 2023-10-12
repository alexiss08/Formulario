package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class Refrigerados extends Congelados {

    protected int cosa;

    public Refrigerados(String nombre, String fechaCaducidad, int lote, String fechaEnvasado, String paisOrigen, int cosa, double temperaturaRecomendada) {
        super(nombre, fechaCaducidad, lote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.cosa = cosa;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nLote # " + this.lote + "\nFecha de envasado: " + this.fechaEnvasado
                + "\nPaís de orígen: " + this.paisOrigen
                + "\nTemperatura recomendada: " + this.temperaturaRecomendada
                + "\nCódigo supervision alimentario: " + this.cosa);
    }

}
