import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String args[])
    {
        int arr[]={3,4,5,2,2,2,2};
        HashSet<Integer>hashSet=new HashSet<>();//(new ArrayList<>(Arrays.asList(arr)));
        for(int element:arr)
        {
            hashSet.add(element);

        }
        System.out.println(hashSet.size());
    }
}
