public class Pantalla extends ComponenteElectrico{

    protected int resolucionX;
    protected int resolucionY;

    public Pantalla(int resolucionX, int resolucionY, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.resolucionX=resolucionX;
        this.resolucionY=resolucionY;
    }

    public int getResolucionX(){
        return resolucionX;
    }

    public int getResolucionY(){
        return resolucionY;
    }

    public String toString() {
        return "Pantalla {\n" +
                "  Resolucion: " + resolucionX + " x " + resolucionY + ",\n" +
                "  Fabricante: '" + fabricante + "',\n" +
                "  Número de Serie: '" + numeroSerie + "',\n" +
                "  Marca: '" + marca + "',\n" +
                "  Nombre: '" + nombre + "',\n" +
                "  Costo: $" + costo + "\n" +
                "}";
    }
    
}
