public class DispositivoElectricoDeConsumo extends DispositivosElectronico{

    public boolean encendido;

    public DispositivoElectricoDeConsumo(boolean encendido, String fabricante, String numeroSerie, String marca, String nombre,
            float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);

        this.encendido=encendido;
        
    }

    public boolean isEncendido(){
        return encendido;
    }

    public void encender(){
        if(!encendido){
            encendido= true;
            System.out.println("ENCENDIDO");
        }else{
            System.out.println("Apagado");
        }
    }

    public void apagar(){
        if(encendido){
            encendido= false;
            System.out.println("Apagado");
        }else{
            System.out.println("Ya estaba apagado");
        }
    }
    public String toString() {
        return "DispositivoElectricoDeConsumo {" +
                "encendido=" + encendido +
                ", fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }



    
    
}
