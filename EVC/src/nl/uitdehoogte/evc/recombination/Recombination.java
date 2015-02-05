package nl.uitdehoogte.evc.recombination;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Recombination<T>
{
	protected Random random;
	
	public Recombination()
	{
		random = new Random();
	}
	
	protected List<T>[] cut(List<T> data, int[] crossOverPoints)
	{
		List<T>[] list = new ArrayList[crossOverPoints.length];
		int crossOverIndex = 0;
		
		list[crossOverIndex] = new ArrayList();
		
		for(int i = 0; i < list.length; i++)
		{
			list[crossOverIndex].add(data.get(i));
			
			if(crossOverPoints[crossOverIndex] == i && crossOverPoints[crossOverIndex] < list.length - 1)
			{
				crossOverIndex++;
				list[crossOverIndex] = new ArrayList();
			}
		}
		
		return list;
	}
}
