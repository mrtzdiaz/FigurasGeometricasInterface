
public class Rombo implements Figuras{
	String name;
	double lado;
	double diagonalMenor;
	double diagonalMayor;
	
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (diagonalMenor * diagonalMayor)/2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Calculo Rombo";
	}
	
	
	
}
