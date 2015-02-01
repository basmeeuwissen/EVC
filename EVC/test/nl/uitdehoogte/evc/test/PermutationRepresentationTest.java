package nl.uitdehoogte.evc.test;

import java.util.ArrayList;
import java.util.List;

import nl.uitdehoogte.evc.representation.PermutationRepresentation;
import nl.uitdehoogte.evc.representation.Representation;
import junit.framework.TestCase;

public class PermutationRepresentationTest extends TestCase 
{	
	private Representation representation;
	
	@Override
	public void setUp()
	{
		representation = new PermutationRepresentation();
		
		List<Character> data = new ArrayList<Character>();
		
		data.add('0');
		data.add('1');
		data.add('2');
		data.add('3');
		data.add('4');
		data.add('5');
		data.add('6');
		data.add('7');
		data.add('8');
		data.add('9');
		data.add('A');
		data.add('B');
		data.add('C');
		data.add('D');
		data.add('E');
		
		representation.setData(data);
	}
	
	@Override
	public void tearDown()
	{
		
	}
	
	public void testSwapMutation()
	{
		representation.swapMutation();
		
		List<Character> list = representation.getData();
		
		printList(list);
	}
	
	public void testInsertMutation()
	{
		representation.insertMutation();
		
		List<Character> list = representation.getData();
		
		printList(list);		
	}
	
	public void testScrambleMutation()
	{
		representation.scrambleMutation();
		
		List<Character> list = representation.getData();
		
		printList(list);		
	}
	
	public void testInversionMutation()
	{
		representation.inversionMutation();
		
		List<Character> list = representation.getData();
		
		printList(list);		
	}
	
	private void printList(List<Character> list)
	{
		for(Character c : list)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}
