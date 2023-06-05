package estudoCaso;

import javax.swing.JOptionPane;

public class Aluno extends Usuario 
{
	//atributos comuns
	private String curso;
	private String dataNascimento;
	
	//métodos de acesso - atributos comuns
	public String getCurso()
	{	return curso;	}
	
	public void setCurso(String curso)
	{	this.curso = curso;	}
	
	public String getDataNascimento()
	{	return dataNascimento;	}
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}
	
	//método construtor
	public Aluno()
	{	//preenchimento dos atributos comuns por leitura (usuário)
		super();
		curso = JOptionPane.showInputDialog("Informe o curso do aluno:");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno:");
	}
	
	//operação
	public void imprimirComprovante()
	{}	

}