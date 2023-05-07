package socketProgramming;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private Socket socket = null;
	private ServerSocket server= null;
	private DataInputStream in = null;
	
	public Server(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("Server Started");
			
			System.out.println("Waiting For Client...");
			socket = server.accept();
			System.out.println("Client Accepted");
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			String line = "";
			while(!line.equals("End")) {
				try {
					line = in.readUTF();
					System.out.println(line);
				}catch (IOException e) {
					// TODO: handle exception
					System.out.println("Read Error");
				}
			}
			
			socket.close();
			in.close();
			System.out.println("Connection CLosed!");

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Socket Error");

		}
	}
	
	
	public static void main(String[] args) {
		Server server = new Server(5000);
	}

}
