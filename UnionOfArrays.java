import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String args[])
    {
        int arr[]={1,3,5};
        int arr2[]={2,4,6};
        //op->union->1,2,3,4,5,6
        HashSet<Integer>hashSet = new HashSet<>();
        for(int element:arr)
            hashSet.add(element);

        for(int element:arr2)
            hashSet.add(element);

        System.out.println("Union of two arrays"+hashSet);
    }

}
