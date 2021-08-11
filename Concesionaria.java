import java.util.ArrayList;
import java.util.List;

public class Concesionaria {
	
	public static Unidades flota = new Unidades(cargarUnidades());

	public static void main(String[] args) {
		
		System.out.println(flota.imprimirFlota());
		System.out.println("=============================\n");
		System.out.println("Vehículo más caro: " + flota.vehiculoMasCaro());
		System.out.println("Vehículo más barato: " + flota.vehiculoMasBarato());
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + flota.buscar("Y"));
		System.out.println("=============================\n");
		System.out.println("Vehículos ordenados por precio de mayor a menor:\n" + flota.imprimirFlotaOrdenPrecioZA());
	}
	
public static List<Vehiculo> cargarUnidades() {

		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		Auto auto1 = new Auto("Peugeot","206",200000.00,4); vehiculos.add(auto1);
		Auto auto2 = new Auto("Peugeot","208",250000.00,5); vehiculos.add(auto2);
		Moto moto1 = new Moto("Honda","Titan",60000.00,"125c"); vehiculos.add(moto1);
		Moto moto2 = new Moto("Yamaha","YBR",80500.50,"160c"); vehiculos.add(moto2);
		
		return vehiculos;	
	}
}
