package socketProgramming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	
	private Socket socket = null;
//	private DataInputStream in = null;
	private DataOutputStream out = null;
	private BufferedReader input = null;
	
	
	public Client(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			System.out.println("Server Connected!");
			
//			in = new DataInputStream(System.in);
			out = new DataOutputStream(socket.getOutputStream());
			input = new BufferedReader(new InputStreamReader(System.in));
			
		}catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);

		}
		
		String line = "";
		
		while(!line.equals("End")) {
			
			try {
				line = input.readLine();
				out.writeUTF(line);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
		try {
			input.close();
			out.close();
			socket.close();
			System.out.println("Connection CLosed!");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client("127.0.0.1", 5000);
	}

}
