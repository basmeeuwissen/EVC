package nl.uitdehoogte.evc.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import nl.uitdehoogte.evc.representation.BinaryRepresentation;
import nl.uitdehoogte.evc.representation.Representation;

public class BinaryRepresentationTest extends TestCase
{
	private Representation representation;
	
	@Override
	public void setUp()
	{
		representation = new BinaryRepresentation();
		
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(0);
		data.add(0);
		data.add(0);
		data.add(0);
		data.add(0);
		data.add(1);
		data.add(1);
		data.add(1);
		data.add(1);
		data.add(0);
		data.add(1);
		data.add(1);
		data.add(0);
		data.add(0);
		data.add(1);
		
		representation.setData(data);
	}
	
	@Override
	public void tearDown()
	{
		
	}
	
	public void testBitwiseMutation()
	{
		representation.bitwiseMutation(0.4);
		
		List<Integer> list = representation.getData();
		
		printList(list);
	}
	
	private void printList(List<Integer> list)
	{
		for(Integer i : list)
		{
			System.out.print(i);
		}
		System.out.println();
	}
}
