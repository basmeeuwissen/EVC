package nl.uitdehoogte.evc.representation;

public class DoubleRepresentation extends Representation<Double>
{
	public void uniformMutation(double probability, double lowerBound, double upperBound)
	{
		
	}
	
	public void nonuniformMutation(double stdDev)
	{
		nonuniformMutation(stdDev, "Gaussian");
	}
	
	public void nonuniformMutation(double stdDev, String distribution)
	{

	}
}
