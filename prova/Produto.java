package prova;

public class Produto {

	//atributos
	private String codigo;
	private String nome;
	private int quantidadeEstoque;
	private int quantidadeVendida;
	private float precoCusto;
	
	//métodos de acesso
	public void setCodigo(String c)
	{ codigo = c; }
	
	public String getCodigo()
	{ return codigo; }
	
	public void setNome (String n)
	{ nome = n;}
	
	public String getNome()
	{ return nome;}
	
	public void  setQuantidadeEstoque(int q)
	{quantidadeEstoque = q; }
	
	public int getQuantidadeEstoque()
	{ return quantidadeEstoque; }
	
	public void setQuantidadeVendida(int v)
	{ quantidadeVendida = v;}
	
	public int getQuantidadeVendida()
	{ return quantidadeVendida;}
	
	public void setPrecoCusto(float p)
	{ precoCusto = p;}
	
	public float getPrecoCusto()
	{ return precoCusto; }
	
	//operações 
	float precoF;
	
	public float calcularSubtotal()
	{ 	return quantidadeEstoque*precoCusto; }
	
	public float calcularPrecoVenda()
	{	return  precoF = (float) (0.3*precoCusto + precoCusto);} 
	
	public float calcularValorTotal()
	{	return (float) (quantidadeVendida*precoF);}
	
	public float calcularLucro()
	{ 	return (float) (precoF*quantidadeVendida)-(precoCusto*quantidadeEstoque); }
	
	
	
	
	
	
}

