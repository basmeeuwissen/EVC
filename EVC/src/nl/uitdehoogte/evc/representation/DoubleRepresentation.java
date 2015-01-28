package nl.uitdehoogte.evc.representation;

public class DoubleRepresentation extends Representation<Double>
{
	public void UniformMutation(double probability, double lowerBound, double upperBound)
	{
		
	}
	
	public void NonuniformMutation(double stdDev)
	{
		NonuniformMutation(stdDev, "Gaussian");
	}
	
	public void NonuniformMutation(double stdDev, String distribution)
	{

	}
}
