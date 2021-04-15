package atividade2;

import java.util.ArrayList;

public class Cachorro {

	//Variáveis
	
	public String Nome;
	public int Idade;
	public String Raca;
	public String Tutor;
	public String Sexo;
	public float Peso;
	public String Porte;
	public boolean Latindo;
	public boolean Brincando;
	
	// Construtor
	
	public Cachorro(String nome, int idade, String raca, String tutor, String sexo, float peso, String porte, boolean latindo, boolean brincando) {
		Nome = nome;
		Idade = idade;
		Raca = raca;
		Tutor = tutor;
		Sexo = sexo;
		Peso = peso;
		Porte = porte;
		Latindo = latindo;
		Brincando = brincando;
	}
	
	public Cachorro() {};
	
	//Getters e Setters
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
	}

	public String getTutor() {
		return Tutor;
	}

	public void setTutor(String tutor) {
		Tutor = tutor;
	}

	public float getPeso() {
		return Peso;
	}

	public void setPeso(float peso) {
		Peso = peso;
	}

	public String getPorte() {
		return Porte;
	}

	public void setPorte(String porte) {
		Porte = porte;
	}
	
	
	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}


	public boolean isLatindo() {
		return Latindo;
	}

	public void setLatindo(boolean latindo) {
		Latindo = latindo;
	}


	public boolean isBrincando() {
		return Brincando;
	}


	public void setBrincando(boolean brincando) {
		Brincando = brincando;
	}
	
	
	
}