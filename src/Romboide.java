public class Romboide implements Figuras{
	String name;
	double base;
	double altura;
	
	public Romboide(String name, double base, double altura) {
		this.name = name;
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (base*2) + (altura*2);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Calculo Romboide";
		
	}
}
