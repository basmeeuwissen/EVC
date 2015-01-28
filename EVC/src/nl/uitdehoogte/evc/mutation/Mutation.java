package nl.uitdehoogte.evc.mutation;

import nl.uitdehoogte.evc.representation.Representation;

public interface Mutation 
{
	public <T> void mutate(Representation<T> representation);
	
	
}
