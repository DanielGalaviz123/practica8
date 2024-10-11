import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        // Crear ArrayList para Smartphones
        ArrayList<Smarphone> listaDeSmartphones = new ArrayList<>();

        // Crear objetos Smartphone
        Sensor sensorHuella1 = new Sensor("optico", "mm", 100, "Samsung", "SENSOR1", "Samsung", "Sensor de Huella", 19.99f);
        Pantalla pantalla1 = new Pantalla(1080, 2400, "Samsung", "PANT1", "Samsung", "Pantalla AMOLED", 199.99f);
        Smarphone smartphone1 = new Smarphone(sensorHuella1, pantalla1, new Microprocesador(4, 3000L, "Qualcomm", "CPU1", "Qualcomm", "Snapdragon 888", 299.99f), 8, false, "Samsung", "SM1234", "Samsung", "Galaxy S21", 799.99f);
        
        Sensor sensorHuella2 = new Sensor("ultrasonido", "mm", 120, "Apple", "SENSOR2", "Apple", "Sensor de Huella", 29.99f);
        Pantalla pantalla2 = new Pantalla(1125, 2436, "Apple", "PANT2", "Apple", "Pantalla Retina", 249.99f);
        Smarphone smartphone2 = new Smarphone(sensorHuella2, pantalla2, new Microprocesador(6, 3500L, "Apple", "CPU2", "Apple", "A14 Bionic", 399.99f), 12, false, "Apple", "AP1234", "Apple", "iPhone 12", 999.99f);

        // Agregar Smartphones a la lista
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        // Crear ArrayList para TVs
        ArrayList<Television> listaDeTVs = new ArrayList<>();

        // Crear objetos Television
        Pantalla pantallaTV1 = new Pantalla(3840, 2160, "LG", "PANT3", "LG OLED", "OLED TV", 1299.99f);
        Television television1 = new Television(pantallaTV1, false, "LG", "TV1", "LG", "LG OLED 4K", 1499.99f);
        
        Pantalla pantallaTV2 = new Pantalla(1920, 1080, "Sony", "PANT4", "Sony LED", "Full HD TV", 799.99f);
        Television television2 = new Television(pantallaTV2, false, "Sony", "TV2", "Sony", "Sony Bravia", 999.99f);


        // Agregar Televisores a la lista
        listaDeTVs.add(television1);
        listaDeTVs.add(television2);

        // Desplegar atributos de los Smartphones
        System.out.println("Lista de Smartphones:");
        for (Smarphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone);
        }

        // Desplegar atributos de las Televisores
        System.out.println("\nLista de Televisores:");
        for (Television television : listaDeTVs) {
            System.out.println(television);
        }
    }
}
