
public class Trapecio implements Figuras{
	String name;
	double lado1;
	double lado2;
	double baseMenor;
	double baseMayor;
	double altura;
	
	public Trapecio(String name, double lado1, double lado2, double baseMenor,
			double baseMayor, double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (baseMenor+baseMayor)*altura/2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + baseMenor + baseMayor;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Calculo de trapecio";
	}
	
	
	
}
