
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"THIAGO", "JOAO", "MARCIA", "TELMA", "VALERIA", "LUCAS"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
		
	}
	
	static void entrandoEmContato (String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
		    continuaTentando = !atendeu;
			if(continuaTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso");
			}
		}while(continuaTentando && tentativasRealizadas<3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas);
		}
		else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + " NUMERO MAIXMO DE TENTATIVAS " + tentativasRealizadas);
		}
	}
	
	
	
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
		
	
	
	static void imprimirSelecionados() {
	String [] candidatos = {"THIAGO", "JOAO", "MARCIA", "TELMA", "VALERIA", "LUCAS"};
	System.out.println("Imprimindo a lista de candidatod informando o indice do elemento");
	for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O Candidatode numero" + (indice+1) + "é" + candidatos[indice]);
		}
	 System.out.println("Forma abrevidada de interação com for each");
	 
	 for(String candidato : candidatos) {
		 System.out.println(candidato);
	
	 }
	}

	static void selecaoCandidatos() {
		String [] candidatos = {"THIAGO", "JOAO", "MARCIA", "TELMA", "VALERIA", "MARCIO", "LUCAS", "LEO", "ZE", "LIMA"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual=0;
	    double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			
			System.out.println("O Candidato " + candidato + "Solicitou este valor de salario" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O Canditado " + candidato + " Foi selecionado para a a vaga");
				candidatosSelecionados++;
			}
			
			candidatosAtual++;
		}
 	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if(salarioBase==salarioPretendido) {
			System.out.println("Ligar para canditado com contra proposta");
	}else {
		System.out.println("Aguardando o resultado dos demais candidatos");
	
	  }
	}
 }
