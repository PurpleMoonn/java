package estudoCaso;

import javax.swing.JOptionPane;

public class Emprestimo
{
	//atributos comuns
	private String dataEmprestimo;
	private int prazo;
	private String dataDevolucao;
	
	//métodos de acesso - atributos comuns
	
	public String getDataEmprestimo()
	{	return dataEmprestimo;	}
	
	public void setDataEmprestimo(String dataEmprestimo)
	{	this.dataEmprestimo = dataEmprestimo;	}
	
	public int getPrazo()
	{	return prazo;	}
	
	public void setPrazo(int prazo)
	{	this.prazo = prazo;	}
	
	public String getDataDevolucao()
	{	return dataDevolucao;	}
	
	public void setDataDevolucao(String dataDevolucao)
	{	this.dataDevolucao = dataDevolucao;	}
	
	//método construtor
	public Emprestimo()
	{	//preenchimento dos atributos comuns por leitura (usuário)
		dataEmprestimo = JOptionPane.showInputDialog("Informe a data do empréstimo:"); 
		prazo = Integer.parseInt(JOptionPane.showInputDialog("Informe o prazo do empréstimo:")); 
		dataDevolucao = JOptionPane.showInputDialog("Informe a data de devolução do empréstimo:");
	}
	
	//operação
	public void emprestarLivro()
	{}

}