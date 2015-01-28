package nl.uitdehoogte.evc.representation;

public class PermutationRepresentation extends Representation<Character>
{
	private int nextIndex(int currentIndex)
	{
		int nextIndex; 
		
		do
		{
			nextIndex = random.nextInt(data.size());
		}
		while(nextIndex == currentIndex);
		
		return nextIndex;
	}
	
	public void SwapMutation()
	{
		int firstIndex = nextIndex(-1),
				secondIndex = nextIndex(firstIndex);
		
		char temp = data.get(firstIndex);
		data.set(firstIndex, data.get(secondIndex));
		data.set(secondIndex, temp);
	}
	
	public void InsertMutation()
	{
		
	}
	
	public void ScramblepMutation()
	{
		
	}
	
	public void InversionpMutation()
	{
		
	}
}
