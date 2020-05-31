package br.com.gab.java.io.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.security.Principal;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); 
//     
		// Saida 
//      BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//      PrintStream ps = new PrintStream(new File("lorem2.rxt"));  

		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
        
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.print("cdaiamco fjjfffw ifáofj fokfoeffjfmc fpdk");
        
		ps.close();
	

	}

}
