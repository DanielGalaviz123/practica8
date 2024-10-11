public class Microprocesador extends ComponenteElectrico{


    protected int cacheRAM;
    protected long velocidadHz;

    public Microprocesador(int cacheRAM, long velocidadHz,String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        
        this.cacheRAM=cacheRAM;
        this.velocidadHz=velocidadHz;

    }

    public int getcacheRAM(){
        return cacheRAM;
    }

    public long getVelocidadHz(){
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador {\n" +
                "  Cache RAM: " + cacheRAM + " KB,\n" +
                "  Velocidad: " + velocidadHz + " Hz,\n" +
                "  Fabricante: '" + fabricante + "',\n" +
                "  Número de Serie: '" + numeroSerie + "',\n" +
                "  Marca: '" + marca + "',\n" +
                "  Nombre: '" + nombre + "',\n" +
                "  Costo: $" + costo + "\n" +
                "}";
    }


    
    
}
