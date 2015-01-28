package nl.uitdehoogte.evc.representation;

import java.util.Random;

public class BinaryRepresentation extends Representation<Integer>
{
	public void BitwiseMutation(double probability)
	{		
		for(int i = 0; i < data.size(); i++)
		{
			
			if(random.nextDouble() < probability)
			{
				int newValue = data.get(i) == 0 ? 1 : 0;
				
				data.set(i, newValue);
			}
			
		}
	}
}
