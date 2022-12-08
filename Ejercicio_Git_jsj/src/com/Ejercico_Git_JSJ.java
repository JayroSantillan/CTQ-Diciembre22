package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercico_Git_JSJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		File f =  new File("C:\\Users\\santi\\Documents\\JSantillan.txt");
//		
//		String linea;
//		
//		
//		FileReader fr;
//		try {
//			fr = new FileReader(f);
//			BufferedReader br = new BufferedReader (fr);
//			
//			while((linea =br.readLine())!=null) {
//				System.out.println(linea);
//				
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//ruta de archivo
		//File f =  new File("C:\\Users\\santi\\Documents\\Git_JSantillan.txt");
		
		//ingresa temperaturas a un archivo txt 
		
		
		File f =  new File("C:\\Users\\santi\\Documents\\Git_JSantillan.txt");
		
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
