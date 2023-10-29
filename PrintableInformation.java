package com.java8.practicejava.implementation.threads;

import com.java8.practicejava.interfaces.PrintableInterface;

public class PrintableInformation {
  public static void main(String args[]) {
	    PrintableInterface printableInterface = (msg)->System.out.println(msg);
	    printableInterface.printMessage("Message From PrintableInformation");
  }
}
