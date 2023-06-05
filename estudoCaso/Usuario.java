package estudoCaso;

import javax.swing.JOptionPane;

public abstract class Usuario
{
	//atributos comuns
	protected String nome;
	protected String matricula;

	//m�todos de acesso - atributos comuns
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getMatricula()
	{	return matricula;	}
	
	public void setMatricula(String matricula)
	{	this.matricula = matricula;	}
	
	//m�todo construtor
	public Usuario()
	{	//preenchimento dos atributos comuns por leitura (usu�rio)
		nome = JOptionPane.showInputDialog("Informe o nome do usu�rio:");
		matricula = JOptionPane.showInputDialog("Informe a matr�cula do usu�rio:");
	}
	
	//opera��es
	public void fazerEmprestimo()
	{}
	
	public void imprimirComprovante()
	{}
	
}
