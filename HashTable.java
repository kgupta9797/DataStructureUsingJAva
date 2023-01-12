import java.util.HashSet;

public class HashTable {
    private HashNode[] buckets;
    int numofBucket; //no of bucket in haashtable
    int size;//no of hashnodes

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numofBucket = capacity;
        this.buckets=new HashNode[numofBucket];
        this.size=0;
    }

 class HashNode { //for chaining we use hashNode to store eleemnt
    Integer key;
    String value;
    private HashNode next;
        public HashNode(Integer key, String value) {
         this.key = key;
         this.value = value;
     }

 }
 //operations all operation of time complexity -->O(1)
     public int size()
     {
     return size;
     }
     public boolean isEmpty()
     {
         return size==0;
     }
     public void put(Integer key,String value)
     {
        if(key==null||value==null)
        {
            throw new IllegalArgumentException("Key or value is null");
        }
        int bucketIndex=getBucketIndex(key);
         HashNode head=buckets[bucketIndex];
         while(head!=null)
         {
            if(head.key.equals(key))
            {
                head.value=value;
                return;
            }
            head=head.next;
         }
         size++;
         head=buckets[bucketIndex];
        HashNode node = new HashNode(key,value);
        node.next=head;
        buckets[bucketIndex]=node;
     }
                                                                                 public String get(int key)
                                                                                 {
                                                                                     return null;
                                                                                 }
    public String remove(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null !!!");
        }

        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex]; // (21, "Tom") -> (31, "Harry") -> (41, "Sana") -> null
        HashNode previous = null;

        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return head.value;
    }


     public int getBucketIndex(Integer key)
     {
         //h(key)->key%10;
         return key%10;
     }

    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(105,"Kishan");
        table.put(125,"suraj");
        table.put(103,"xyz");        table.put(103,"1111111");

        System.out.println(table.size());
        //System.out.println(table.to);
        System.out.println(table.remove(21));
        System.out.println(table.remove(31));
        System.out.println(table.size());
    }
 }