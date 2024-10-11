import java.util.ArrayList;

public class DispositivosElectronico{

    protected String fabricante;//inmutable
    protected String numeroSerie;//inmutable
    protected String marca;//inmutable
    protected String nombre;//inmutable
    protected float costo;//mutable

    ArrayList<ComponenteElectrico> componentes= new ArrayList<>();

    public DispositivosElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getNumeroSerie(){
        return numeroSerie;
    }

    public String getMarca(){
        return marca;
    }

    public String getNombre(){
        return nombre;
    }

    public float getCosto(){
        return costo;
    }

    public void setCosto(float costo){
        this.costo=costo;
    }

    public void agregarComponente(ComponenteElectrico componente){
        componentes.add(componente);
    }

    public void quitarComponente(ComponenteElectrico componente){
        if(componentes.remove(componente)){
            System.out.println("Componente"+ componente +"eliminado");
        }else{
            System.out.println("No encontrado");
        }

    }

     
     @Override
     public String toString() {
         return "DispositivosElectronico {" +
                 "fabricante='" + fabricante + '\'' +
                 ", numeroSerie='" + numeroSerie + '\'' +
                 ", marca='" + marca + '\'' +
                 ", nombre='" + nombre + '\'' +
                 ", costo=" + costo +
                 ", componentes=" + componentes +
                 '}';
     }


}