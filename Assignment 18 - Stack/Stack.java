import java.util.ArrayList;
import java.util.List;

public class Stack implements BasicStack
{
	private List<Object> stack = new ArrayList<Object>();
	private Object lastIn;

	public void push(Object inValue)
	{
		stack.add(0, inValue);
		lastIn = inValue;
	}

	public Object pop()
	{
		if(!isEmpty())
		{
			lastIn = stack.get(0);
			stack.remove(lastIn);
			return lastIn;
		}
		return null;
	}

	public boolean isEmpty() 
	{
		return stack.isEmpty();
	}

	public int getSize() 
	{
		return stack.size();
	}
	
	public String getReverseSentence(String sentence)
	{
		String reversedSentence = "";
		String[] words = sentence.split(" ");
		for(String word : words)
		{
			push(word + " ");
		}
		while(!stack.isEmpty())
		{
			reversedSentence += pop();
		}
		return reversedSentence;
	}
}