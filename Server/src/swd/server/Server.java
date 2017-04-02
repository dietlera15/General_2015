package swd.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	private ServerSocket socketServer = null;
	private Socket socketClient = null;
	
	public Server (int iPort)
	{
		try
		{
			socketServer = new ServerSocket(iPort);
			
			String data = "";

			// Socket für Client wird bei Verbindung befüllt - bei eingehender Verbindung
			socketClient = socketServer.accept();
			
			System.out.println("Verbunden mit " + socketClient.getInetAddress().getHostAddress() );
			System.out.println("Port des Clients ist " + socketClient.getPort() );

			// DO - WHILE Schleife
			do
			{
				// Eingabestrom
				BufferedReader streamIn = new BufferedReader ( new InputStreamReader(this.socketClient.getInputStream()));
				data = streamIn.readLine();
				
				System.out.println("Gelesen: " + data);
				
				// Ausgabestrom
				if(data.startsWith("GET / "))
				{
					data = "<html>"
							+ "<head><title>SERVER!</title></head>"
							+ "<body>"
							+ "<h1>Das wurde vom Server geliefert!</h1>"
							+ "</body>"
							+ "</html>";
				}
			
				PrintStream writer = new PrintStream(socketClient.getOutputStream());
				writer.println(data);

				System.out.println("Gesendet: " + data);
				
			}
			while (!data.equalsIgnoreCase("quit"));
				
			socketClient.close();
			
		}
		catch (IOException e)
		{
			System.out.println("Fehler: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server(22222);
		System.out.println(server.hashCode());
	}

}
