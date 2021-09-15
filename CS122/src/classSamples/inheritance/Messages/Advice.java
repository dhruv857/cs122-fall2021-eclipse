package classSamples.inheritance.Messages;//********************************************************************
//  Advice.java       Author: Lewis/Loftus
//
//  Represents some thoughtful advice. Used to demonstrate the use
//  of an overridden method.
//********************************************************************

public class Advice extends Thought {
	// -----------------------------------------------------------------
	// Prints a message. This method overrides the parent's version.
	// -----------------------------------------------------------------
	public void message() {
		System.out.println("Warning: Dates in calendar are closer " + "than they appear.");

		System.out.println();

		super.message(); // explicitly invokes the parent's version
	}
}
