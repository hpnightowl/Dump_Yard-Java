import java.util.*;

class PanlindromeWChar
{

	static boolean isPalindrome(String str,
					int low, int high)
	{
		while (low < high)
		{
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
	static int isPalindromeRemoveOneChar(String str)
	{
		int low = 0, high = str.length() - 1;
		while (low < high)
		{
			if (str.charAt(low) == str.charAt(high))
			{
				low++;
				high--;
			}
			else
			{
				if (isPalindrome(str, low + 1, high))
					return low;

				if (isPalindrome(str, low, high - 1))
					return high;
				return -1;
			}
		}
		return -2;
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = isPalindromeRemoveOneChar(str); 

		if (result == -1)
			System.out.println("Not Possible");
		else if (result == -2)
			System.out.println("Possible without " +
						"removing any character");
		else
			System.out.println("Possible by removing" +
							" character: " + str.charAt(result));
	}
}