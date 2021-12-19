package string_code;

import org.junit.Assert;
import org.junit.Test;

//reverse a string without using a string builder or string buffer
//as string buffer is having reverse method
//in place

public class ReverseAString {

	

	private  String reverse(String st) {
		
		//StringBuilder sb=new StringBuilder(st);
		//sb.reverse();
		//or
      //		for(int i=st.length()-1;i>=0;i--)
      //		{
        //			sb.append(st.charAt(i));
       //		}
       //		System.out.println(st+".."+sb.toString());
		if(st==null || st.isEmpty())
			   return st;
		
		char[] chars=st.toCharArray();// or use a for loop to copy it to char array
		int i=0, j=st.length()-1;
		
		while(i<=j)
		{
			swap(chars,i,j);
			i++;
			j--;
			
		}
		
		System.out.println(new String(chars));
		
		return new String(chars);
	}

	private  void swap(char[] chars, int i, int j)
	{

		char temp=chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
	}
	
	 @Test
	    public void reverseString(){
	        Assert.assertEquals("cba", reverse("abc"));
	    }
	 
	 @Test
	 public void reverseNullString(){ Assert.assertEquals(null, reverse(null)); }
	 @Test 
	 public void reversePalindromeString(){ Assert.assertEquals("aba", reverse("aba")); } 
	 @Test 
	 public void reverseSameCharacterString(){ Assert.assertEquals("aaa", reverse("aaa")); } 
	 @Test
	 public void reverseAnagramString(){ Assert.assertEquals("mary", reverse("yram")); }

	
	}
	
	
	

