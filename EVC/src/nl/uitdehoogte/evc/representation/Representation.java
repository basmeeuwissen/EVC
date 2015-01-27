package nl.uitdehoogte.evc.representation;

public abstract class Representation 
{
	private double fitness;
	private int generation;
	private String representation;
	
	public Representation()
	{
		this.generation = 0;
		this.fitness = 0.0;
	}
	
	public double getFitness()
	{
		return fitness;
	}
	
	public int getGeneration()
	{
		return generation;
	}
	
	public void setFitness(double fitness)
	{
		this.fitness = fitness;
	}
	
	public void addGeneration()
	{
		generation++;
	}
}
