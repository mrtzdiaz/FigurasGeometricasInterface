
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);
		Cuadrado cuadradorojo = new Cuadrado("Cuadrado1",15);
		Rectangulo rectanguloazul = new Rectangulo ("Rectangulo1", 20, 10);
		Rombo romboverde = new Rombo("Rombo1", 10,15,20);
		Romboide romboideamarillo = new Romboide ("Romboide1", 29, 10);
		Trapecio trapeciomorado = new Trapecio("Trapecio1", 15, 15, 20, 30, 18);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(cuadradorojo);
		imprimirCalculo(rectanguloazul);
		imprimirCalculo(romboverde);
		imprimirCalculo(romboideamarillo);
		imprimirCalculo(trapeciomorado);
	}
	
	public static void imprimirCalculo(Figuras f) {
		System.out.println(f.toString());
		System.out.println("+=======================");
		System.out.println("| El área de ["+ f.getNombre() +"] es: " + f.calcularArea());
		System.out.println("| El perímetro de ["+ f.getNombre() +"] es: " + f.calcularPerimetro());
		System.out.println("+=======================");
	}

}
