package nl.uitdehoogte.evc.recombination;

import nl.uitdehoogte.evc.representation.BinaryRepresentation;

public class BinaryRecombination extends Recombination<Integer>
{
	public BinaryRecombination()
	{
		super();
	}
	
	public BinaryRepresentation[] onePointCrossOver(BinaryRepresentation[] representations)
	{
		BinaryRepresentation[] offspring = new BinaryRepresentation[representations.length];
		
		int[] crossOverPoints = { random.nextInt(representations[0].getData().size()) };
		
		for(int i = 0; i < representations.length; i++)
		{
			
		}
		
		return offspring;
	}
}
