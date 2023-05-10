import java.rmi.Naming;

public class ClientRequest {
	public static void main(String args[]){
		String answer,value="Reflection in Java";
		try{
		// lookup method to find reference of remote object
			Search access = (Search)Naming.lookup("rmi://localhost:3000"+"/mihir");
			answer = access.query(value);
			System.out.println("Article on " + value + " " + answer);
		}
		catch(Exception ae){
			System.out.println(ae);
		}
	}
}