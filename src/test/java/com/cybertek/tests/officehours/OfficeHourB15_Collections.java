package com.cybertek.tests.officehours;

import java.util.*;

public class OfficeHourB15_Collections {
    public static void main(String[] args) {
      /*
      Under the List Interface:
      - ArrayList (indexes, faster to read but slower when we do some manipulations (remove, add elements))
      - Vector (same as arraylist but synchronized (thread safe))
           -Stack(Last in, First out( like stack of paper))
      -LinkedList (node (each element has some reference to previous and next element in the list))
      (performance sensitive, memory allocation)
      [2,5,3] -> [2,3]
      [2] [5] [3]
       */

      /*
      Set Interface: (contains only unique value, and wont have any duplicates)

      HashSet: no indexes - using hashcodes to store elements, faster because it is using hashing
      (it does not keep the order), allows one null value
      TreeSet: sorted set - no nulls
      LinkedHashSet: similar to hashset but keeps the order
       */

        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        for (String each : Arrays.asList("Value5", "Value1", "Value3")) {
            hashSet.add(each);
            treeSet.add(each);
            linkedHashSet.add(each);
        }

        System.out.println("hashset: " + hashSet);
        System.out.println("treeset: " + treeSet);
        System.out.println("linkedHashset: " + linkedHashSet);

        Iterator<String> iteratorSet = hashSet.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
        }

        ArrayList<Integer> dropdown = new ArrayList<>();
        dropdown.add(1);
        dropdown.add(2);
        dropdown.add(3);
        dropdown.add(4);
        dropdown.add(5);
        dropdown.add(1);
        //[1,2,3,4,5,1]
        HashSet<Integer> optionsSet = new HashSet<>(dropdown);
        System.out.println("optionSet: " + optionsSet);
        if (optionsSet.size() == dropdown.size()) {
            System.out.println("expected is the same as actual");
        } else {
            System.out.println("our options contain duplicates");
        }

        //============================
        /*
        Queue:
         - PriorityQueue - First In First Out
            it can accept duplicates but it does not have indexes
         - ArrayDequeue - special in adding and removing
         */
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("John");
        priorityQueue.add("Kate");
        priorityQueue.add("Tom");

        System.out.println("Queue: " + priorityQueue);
        System.out.println("peek: " + priorityQueue.peek());
        // peeking (peek()) - it will check and return the first in queue
        System.out.println("pool: " + priorityQueue.poll());
        //polling will return the first value in a queue and remove it
        System.out.println(priorityQueue);
        /*
        dequeue - double sided: we can add and retrieve elements from dequeue from both sides (head, end)
         */
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(20);
        numbers.addFirst(30);
        numbers.addFirst(50);
        System.out.println(numbers);
        numbers.addLast(90);
        System.out.println(numbers);
        numbers.add(33);
        System.out.println(numbers);
        Integer num = numbers.pollFirst(); //return and delete first element
        System.out.println(num);
        System.out.println(numbers);
        System.out.println(numbers.getLast()+" peek: "+numbers.peekLast());

        /*
        IQ: what collections are you using in your project?
        describe all different collections (List, Queue, Set)
        explain the difference between them

        List -> I am using ArrayList most of the time because:
        I would usually need to store some values

        I would use LinkedlIst if I know I will need to manipulate my date (consistently add, remove etc) because its faster

        Set -> HashSet - for unique values
                TreeSet - for unique sorted values

        Queue -> if I need to check first in first out logic in my project.

        When we saying peek() -> returns the value (similar to get());
        poll() -> gives us a value and remove it from the Queue
         */
        System.out.println("deque after peek() "+numbers);

        /*
        Map Interface (does not accept any duplicate keys):
            -HashMap - key/value, can accept null
            -HashTable - synchronized, does not accept any null values
            -LinkedHashMap - extends the HashMap (slower than hashMap);
            - TreeMap - sorted, no null values

         */

        HashMap<String,String> user1 = new HashMap<>();
        user1.put("First Name",null);
        user1.put("Last Name", "Smith");
        user1.put("Account Number", "A1234567890");
        user1.put("DOB", "02.20.1980");

        System.out.println(user1); //does not keep order because using hashing

        LinkedHashMap<String, String> user2 = new LinkedHashMap<>();
        user2.put("First Name", "John");
        user2.put("Last Name", null);
        user2.put("Last Name", "White");
        user2.put("Last Name", "Green");
        user2.put("Account Number", "B1234567890");
        user2.put("DOB", "01.13.1990");

        System.out.println(user2);

        List<HashMap<String,String>> users = new ArrayList<>();
        // LinkedHashMap extends HashMap;
        users.add(user1);
        users.add(user2);

        HashMap<String, String> user3 = new HashMap<>(user1);
        user3.put("Account Number", "C1234567890");
        user3.put("DOB", "02.20.1970");

        users.add(user3);

        //print account number for all users along with last name
        System.out.println(users);
        for(HashMap<String, String> user: users){
            System.out.println(user.get("Last Name")+" user's last name");
            System.out.println(user.get("Account Number")+" user's account number");
        }

        int i =1;
        for (HashMap<String,String> user: users){
            System.out.println("user "+i);
            Iterator<String> keys = user.keySet().iterator();
            while (keys.hasNext()){
                String key = keys.next();
                System.out.println(key+ ":"+ user.get(key));
            }
            i++;
        }

        }
    }