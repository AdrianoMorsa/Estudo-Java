package Fundamentos;

public class OperadoresLogicos {
	
public static void main(String[] args) {
	boolean executouTrabalho1 = false;
	boolean executouTrabalho2 = true;
	
	boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
	boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
	boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
	
	System.out.println("Soverte = " + comprouSorvete);
	System.out.println("Tv 50 = " + comprouTv50);
	System.out.println("Tv 50 = " + comprouTv32);	
	
	//Operado unário intruso
	System.out.println("Fome = " + !comprouSorvete);
	
 }
}
