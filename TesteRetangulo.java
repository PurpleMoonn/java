package lista04questao01;

public class TesteRetangulo 
{
	public static void main(String[] args) 
	{
		//1� Passo:
		
		Retangulo objRetangulo = new Retangulo();
		
		//2� Passo:
		
		objRetangulo.setBase(8);
		objRetangulo.setAltura(10);
		
		//3� Passo:
		System.out.println("�rea do ret�ngulo ="+objRetangulo.calcularArea());
		System.out.println("Per�metro do ret�ngulo ="+objRetangulo.calcularPerimetro());
		System.out.println("Diagonal do ret�ngulo ="+objRetangulo.calcularDiagonal());
		System.out.println("Valor da base do ret�ngulo ="+objRetangulo.getBase());
		System.out.println("Valor da altura do ret�ngulo ="+objRetangulo.getAltura());
	
	}

}
