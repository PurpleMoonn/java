package estudoCaso;

import javax.swing.JOptionPane;

public class Professor extends Usuario 
{
	//atributos comuns
	private String titulacao;
	private String dataAdmissao;
		
	//métodos de acesso - atributos comuns
	public String getTitulacao() 
	{	return titulacao;	}
	
	public void setTitulacao(String titulacao)
	{	this.titulacao = titulacao;	}
	
	public String getDataAdmissao()
	{	return dataAdmissao;	}
	
	public void setDataAdmissao(String dataAdmissao)
	{	this.dataAdmissao = dataAdmissao;	}
	
	//método construtor
	public Professor()
	{	//preenchimento dos atributos comuns por leitura (usuário)
		super();
		titulacao = JOptionPane.showInputDialog("Informe a titulação do professor:");
		dataAdmissao = JOptionPane.showInputDialog("Informe a data de admissão do professor:");
	}
	
	//operação
	public void imprimirComprovante()
	{}	
	
}