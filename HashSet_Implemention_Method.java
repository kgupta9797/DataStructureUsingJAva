import java.util.*;

public class HashSet_Implemention_Method {
    public static void main(String arg[]){
        HashSet<Integer>hashSet = new HashSet<Integer>();
        for(int i=0;i<5;i++)
        {
            hashSet.add(i*i);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(16));
        //System.out.println(hashSet.iterator());
        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext())
        {System.out.println(iterator.next());}
        System.out.println(hashSet.remove(16));
        System.out.println(hashSet);
        ArrayList<Integer> gfg = new ArrayList<Integer>(
                Arrays.asList(1,3,5,6,7,8,7,6,5,5,33,4,45,6,676,7,7,77));
        System.out.println(hashSet.addAll(gfg));
        System.out.println(hashSet);
        System.out.println(hashSet.hashCode());



    }
}
