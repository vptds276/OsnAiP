/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.compactcode.sidorovdy.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dim
 */
public class PrintTask {

   

    public PrintTask(String pathToFile) {

        print(pathToFile);
    }
   
    private void print(String pathToFile) {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line + "\n");
			}
		}
                catch (IOException e) {
                    System.out.println("файл не найден");
		    System.exit(0);
		}
        
        
    }

}
