package br.com.gab.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = "Gabriel Mendonça";
//		  gravou o objeto em binario serialização
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		// transformou em um objeto desserialização
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ios.readObject();
		ios.close();
		System.out.println(nome);
	}

}
