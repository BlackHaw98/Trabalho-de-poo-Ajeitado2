import javax.swing.JOptionPane;

public class Veiculo {
	
	String nome;
	String placa;
	String cor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public Veiculo(String nome,String placa,String cor){
		this.nome=nome;
		this.placa=placa;
		this.cor=cor;		
	}
	
	@Override
	public String toString(){ /*faz com que n retorne o end da memoria*/
		return nome+"\n"+"Placa: "+placa+"\n"+"COR: "+cor+"\n";
	}
	
	public void addCarro(){
		int condicao=Integer.parseInt(JOptionPane.showInputDialog("caso queira adicionar mais carros digite 1. caso contrario digite 0"));
		
		while(condicao!=0 ){
		
		
		JOptionPane.showMessageDialog(null,"digite nome,Placa e Cor de seu veiculo");
		
		nome=JOptionPane.showInputDialog("digite o nome do carro");
		placa=JOptionPane.showInputDialog("digite a placa do carro");
		cor=JOptionPane.showInputDialog("digite a cor do carro");
		
		System.out.println("nome do carro : "+nome);
		System.out.println("placa : "+placa);
		System.out.println("cor : "+cor);
		
		
		}
		
		
			
			
		}
	
			}
	
	
	
	
	

