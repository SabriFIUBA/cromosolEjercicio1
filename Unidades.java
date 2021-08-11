import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unidades implements Flota {
	private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Object[] vehiculosOrdenPrecioZA;
	
	
	public String vehiculoMasCaro() {
		Vehiculo vehiculoMasCaro = (Vehiculo) vehiculosOrdenPrecioZA[0];
		return vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo();
	}
	
	public String vehiculoMasBarato() {
		Vehiculo vehiculoMasBarato = (Vehiculo) vehiculosOrdenPrecioZA[vehiculosOrdenPrecioZA.length-1];
		return vehiculoMasBarato.getMarca() + " " + vehiculoMasBarato.getModelo();
	}
	
	public String buscar(String clave_){
		String resultado = "";
		
		for (Vehiculo v : vehiculos) {
			if (v.getMarca().contains(clave_)) {
				resultado = resultado + v.getMarca() + " " + v.getModelo() + " $" + v.getPrecioToString() +  "\n";
			}
        }
		return resultado;
	}
	
	public Unidades(List<Vehiculo> listaVehiculos) {
		this.vehiculos = listaVehiculos;
		
		ArrayList<Vehiculo> vehiculosAux = new ArrayList<Vehiculo>();	
		vehiculosAux.addAll(listaVehiculos);
		this.vehiculosOrdenPrecioZA = vehiculosAux.toArray();
		
		Arrays.sort(vehiculosOrdenPrecioZA);
	}
	
	public String imprimirFlota() {
		return this.toString();
	}
	
	@Override
	public String imprimirFlotaOrdenPrecioZA() {
		String unidades = "";
		for (Object v : vehiculosOrdenPrecioZA) {
			unidades = unidades + ((Vehiculo) v).getMarca() + " " + ((Vehiculo) v).getModelo() + "\n";			
        }
		return unidades;
	}
	
	public String toString() {
		String unidades = "";
		for (Vehiculo v : vehiculos) {
			unidades = unidades + v.toString() + "\n";
        }
		return unidades;
	}
}
