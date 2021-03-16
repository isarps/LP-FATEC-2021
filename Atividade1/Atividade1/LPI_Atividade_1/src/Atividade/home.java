package Atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		ArrayList<cachorro> listaCachorros = AdicionarListaCachorros();
			
		System.out.println("MENU \n" +
						   "1 - Conferir todos os cachorros cadastrados \n" +
						   "2 - Conferir Dados de um Cachorro \n" +
						   "3 - Conferir se está latindo \n" +
						   "4 - Conferir qual o cachorro mais velho \n" +
						   "5 - Brincar com um cachorro \n"
				);
		
		int op = scan.nextInt();
		
		switch(op) {
		case 1:
			ExibirListaCachorros(listaCachorros);
			break;
		case 2:
			System.out.println("Insira o nome do cachorro para conferir: ");
			String nomeDados = scan.next();
			VerificarDados(nomeDados, listaCachorros);
			break;
		case 3:
			System.out.println("Insira o nome do cachorro para conferir: ");
			String nomeVerificarLatido = scan.next();
			Latir(nomeVerificarLatido, listaCachorros);
			break;
		case 4:
			VerificaCachorroMaisVelho(listaCachorros);
			break;
		case 5:
			System.out.println("Insira o nome do cachorro que vai brincar: ");
			String nomeBrincar = scan.next();
			Brincar(nomeBrincar, listaCachorros);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}

	}
	
	//Adicionando Cachorros
	
	public static ArrayList<cachorro> AdicionarListaCachorros() {
		ArrayList<cachorro> listaCachorros = new ArrayList<cachorro>();
		
		//Nome, Idade, Raça, Tutor, Sexo, Peso, Porte, Latindo, Brincando
		listaCachorros.add(new cachorro("Judy",
										6,
										"Vira Lata",
										"Isabella",
										"Fêmea",
										9,
										"Pequeno",
										false,
										false));
		
		listaCachorros.add(new cachorro("Billy",
										3,
										"Yorkshire",
										"Adriana",
										"Macho",
										5,
										"Mini",
										true,
										true));
		
		listaCachorros.add(new cachorro("Tommy",
										8,
										"Golden",
										"Marcio",
										"Macho",
										16,
										"Médio",
										false,
										true));
		
		listaCachorros.add(new cachorro("Dalila",
										2,
										"Rottweiler",
										"Juliano",
										"Fêmea",
										17,
										"Médio",
										true,
										false));
		
		listaCachorros.add(new cachorro("Belinha",
										10,
										"Pug",
										"Amanda",
										"Fêmea",
										4,
										"Mini",
										false,
										true));
		return listaCachorros;
	}
	
	//Métodos de Ação
	
	public static void ExibirListaCachorros(ArrayList<cachorro> listaCachorros) {
		
		System.out.println("Estes são os cachorros cadastrados:");
		for(cachorro cachorro: listaCachorros) {
			String latindo = cachorro.isLatindo() ? "Sim" : "Não";
			String brincando = cachorro.isBrincando() ? "Sim" : "Não";
			
			System.out.println("\nNome: " + cachorro.getNome() + 
					"\nIdade: " + cachorro.getIdade() + 
					"\nSexo: " + cachorro.getSexo() +
					"\nRaça: " + cachorro.getRaca() +
					"\nPorte: " + cachorro.getPorte() +
					"\nPeso: " + cachorro.getPeso() +
					"\nTutor: " + cachorro.getTutor() +
					"\nLatindo: " + latindo +
					"\nBrincando: " + brincando +
					"\n---------------------------------");
		}
	}
	
		public static void Latir(String nome, ArrayList<cachorro> listaCachorros) {
			
			cachorro cachorro = new cachorro();
			
			for(cachorro c: listaCachorros) {
				if(nome.toUpperCase().equals(c.getNome().toUpperCase())) {
					cachorro = c;
				}
			}
			
			String verificaLatido = "";
			String nomeCachorro = cachorro.getNome();
			
			if(cachorro.isLatindo()) {
				verificaLatido = "O cachorro " + nomeCachorro + " está latindo.";
			}
			else {
				verificaLatido = "O cachorro " + nomeCachorro + " não está latindo.";
			}
			
			System.out.println(verificaLatido);
		}
		
		

		public static void VerificarDados(String nome, ArrayList<cachorro> listaCachorros) {
			
			for(cachorro cachorro: listaCachorros) {
				if(nome.toUpperCase().equals(cachorro.getNome().toUpperCase())) {
					String latindo = cachorro.isLatindo() ? "Sim" : "Não";
					String brincando = cachorro.isBrincando() ? "Sim" : "Não";
					
					System.out.println(
							"Dados do Cachorro: " + 
							"\nNome: " + cachorro.getNome() + 
							"\nIdade: " + cachorro.getIdade() + 
							"\nSexo: " + cachorro.getSexo() +
							"\nRaça: " + cachorro.getRaca() +
							"\nPorte: " + cachorro.getPorte() +
							"\nPeso: " + cachorro.getPeso() +
							"\nTutor: " + cachorro.getTutor() +
							"\nLatindo: " + latindo +
							"\nBrincando: " + brincando 
							);
				}
			}
					
		}
		
		public static void VerificaCachorroMaisVelho(ArrayList<cachorro> listaCachorros) {
			String nomeMaisVelho = "";
			int idadeMaisVelho = 0;
			
			for(cachorro cachorro: listaCachorros) {
				if(idadeMaisVelho < cachorro.getIdade()) {
					idadeMaisVelho = cachorro.getIdade();
					nomeMaisVelho = cachorro.getNome();
				}
			}
			
			System.out.println("O cachorro mais velho é " + nomeMaisVelho + ", com " + idadeMaisVelho + " anos.");
		}
		

		public static void Brincar(String nome, ArrayList<cachorro> listaCachorros) {		
			for(cachorro cachorro: listaCachorros) {
				if(nome.toUpperCase().equals(cachorro.getNome().toUpperCase())) {
					cachorro.setBrincando(true);
					String brincando = cachorro.isBrincando() ? "Sim" : "Não";
					System.out.println("Cachorro brincando? " + brincando);
				}			
			}
		}

}
