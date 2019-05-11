package com.class33;
//Java program illustrating usage of HashMap class methods 
//keySet(), values(), containsKey() 
import java.util.*; 

public class HashMapExample 
{ 
 public static void main(String args[]) 
 { 
     // 1   Creation of HashMap 
     HashMap<String, String> hm = new HashMap<>(); 

     // 2   Adding values to HashMap as ("keys", "values") 
     hm.put("Language", "Java"); 
     hm.put("Platform", "Open Source"); 
     hm.put("Code", "HashMap"); 
     hm.put("Learn", "More"); 

     // 3  containsKey() method is to check the presence 
     //    of a particular key 
     // Since 'Code' key present here, the condition is true 
     if (hm.containsKey("Code")) 
         System.out.println("Testing .containsKey : " +hm.get("Code")); 

     // 4. keySet() method returns all the keys in HashMap 
     
     Set<String> hmkeys = hm.keySet(); 
     System.out.println("keys  : " + hmkeys); 


     // 5.  values() method return all the values in HashMap 
     Collection<String> hmvalues = hm.values(); 
     System.out.println("values : " + hmvalues); 

     // Adding new set of key-value 
     hm.put("Search", "JavaArticle"); 

     // Again using .keySet() and .values() methods 
     System.out.println("New Keys : " + hmkeys); 
     System.out.println("New Values: " + hmvalues); 
 } 
} 