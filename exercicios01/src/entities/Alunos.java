package entities;

public class Alunos {
	private String name;
	private double[] notas;
	private double svg;
	
	
	public Alunos(String name, double[] notas) {
		this.name = name;
		this.notas = notas;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia(double[] notas) {
		double soma = 0;
		for(double nota : notas) {
			soma+= nota;
		}
		
		svg = soma/notas.length;
		return svg;
	}
	
	public double getSvg() {
		return svg;
		
	}
	
	public String resultadoFinal(double svg) {
		if(svg < 7.0) {
			return "Reprovado";
		} else {
			return "Aprovado";
		}
		
	}
	
	public String statusNotas(double[] notas) {
		String baixas = "";
		String altas = "";
		for(double nota : notas) {
			if(nota <7) {
				baixas+= String.format("%.2f ", nota);
			} else {
				altas+= String.format("%.2f ", nota);
			}
		}
		
		return String.format("Notas baixas: %s%nNotas altas: %s", baixas, altas);
	}


	@Override
	public String toString() {
		return Alunos.reflectionToString(this, new Alunos(name, notas));
		//return "Alunos [name=" + name + ", notas=" + Arrays.toString(notas) + ", svg=" + svg + "]";
		//return String.format("Nome: %s, Notas: %s, Média: %.2f%nStatus: %s%n%s%n", getName(), Arrays.toString(notas), getSvg(), resultadoFinal(svg), statusNotas(notas));
	}


	private static String reflectionToString(Alunos alunos, Alunos alunos2) {
		// TODO Auto-generated method stub
		return String.format("Nome: %s, Notas: %s, Média: %.2f%nStatus: %s%n%s%n", name, Arrays.toString(notas), getSvg(), resultadoFinal(svg), statusNotas(notas));
		//return null;
	}

	
	
	
	
	

}
