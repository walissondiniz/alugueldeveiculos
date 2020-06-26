package locadora;

import java.io.IOException;
public class Tela{
	
	public static void limpar(){
		try{
			ProcessBuilder pb =
				new ProcessBuilder("cmd", "/c", "cls");
				
			pb.inheritIO();
			pb.start();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}
