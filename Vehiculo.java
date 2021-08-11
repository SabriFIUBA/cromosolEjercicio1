import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private double precio;

	public int compareTo(Vehiculo vehiculo_) {
		if (precio < vehiculo_.getPrecio()) {
			return 1;
		} else {
			return -1;
		}
	}
	
	String getMarca() { return marca; }
	void setMarca(String marca_) { this.marca = marca_; }
	
	String getModelo() { return modelo; }
	void setModelo(String modelo_) { this.modelo = modelo_; }
	
	double getPrecio() { return precio; }
	void setPrecio(double precio_) { this.precio = precio_; }
	String getPrecioToString() {
		DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
		simbolo.setDecimalSeparator(',');
	    simbolo.setGroupingSeparator('.');
	    DecimalFormat formatPrecio = new DecimalFormat("###,###.00",simbolo);
		return formatPrecio.format(getPrecio());
	};
	
}
