package nl.uitdehoogte.evc.representation;

public class DoubleRepresentation extends Representation<Double>
{
	public void uniformMutation(double probability, double lowerBound, double upperBound)
	{
		for(int i = 0; i < data.size(); i++)
		{
			if(random.nextDouble() < probability)
			{	
				double newValue = random.nextDouble() * (upperBound - lowerBound) + lowerBound;
				
				data.set(i, newValue);
			}
		}
	}
	
	public void nonuniformMutation(double stdDev, double probability, double lowerBound, double upperBound)
	{
		for(int i = 0; i < data.size(); i++)
		{
			if(random.nextDouble() < probability)
			{	
				double newValue = data.get(i) + random.nextGaussian();
				
				newValue = Math.max(lowerBound, Math.min(upperBound, newValue));
				
				data.set(i, newValue);
			}
		}		
	}
}
