package classSamples.exceptions.Propagation;
//********************************************************************
//  Propagation.java       Author: Lewis/Loftus
//
//  Demonstrates exception propagation.
//********************************************************************

public class Propagation {
	// -----------------------------------------------------------------
	// Invokes the level1 method to begin the exception demonstation.
	// -----------------------------------------------------------------
	static public void main(String[] args) {
		ExceptionScope demo = new ExceptionScope();

		System.out.println("Program beginning.");
		demo.level1();
		System.out.println("Program ending.");
	}
}
