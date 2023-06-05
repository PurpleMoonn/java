package prova;

import javax.swing.JOptionPane;

public class TesteProduto 
{

	public static void main(String[] args) {
		
		//1� Passo:
		Produto objProduto = new Produto();
		
		//2� Passo: 
		
		objProduto.setCodigo(JOptionPane.showInputDialog("Informe o c�digo do produto: "));
		objProduto.setNome(JOptionPane.showInputDialog("Informe o nome do produto: "));
		objProduto.setQuantidadeEstoque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto em estoque: ")));
		objProduto.setQuantidadeVendida(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto vendida: ")));
		objProduto.setPrecoCusto(Float.parseFloat(JOptionPane.showInputDialog("Informe o pre�o custo do produto: ")));
		
		//3� Passo:
		
		JOptionPane.showMessageDialog(null, "O subtotal do produto �: " +objProduto.calcularSubtotal());
		
		JOptionPane.showMessageDialog(null, "O pre�o de venda do produto �: "+objProduto.calcularPrecoVenda());
		
		JOptionPane.showMessageDialog(null, "O valor total arrecado �: "+objProduto.calcularValorTotal());
		
		JOptionPane.showMessageDialog(null, "O lucro �: "+objProduto.calcularLucro());
			

	}

}
