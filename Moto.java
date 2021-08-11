public class Moto extends Vehiculo implements Comparable<Vehiculo> {
	
	private String cilindrada;
	
	public Moto(String marca_, String modelo_, double precio_, String cilindrada_) {
		super.setMarca(marca_);
		super.setModelo(modelo_);
		this.cilindrada = cilindrada_;
		super.setPrecio(precio_);
	}
	
	public String toString() {
		return ("Marca: " + super.getMarca() + " // " + 
	"Modelo: " + super.getModelo() + " // " + 
	"Puertas: " + cilindrada + " // " + 
	"Precio: $" + super.getPrecioToString());
	}
}