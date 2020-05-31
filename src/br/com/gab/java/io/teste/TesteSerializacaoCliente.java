package br.com.gab.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Gabriel");
		cliente.setProfissao("Dev");
		cliente.setCpf("54545454");
			
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
//		
//		// transformou em um objeto desserialização
//		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ios.readObject();
//		ios.close();
//		System.out.println(cliente.getCpf());
	}

}
