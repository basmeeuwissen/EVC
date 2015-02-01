package nl.uitdehoogte.evc.representation;

import java.util.List;

public class PermutationRepresentation extends Representation<Character>
{
	public void swapMutation()
	{
		int firstIndex = nextIndex(data, -1),
				secondIndex = nextIndex(data, firstIndex);
		
		swap(data, firstIndex, secondIndex);
	}
	
	public void insertMutation()
	{
		int firstIndex = nextIndex(data, -1),
		    secondIndex = nextIndex(data, firstIndex);
		
		if(firstIndex > secondIndex)
		{
			int tempIndex = firstIndex;
			firstIndex = secondIndex;
			secondIndex = tempIndex;
		}
		
		data.add(firstIndex + 1, data.get(secondIndex));
		data.remove(secondIndex + 1);
	}
	
	public void scrambleMutation()
	{
		int firstIndex = nextIndex(data, -1),
			secondIndex = nextIndex(data, firstIndex);
		
		if(firstIndex > secondIndex)
		{
			int tempIndex = firstIndex;
			firstIndex = secondIndex;
			secondIndex = tempIndex;
		}
		
		List<Character> tempData = data.subList(firstIndex, secondIndex + 1);
		
		for(int i = 0; i < tempData.size(); i++)
		{
			swap(tempData, i, nextIndex(tempData, i));
		}
	}
	
	public void inversionMutation()
	{
		int firstIndex = nextIndex(data, -1),
				secondIndex = nextIndex(data, firstIndex);
			
		if(firstIndex > secondIndex)
		{
			int tempIndex = firstIndex;
			firstIndex = secondIndex;
			secondIndex = tempIndex;
		}
			
		List<Character> tempData = data.subList(firstIndex, secondIndex + 1);
		
		for(int i = 0; i < tempData.size() / 2; i++)
		{
			swap(tempData, i, tempData.size() - i - 1);
		}
	}
	
	private int nextIndex(List <Character> list, int currentIndex)
	{
		int nextIndex; 
		
		if(list.size() == 1)
		{
			return currentIndex;
		}
		
		do
		{
			nextIndex = random.nextInt(list.size());
		}
		while(nextIndex == currentIndex);
		
		return nextIndex;
	}
	
	private void swap(List<Character> list, int firstIndex, int secondIndex)
	{
		char temp = list.get(firstIndex);
		list.set(firstIndex, list.get(secondIndex));
		list.set(secondIndex, temp);		
	}
}
