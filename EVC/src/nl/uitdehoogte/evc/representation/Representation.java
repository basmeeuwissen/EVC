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
	public void BitwiseMutation(double probability) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void RandomResetting(double probability) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void CreepMutation(double probability) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void UniformMutation(double probability, double lowerBound, double upperBound) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void NonuniformMutation(double stdDev) throws UnsupportedOperationException
	{
		NonuniformMutation(stdDev, "Gaussian");
	}
	
	public void NonuniformMutation(double stdDev, String distribution) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void SwapMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void InsertMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void ScramblepMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
	
	public void InversionpMutation() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("Operation not supported!");
	}
}
