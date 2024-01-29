/*
Collection Api (Concept)
Collection (Interface)
Collections (Class)

List queue set interface implements collection and these also have their own class implementation.
for eg for List we have array list for set we have hashset and dequeue for queue.

we don't have indexing of collection interface.

List supports index values
*/

import java.util.ArrayList;
import java.util.Collection;

public class CollectionApi {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<Integer>(); /* Integer is wrapper class and int is primitive type*/

        //Add values
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);  /* These are objects not values */

        //we can directly print the collection
        System.out.println(nums);

        for (int iter : nums) {
            System.out.println(iter);
        }
    }
}
