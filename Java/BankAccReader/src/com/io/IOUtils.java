package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.app.BankStatement;

public class IOUtils {

	public static List<BankStatement> readStatements() throws FileNotFoundException, IOException {
		String line;
		List<BankStatement> statements = new ArrayList<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try (BufferedReader bReader = new BufferedReader(new FileReader("statements.txt"))) {
			bReader.readLine();
			while ((line = bReader.readLine()) != null) {
				String[] fields = line.split(",");
				statements.add(new BankStatement(LocalDate.parse(fields[0], formatter), fields[1],
						Double.parseDouble(fields[2]), Double.parseDouble(fields[3])));
			}
		}
		return statements;

	}
}
