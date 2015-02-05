package nl.uitdehoogte.evc.test;

import java.util.List;
import java.util.ArrayList;

import nl.uitdehoogte.evc.representation.DoubleRepresentation;
import junit.framework.TestCase;

public class DoubleRepresentationTest extends TestCase
{
	private DoubleRepresentation representation;
	
	@Override
	public void setUp()
	{
		representation = new DoubleRepresentation();
		
		List<Double> data = new ArrayList<Double>();
		
		data.add(0.0);
		data.add(1.1);
		data.add(2.2);
		data.add(3.3);
		data.add(4.4);
		data.add(5.5);
		data.add(6.6);
		data.add(7.7);
		data.add(8.8);
		data.add(9.9);
		
		representation.setData(data);
	}
	
	@Override
	public void tearDown()
	{
		
	}
	
	public void testUniformMutation()
	{
		representation.uniformMutation(0.25, 0, 10);
		
		List<Double> list = representation.getData();
		
		printDouble(list);
	}
	
	public void testNonuniformMutation()
	{
		representation.nonuniformMutation(0.25, 0.25, 0, 10);
		
		List<Double> list = representation.getData();
		
		printDouble(list);
	}
	
	private void printDouble(List<Double> list)
	{
		for(double d : list)
		{
			System.out.println(d);
		}
		
		System.out.println();		
	}
}
