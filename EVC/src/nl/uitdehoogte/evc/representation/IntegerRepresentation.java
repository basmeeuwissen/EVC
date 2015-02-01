package nl.uitdehoogte.evc.representation;

public class IntegerRepresentation extends Representation<Integer> 
{
	public void randomResetting(double probability)
	{
		
	}
	
	public void creepMutation(double probability)
	{
		
	}
	
	public int binaryToInt(byte[] binary)
	{
		int integer = 0;
		
		for(int i = 0; i < binary.length; i++)
		{
			integer |= (int)binary[i] << i;
		}
		
		return integer;
	}
	
	public byte[] intToBinary(int integer)
	{
		byte[] binary = new byte[31];
		
		for(int i = 0; i < 31; i++)
		{
			binary[i] = (byte)((integer & 1 << i) >> i);
		}
		
		return binary;
	}
	
	public byte[] binaryToGray(byte[] binary)
	{
		byte[] gray = new byte[binary.length];
		
		gray[binary.length - 1] = binary[binary.length - 1];
		
		for(int i = binary.length - 2; i >= 0; i--)
		{
			gray[i] = (byte)(binary[i + 1] ^ binary[i]);
		}
		
		return gray;
	}
	
	public byte[] grayToBinary(byte[] gray)
	{
		byte[] binary = new byte[gray.length];
		
		binary[binary.length - 1] = gray[binary.length - 1];
		byte value = gray[binary.length - 1];
		
		for(int i = binary.length - 2; i >= 0; i--)
		{
			if(gray[i] == 1)
			{
				value = (value == 0) ? (byte)1 : (byte)0;
			}
			
			binary[i] = value;
		}
		
		return binary;
	}
}
