/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package src.main.java.src;

import java.io.FileNotFoundException;
import src.main.java.src.Compiler.CompilerBinary;

public class App {

	public static void main(String[] args) {
			
		CompilerBinary  compiler = new CompilerBinary();
	//	System.out.println("Argumento 1: " + args[0]);
 	//	System.out.println("Argumento 2: " + args[1]);
		
		if(args.length != 2 &&  args.length != 1){
			System.out.println("Usage: JSembler [input-file] [output-file]");
			return;
		}

		try {
			if(args.length == 2){
				compiler.TransformBinary(args[0], args[1]);
			} else {
				compiler.TransformBinary(args[0], "instructions.out");
			}
		} catch (FileNotFoundException error) {
			System.out.println(error.toString());
			error.printStackTrace();
		}
	
	}

}
