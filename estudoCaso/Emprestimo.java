package estudoCaso;

import javax.swing.JOptionPane;

public class Emprestimo
{
	//atributos comuns
	private String dataEmprestimo;
	private int prazo;
	private String dataDevolucao;
	
	//m�todos de acesso - atributos comuns
	
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
	
	//m�todo construtor
	public Emprestimo()
	{	//preenchimento dos atributos comuns por leitura (usu�rio)
		dataEmprestimo = JOptionPane.showInputDialog("Informe a data do empr�stimo:"); 
		prazo = Integer.parseInt(JOptionPane.showInputDialog("Informe o prazo do empr�stimo:")); 
		dataDevolucao = JOptionPane.showInputDialog("Informe a data de devolu��o do empr�stimo:");
	}
	
	//opera��o
	public void emprestarLivro()
	{}

}