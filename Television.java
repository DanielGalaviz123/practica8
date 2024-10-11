public class Television extends DispositivoElectricoDeConsumo {

    protected Pantalla pantalla;

    public Television(Pantalla pantalla, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre,
            float costo) {
        super(encendido, fabricante, numeroSerie, marca, nombre, costo);

        this.pantalla=pantalla;
        
    }

    public Pantalla getPantalla(){
        return pantalla;
    }

    @Override
    public String toString() {
        return "Television:\n" +
                "  - Pantalla: " + pantalla + "\n" +
                "  - Encendido: " + isEncendido() + "\n" +
                "  - Fabricante: " + fabricante + "\n" +
                "  - Número de Serie: " + numeroSerie + "\n" +
                "  - Marca: " + marca + "\n" +
                "  - Nombre: " + nombre + "\n" +
                "  - Costo: $" + costo;
    }
    
}
