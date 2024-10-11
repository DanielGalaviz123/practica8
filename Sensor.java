public class Sensor extends ComponenteElectrico{

    protected String tipo;
    protected String unidadDeMedida;
    protected int valor;

    public Sensor(String tipo, String unidadDeMedida, int valor, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);

        this.tipo=tipo;
        this.unidadDeMedida=unidadDeMedida;
        this.valor=valor;
        
    
    }

    public String getTipo(){
        return tipo;
    }

    public String getUnidadDeMedida(){
        return unidadDeMedida;
    }

    public int getValor(){
        return valor;
    }

    @Override
public String toString() {
    return "Sensor {\n" +
            "  Tipo: '" + tipo + "',\n" +
            "  Unidad de Medida: '" + unidadDeMedida + "',\n" +
            "  Valor: " + valor + ",\n" +
            "  Fabricante: '" + fabricante + "',\n" +
            "  Número de Serie: '" + numeroSerie + "',\n" +
            "  Marca: '" + marca + "',\n" +
            "  Nombre: '" + nombre + "',\n" +
            "  Costo: $" + costo + "\n" +
            "}";
}



}
