import java.rmi.*;
import java.rmi.registry.*;

public class SearchServer {
	public static void main(String args[]) {
		try{
		// Create an object of the interface
		// implementation class
			Search obj = new SearchQuery();
			// rmiregistry within the server JVM with
			// port number 1900
			LocateRegistry.createRegistry(3000);
			// Binds the remote object by the name
			Naming.rebind("rmi://localhost:3000"+"/mihir",obj);
		}
		catch(Exception ae){
			System.out.println(ae);
		}
	}
}