package nl.uitdehoogte.evc.representation;

public class BinaryRepresentation extends Representation<Integer>
{
	public void bitwiseMutation(double probability)
	{		
		for(int i = 0; i < data.size(); i++)
		{
			if(random.nextDouble() < probability)
			{
				int newValue = (data.get(i) == 0) ? 1 : 0;
				
				data.set(i, newValue);
			}
			
		}
	}
}
