import java.util.*;
class HashSetCRUD
{
		public static void main(String args[])
		{
			HashSet<String> hs= new HashSet<>();
			//create
			hs.add("India");
			hs.add("South Africa");
			hs.add("Russia");
			System.out.println("After adding: "+hs);
			//Read
			System.out.println("Read Elements from Hashset: ");
			for(String s: hs)
			{
				System.out.println(s);
			}
			//Update
			hs.remove("Russia");
			hs.add("UK");
			System.out.println("Updated Set: " +hs);
			//Remove
			hs.remove("South Africa");
			System.out.println("After Deletion: "+hs);
		}
}