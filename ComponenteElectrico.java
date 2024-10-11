public class ComponenteElectrico extends DispositivosElectronico{

    

    public ComponenteElectrico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        
    }

    @Override
    public String toString() {
        return "ComponenteElectrico {" +
                "fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }

    


}