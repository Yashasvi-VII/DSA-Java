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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionApi {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>(); /* Integer is wrapper class and int is primitive type*/

        //Add values
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);  /* These are objects not values */
        nums.add(6);


        //we can directly print the collection
        System.out.println(nums);

        for (int iter : nums) {
            System.out.println(iter);
        }
    }
}
