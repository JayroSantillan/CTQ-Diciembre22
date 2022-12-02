package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaGit {

	public static void main (String [] args) {
		
		File f =  new File("C:\\Users\\elohe\\Documents\\Git_Elohe");
		String linea;
		double temperaturas[]= new double[7];
		int c= 0;
		String dias[]= {"Doming","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
		
		
		
		
		try {
		FileWriter fw =  new FileWriter(f);
		fw.write("25"+"\n");
		fw.write("20"+"\n");
		fw.write("17"+"\n");
		fw.write("8"+"\n");
		fw.write("19"+"\n");
		fw.write("22"+"\n");
		fw.write("29"+"\n");
		fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while((linea= br.readLine())!=null) {
				temperaturas[c]= Double.valueOf(linea);
				c++;
			}
			
			}catch(IOException e) {
				e.printStackTrace();
			}
			c=0;
			for(int i=0;i<temperaturas.length;i++) {
				
				if(temperaturas[c]<temperaturas[i]) {
					c=i;
				}
			}
			
			System.out.println("El dia con la temperatura mayor fue el "+dias[c]+" Con una temperatura de "+temperaturas[c]);
		
		
		
		
		
	}
	
	
}
