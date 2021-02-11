package IODatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Ejercicio.Mensaje;

public class IODatos {
	
	private File f;
	private FileReader fr;
	private Scanner leer;
	private FileWriter fw;
	private PrintWriter pw;
	
	public IODatos() {
		this.f = null;
		this.fr = null;
		this.leer = null;
		this.fw = null;
		this.pw = null;
	}
	
	//Devolver Mensaje en vector
	public Mensaje[] cargarDatos() {
		//Inicializar vector
		Mensaje vMensaje[]=new Mensaje[10];
		File f = new File("Wasap.txt");
		
		if (!f.exists()) {
			
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				
				fr = new FileReader(f);
				leer = new Scanner(f);
				
				//while (condition) {
					
				//}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}finally {
				try {
					leer.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		//Devolver vector
		return vMensaje;
		
	}
	
	
}
