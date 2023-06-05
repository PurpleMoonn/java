package estudoCaso;

import javax.swing.JOptionPane;

public abstract class Usuario
{
	//atributos comuns
	protected String nome;
	protected String matricula;

	//métodos de acesso - atributos comuns
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getMatricula()
	{	return matricula;	}
	
	public void setMatricula(String matricula)
	{	this.matricula = matricula;	}
	
	//método construtor
	public Usuario()
	{	//preenchimento dos atributos comuns por leitura (usuário)
		nome = JOptionPane.showInputDialog("Informe o nome do usuário:");
		matricula = JOptionPane.showInputDialog("Informe a matrícula do usuário:");
	}
	
	//operações
	public void fazerEmprestimo()
	{}
	
	public void imprimirComprovante()
	{}
	
}
