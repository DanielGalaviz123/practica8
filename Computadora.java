public class Computadora extends DispositivoElectricoDeConsumo{

    protected Microprocesador cpu;
    protected long ramMB;



    public Computadora(Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre,
            float costo) {
        super(encendido, fabricante, numeroSerie, marca, nombre, costo);

        this.cpu=cpu;
        this.ramMB=ramMB;
        
    }

    public Microprocesador getCpu(){
        return cpu;
    }

    public long getRamMB(){
        return ramMB;
    }

    public void setCpu(Microprocesador cpu){
        this.cpu=cpu;
    } 

    public void setRamMB(long ramMB){
        this.ramMB=ramMB;
    }

    public String toString() {
        return "Computadora {" +
                "cpu=" + cpu + 
                ", ramMB=" + ramMB +
                ", encendido=" + encendido +
                ", fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }
    
}
