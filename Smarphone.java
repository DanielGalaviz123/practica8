public class Smarphone extends Computadora {

    protected Sensor sensorDeHuella;
    protected Pantalla pantalla;

    public Smarphone(Sensor sensorDeHuella, Pantalla pantalla, Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie,
            String marca, String nombre, float costo) {
        super(cpu, ramMB, encendido, fabricante, numeroSerie, marca, nombre, costo);
        this.sensorDeHuella=sensorDeHuella;
        this.pantalla=pantalla;
    }

    public Sensor getSensorDeHuella(){
        return sensorDeHuella;
    }

    public Pantalla getPantalla(){
        return pantalla;
    }

     // Sobrescribir el método toString() para incluir todos los atributos
     @Override
     public String toString() {
        return "Smarphone:\n" +
                "  - Sensor de Huella: " + sensorDeHuella + "\n" +
                "  - Pantalla: " + pantalla + "\n" +
                "  - CPU: " + cpu + "\n" +
                "  - RAM: " + ramMB + " MB\n" +
                "  - Encendido: " + isEncendido() + "\n" +
                "  - Fabricante: " + fabricante + "\n" +
                "  - Numero de Serie: " + numeroSerie + "\n" +
                "  - Marca: " + marca + "\n" +
                "  - Nombre: " + nombre + "\n" +
                "  - Costo: $" + costo;
    }
    
}
