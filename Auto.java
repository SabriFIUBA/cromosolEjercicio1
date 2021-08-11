public class Auto extends Vehiculo implements Comparable<Vehiculo> {
	
	private int puertas;
	
	public Auto(String marca_, String modelo_, double precio_, int puertas_) {
		super.setMarca(marca_);
		super.setModelo(modelo_);
		this.puertas = puertas_;
		super.setPrecio(precio_);
	}
	
	public String toString() {
		return ("Marca: " + super.getMarca() + " // " + 
	"Modelo: " + super.getModelo() + " // " + 
	"Puertas: " + puertas + " // " + 
	"Precio: $" + super.getPrecioToString());
	}
}