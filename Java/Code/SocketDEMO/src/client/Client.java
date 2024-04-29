package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static final int PORT = 29424;
	private static final String HOST = "localhost";

	public static void main(String[] args) {

		try (Socket socket = new Socket(HOST, PORT);
				DataInputStream iStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				DataOutputStream oStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
				Scanner scanner = new Scanner(System.in)) {
			String message = null;
			do {
				message = iStream.readUTF();
				System.out.println("C: Server: " + message);

				System.out.print("C: Client: ");
				message = scanner.nextLine();
				oStream.writeUTF(message);
				oStream.flush();
			} while (!message.equalsIgnoreCase("end"));
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
