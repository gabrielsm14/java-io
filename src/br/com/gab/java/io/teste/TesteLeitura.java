package br.com.gab.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo  // Padrão Decorator -  um object embrulha o outro
		InputStream fis = new FileInputStream("lorem.txt"); // binario
		Reader isr = new InputStreamReader(fis, "UTF-8"); // transforma o bytes caractere
		BufferedReader br = new BufferedReader(isr); // guardar os caractere em uma linha
        
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();
	}

}
