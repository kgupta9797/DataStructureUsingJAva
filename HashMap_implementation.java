import java.util.HashMap;

public class HashMap_implementation {
public static void main(String args[])
{
	HashMap<Integer, String>map = new HashMap<>();
	System.out.print(map);
	
	map.clear();
	System.out.print(map);
	map.put(1, "Kishan");
	map.put(2,"Suraj");
	map.put(3, "ABC");
	map.put(4, "bcd");
	map.put(5, "ram");
	System.out.print(map);
	map.clone();
	System.out.print(map.containsKey(1)); //return true if keycontains mapping
	System.out.println(map.containsValue("Kishan"));
	map.

	
	}
}
