package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double deducoes;
	
	public double salarioLiquido() {
		return salarioBruto - deducoes;
	}
	
	public double aumentarSalarioBruto(double porcentagem) {
		return salarioBruto+= salarioBruto * (porcentagem/100) - deducoes;
	}

}
