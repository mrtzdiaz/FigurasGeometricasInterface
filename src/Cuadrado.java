
public class Cuadrado implements Figuras{
	String nombre;
	double lado;
	
	
	public Cuadrado(String nombre, double lado) {
		this.nombre = nombre;
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Calculo de cuadrado";
	}

}
