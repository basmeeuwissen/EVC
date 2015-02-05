package nl.uitdehoogte.evc.representation;

import java.util.List;
import java.util.Random;

public abstract class Representation<T> 
{
	protected double fitness;
	protected int generation;
	protected List<T> data;
	protected Random random;
	
	public Representation()
	{
		this.generation = 0;
		this.fitness = 0.0;
		this.random = new Random();
	}
	
	public void setData(List<T> data)
	{
		this.data = data;
	}
	
	public void setFitness(double fitness)
	{
		this.fitness = fitness;
	}
	
	public void addGeneration()
	{
		generation++;
	}
	
	public List<T> getData()
	{
		return data;
	}
	
	public double getFitness()
	{
		return fitness;
	}
	
	public int getGeneration()
	{
		return generation;
	}
	
	//Mutation methods
	public void bitwiseMutation(double probability) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void randomResetting(double probability) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void creepMutation(double probability) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void uniformMutation(double probability, double lowerBound, double upperBound) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void nonuniformMutation(double stdDev, double probability, double lowerBound, double upperBound) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void swapMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void insertMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void scrambleMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void inversionMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
}
