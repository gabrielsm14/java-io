 package br.com.gab.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de saida com arquivo  // Padrão Decorator -  um object embrulha o outro
		OutputStream fos = new FileOutputStream("lorem2.txt"); // binario
		Writer osw = new OutputStreamWriter(fos); // transforma o bytes caractere
		BufferedWriter bw = new BufferedWriter(osw); // guardar os caractere em uma linha
     
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		bw.write("mfdnfkd  dkfnkdf kaldsklaç skadiend skdadÇND KDSKDNS");
		
		bw.close();
	}

}
