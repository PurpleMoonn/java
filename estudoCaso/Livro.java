package estudoCaso;

import javax.swing.JOptionPane;

public class Livro 
{
	//atributos comuns
	private String nome;
	private String autor;
	private String editora;
	private int ano;
		
	//métodos de acesso - atributos comuns
	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public String getAutor()
	{	return autor;	}
	
	public void setAutor(String autor)
	{	this.autor = autor;	}
	
	public String getEditora()
	{	return editora;	}
	
	public void setEditora(String editora)
	{	this.editora = editora;	}
	
	public int getAno()
	{	return ano;	}
	
	public void setAno(int ano)
	{	this.ano = ano;	}
	
	//método construtor
	public Livro()
	{	//preenchimento dos atributos comuns por leitura (usuário)
		nome = JOptionPane.showInputDialog("Informe o nome do livro:");
		autor = JOptionPane.showInputDialog("Informe o autor do livro:");
		editora = JOptionPane.showInputDialog("Informe a editora do livro:");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publicação do livro:")); 
	}	
}