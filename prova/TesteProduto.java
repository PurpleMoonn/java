package prova;

import javax.swing.JOptionPane;

public class TesteProduto 
{

	public static void main(String[] args) {
		
		//1º Passo:
		Produto objProduto = new Produto();
		
		//2º Passo: 
		
		objProduto.setCodigo(JOptionPane.showInputDialog("Informe o código do produto: "));
		objProduto.setNome(JOptionPane.showInputDialog("Informe o nome do produto: "));
		objProduto.setQuantidadeEstoque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto em estoque: ")));
		objProduto.setQuantidadeVendida(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto vendida: ")));
		objProduto.setPrecoCusto(Float.parseFloat(JOptionPane.showInputDialog("Informe o preço custo do produto: ")));
		
		//3º Passo:
		
		JOptionPane.showMessageDialog(null, "O subtotal do produto é: " +objProduto.calcularSubtotal());
		
		JOptionPane.showMessageDialog(null, "O preço de venda do produto é: "+objProduto.calcularPrecoVenda());
		
		JOptionPane.showMessageDialog(null, "O valor total arrecado é: "+objProduto.calcularValorTotal());
		
		JOptionPane.showMessageDialog(null, "O lucro é: "+objProduto.calcularLucro());
			

	}

}
