/*
Collection Api (Concept)
Collection (Interface)
Collections (Class)

List queue set interface implements collection and these also have their own class implementation.
for eg for List we have array list for set we have hashset and dequeue for queue.

we don't have indexing of collection interface.

List supports index values

Set stores unique values. it will not give you sorted values.
TreeSet gives sorted as treeSet extends abstract set and implement navigableSet which implements sortedSet.

On top of the collections we have iterable

Map does not implements collection interface but it is part of collection API map is collection of key and value.
*/

import java.util.*;

public class CollectionApi {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        //Add values
        students.put("abc", 89);
        students.put("xyz", 98);

        System.out.println(students);
    }
}
