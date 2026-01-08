package Controller;

public class Controlador {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.print(".");
				Thread.sleep(100);
			}
			System.out.print( " ");
		}
	} 
}
