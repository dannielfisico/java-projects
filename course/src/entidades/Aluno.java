package entidades;

public class Aluno {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public void status() {
		double total = notaFinal();
		if(total >= 60) {
			System.out.print("NOTA FINAL: "+String.format("%.2f%n", notaFinal())+"APROVADO");
		} else {
			System.out.print("NOTA FINAL: "+String.format("%.2f%n", notaFinal())+"REPROVADO"+String.format("%nFALTAM %.2f PONTOS", 60 - notaFinal()));
			
		}
	}
}
