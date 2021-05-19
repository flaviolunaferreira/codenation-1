package br.com.codenation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		DesafioMeuTimeApplication desafio = new DesafioMeuTimeApplication();
	
		desafio.incluirTime(1L, "Santos", formataData("18/05/2021"), "Branco", "azul");
		desafio.incluirTime(2L, "Palmeiras", formataData("18/05/2021"), "Preto", "azul");
		
		System.out.println(desafio.buscarTimes());
		
	}

	static LocalDate formataData(String data) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate resultado = LocalDate.parse(data, formato);		
		return resultado;
	}
	
}
