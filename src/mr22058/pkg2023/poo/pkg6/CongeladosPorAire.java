package mr22058.pkg2023.poo.pkg6;

import javax.swing.JOptionPane;

public class CongeladosPorAire extends Congelados {

    protected double nitrogeno, oxigeno, dioxidoCarbono, vaporDeAgua;

    public CongeladosPorAire(String nombre, String fechaCaducidad, int lote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, double nitrogeno, double oxigeno, double dioxidoCarbono, double vaporDeAgua) {
        super(nombre, fechaCaducidad, lote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public void setDioxidoCarbono(double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(double vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nLote # " + this.lote + "\nFecha de envasado: " + this.fechaEnvasado
                + "\nPaís de orígen: " + this.paisOrigen
                + "\nTemperatura recomendada: " + this.temperaturaRecomendada
                + "\nNitrogeno: \n" + this.nitrogeno + "%"
                + "\nOxigeno: \n" + this.oxigeno + "%"
                + "\nDioxido de carbono: \n" + this.dioxidoCarbono + "%"
                + "\nVapor de agua: \n" + this.vaporDeAgua + "%");

    }

}
