package lista04questao01;

public class Retangulo 

{
	
	//atributos
	
	private float base;
	private float altura;
	
	
	//métodos de acesso
	 
	public void setBase(float b)
	{   base = b;   }
	
	public float getBase()	
	{ return base;  }
	
	public void setAltura(float a)
	{   altura = a; }
	
	public float getAltura()
	{  return altura; }
	
	
	//operações
	
	public float calcularArea()
	{ return base*altura;  }
	
	public float calcularPerimetro()
	{ return 2*(base+altura); }
	
	public double calcularDiagonal()
	{ return Math.sqrt(Math.pow(base,2)) + Math.pow(altura,2);}
	
}