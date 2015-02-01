package nl.uitdehoogte.evc.test;

import nl.uitdehoogte.evc.representation.IntegerRepresentation;

import org.junit.Test;

import junit.framework.TestCase;

public class IntegerRepresentationTest extends TestCase
{
	private IntegerRepresentation representation;
	private int integer;
	
	public void setUp()
	{
		representation = new IntegerRepresentation();
		integer = 1234567887;
	}
	
	@Test
	public void testIntegerToBinary()
	{
		byte[] binary = representation.intToBinary(integer);
		
		System.out.print("Int to bin : ");
		printBinary(binary);
	}
	
	@Test
	public void testBinaryToInteger()
	{
		byte[] binary = representation.intToBinary(this.integer);
		int integer = representation.binaryToInt(binary);
		
		System.out.print("Bin to int : ");
		System.out.println(integer);
	}
	
	@Test
	public void testBinaryToGray()
	{
		byte[] binary = representation.intToBinary(integer);
		byte[] gray = representation.binaryToGray(binary);
		
		System.out.print("Bin to gray: ");
		printBinary(gray);
	}
	
	@Test
	public void testGrayToBinary()
	{
		byte[] binary = representation.intToBinary(integer);
		byte[] gray = representation.binaryToGray(binary);
		
		binary = representation.grayToBinary(gray);
		
		System.out.print("Gray to bin: ");
		printBinary(binary);
	}
	
	private void printBinary(byte[] binary)
	{
		for(int i = binary.length - 1; i >= 0; i--)
		{
			System.out.print(binary[i]);
		}
		
		System.out.println();
	}
}
