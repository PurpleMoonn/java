package lista04questao01;

public class TesteRetangulo 
{
	public static void main(String[] args) 
	{
		//1º Passo:
		
		Retangulo objRetangulo = new Retangulo();
		
		//2º Passo:
		
		objRetangulo.setBase(8);
		objRetangulo.setAltura(10);
		
		//3º Passo:
		System.out.println("Área do retângulo ="+objRetangulo.calcularArea());
		System.out.println("Perímetro do retângulo ="+objRetangulo.calcularPerimetro());
		System.out.println("Diagonal do retângulo ="+objRetangulo.calcularDiagonal());
		System.out.println("Valor da base do retângulo ="+objRetangulo.getBase());
		System.out.println("Valor da altura do retângulo ="+objRetangulo.getAltura());
	
	}

}
