package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private static final int PORT = 29424;

	public static void main(String[] args) {

		try (ServerSocket serverSocket = new ServerSocket(PORT)) {
			System.out.println("Listining...");
			Socket socket = serverSocket.accept();
			System.out.println("Connected...");
			try (DataInputStream iStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
					DataOutputStream oStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
					Scanner scanner = new Scanner(System.in)) {
				String message = null;
				do {
					System.out.print("S: Server: ");
					message = scanner.nextLine();
					oStream.writeUTF(message);
					oStream.flush();

					message = iStream.readUTF();
					System.out.println("S: CLient: " + message);
				} while (!message.equalsIgnoreCase("end"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
