package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {

    ArrayList<Cachorro> listaCachorros;

    //Adicionando Cachorros
    public ArrayList<Cachorro> AdicionarListaCachorros() {
        listaCachorros = new ArrayList<Cachorro>();

        //Nome, Idade, Raça, Tutor, Sexo, Peso, Porte, Latindo, Brincando
        listaCachorros.add(new Cachorro("Judy",
                6,
                "Vira Lata",
                "Isabella",
                "Fêmea",
                9,
                "Pequeno",
                false,
                false));

        listaCachorros.add(new Cachorro("Billy",
                3,
                "Yorkshire",
                "Adriana",
                "Macho",
                5,
                "Mini",
                true,
                true));

        listaCachorros.add(new Cachorro("Tommy",
                13,
                "Golden",
                "Marcio",
                "Macho",
                16,
                "Médio",
                false,
                true));

        listaCachorros.add(new Cachorro("Dalila",
                2,
                "Rottweiler",
                "Juliano",
                "Fêmea",
                17,
                "Médio",
                true,
                false));

        listaCachorros.add(new Cachorro("Belinha",
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
    public String ExibirListaCachorros(ArrayList<Cachorro> listaCachorros) {

        String cachorros = "";

        //System.out.println("Estes são os cachorros cadastrados:");
        for (Cachorro cachorro : listaCachorros) {
            String latindo = cachorro.isLatindo() ? "Sim" : "Não";
            String brincando = cachorro.isBrincando() ? "Sim" : "Não";

            cachorros += ("Nome: " + cachorro.getNome()
                    + "<br>Idade: " + cachorro.getIdade()
                    + "<br>Sexo: " + cachorro.getSexo()
                    + "<br>Raça: " + cachorro.getRaca()
                    + "<br>Porte: " + cachorro.getPorte()
                    + "<br>Peso: " + cachorro.getPeso()
                    + "<br>Tutor: " + cachorro.getTutor()
                    + "<br>Latindo: " + latindo
                    + "<br>Brincando: " + brincando
                    + "<br>---------------------------------<br>");
        }

        return cachorros;
    }

    public String Latir(String nome, ArrayList<Cachorro> listaCachorros) {

        Cachorro cachorro = new Cachorro();

        for (Cachorro c : listaCachorros) {
            if (nome.toUpperCase().equals(c.getNome().toUpperCase())) {
                cachorro = c;
            }
        }

        String verificaLatido = "";
        String nomeCachorro = cachorro.getNome();

        if (cachorro.isLatindo()) {
            verificaLatido = nomeCachorro + " está latindo.";
        } else {
            verificaLatido = nomeCachorro + " não está latindo.";
        }

        return verificaLatido;
    }

    public String VerificarDados(String nome, ArrayList<Cachorro> listaCachorros) {

        String dadosCachorro = "";

        for (Cachorro cachorro : listaCachorros) {
            if (nome.toUpperCase().equals(cachorro.getNome().toUpperCase())) {
                String latindo = cachorro.isLatindo() ? "Sim" : "Não";
                String brincando = cachorro.isBrincando() ? "Sim" : "Não";

                dadosCachorro = ("Dados do Cachorro: "
                        + "<br>Nome: " + cachorro.getNome()
                        + "<br>Idade: " + cachorro.getIdade()
                        + "<br>Sexo: " + cachorro.getSexo()
                        + "<br>Raça: " + cachorro.getRaca()
                        + "<br>Porte: " + cachorro.getPorte()
                        + "<br>Peso: " + cachorro.getPeso()
                        + "<br>Tutor: " + cachorro.getTutor()
                        + "<br>Latindo: " + latindo
                        + "<br>Brincando: " + brincando);
            }
        }

        return dadosCachorro;
    }

    public String VerificaCachorroMaisVelho(ArrayList<Cachorro> listaCachorros) {
        String getMaisVelho = "";
        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;

        for (Cachorro cachorro : listaCachorros) {
            if (idadeMaisVelho < cachorro.getIdade()) {
                idadeMaisVelho = cachorro.getIdade();
                nomeMaisVelho = cachorro.getNome();
            }
        }

        getMaisVelho = "O cachorro mais velho é " + nomeMaisVelho + ", com " + idadeMaisVelho + " anos.";
        
        return getMaisVelho;
    }

    public String Brincar(String nome, ArrayList<Cachorro> listaCachorros) {
        String brincarCachorro = "";
        for (Cachorro cachorro : listaCachorros) {
            if (nome.toUpperCase().equals(cachorro.getNome().toUpperCase())) {
                cachorro.setBrincando(true);
                String brincando = cachorro.isBrincando() ? " está brincando" : " não está brincando";
                brincarCachorro =  cachorro.getNome() + brincando;
            }
        }
        return brincarCachorro;
    }

}
