package estudoCaso;

import javax.swing.JOptionPane;

public class Professor extends Usuario 
{
	//atributos comuns
	private String titulacao;
	private String dataAdmissao;
		
	//m�todos de acesso - atributos comuns
	public String getTitulacao() 
	{	return titulacao;	}
	
	public void setTitulacao(String titulacao)
	{	this.titulacao = titulacao;	}
	
	public String getDataAdmissao()
	{	return dataAdmissao;	}
	
	public void setDataAdmissao(String dataAdmissao)
	{	this.dataAdmissao = dataAdmissao;	}
	
	//m�todo construtor
	public Professor()
	{	//preenchimento dos atributos comuns por leitura (usu�rio)
		super();
		titulacao = JOptionPane.showInputDialog("Informe a titula��o do professor:");
		dataAdmissao = JOptionPane.showInputDialog("Informe a data de admiss�o do professor:");
	}
	
	//opera��o
	public void imprimirComprovante()
	{}	
	
}