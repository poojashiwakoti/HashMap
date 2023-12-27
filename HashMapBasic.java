/*
*Fast access time: HashMaps provide constant time access to elements,
* which means that retrieval and insertion of elements are very fast, usually O(1) time complexity.
*
* Uses hashing function: HashMaps uses a hash function to map keys to indices in an array.
* This allows for a quick lookup of values based on keys.
*
* Stores key-value pairs: Each element in a HashMap consists of a key-value pair.
* The key is used to look up the associated value.
*
* Supports null keys and values: HashMaps allow for null values and keys.
*  This means that a null key can be used to store a value, and a null value can be associated with a key.
*
* Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.
* However, LinkedHashMap is a variation of HashMap that preserves the insertion order.

* Allows duplicate: HashMaps allow for duplicate values, but not duplicate keys.
* If a duplicate key is added, the previous value associated with the key is overwritten.
*
* Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously,
*  it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.
*
* Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor,
*  which is the measure of how full the hashmap can be before it is resized.
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {

    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();

        //Adding data to the table using put method
        //Fruits and their weights in lb
        hashMap.put("Oranges", 5);
        hashMap.put("Apples", 2);
        hashMap.put("Watermelon", 10);
        hashMap.put("Grapes",null);
      //null key can be used to store a value and null value can be stored in a key
        hashMap.put("Guava",7 );
        hashMap.put(null,7);

        System.out.println("Size of hashMap : "+ hashMap.size());
        System.out.println(hashMap);

        //remove an element from hashMap
        hashMap.remove("Apples");
        System.out.println(hashMap);

        //changing value in HashMap, if same key name is written multiple times,
        // it overwrites the value to the latest value
        hashMap.put("Watermelon", 9);

        // if we want to look up for a specific value, use  containsKey method
        if(hashMap.containsKey("Watermelon")){
            int weightOfWatermelon = hashMap.get("Watermelon");
            System.out.println(weightOfWatermelon);
            //if value of watermelon is more than 7, remove it
            if(hashMap.get("Watermelon") > 7){
                hashMap.remove("Watermelon");
            }
            System.out.println(hashMap);
        }
        //prints a boolean value
        System.out.println(hashMap.containsKey("Pineapples"));

        //Using for-each loop to iterate through the hashMap
        // compare the value and print only if it is within the range
        // if any value is found to be null, throw an exception
        for(Map.Entry<String, Integer> start : hashMap.entrySet()){
            try {
                if (start.getValue() > 5 && start.getValue() < 10) {
                    System.out.println("Key : " + start.getKey() + ", Value :" + start.getValue());
                }
            }catch(Exception e){
                System.out.println(" exception found, null value cannot be compared with integer value");
            }
        }
    }
}
