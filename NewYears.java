// minimumBribes must print the minimum number of bribes needed to get the queue to final state.

// Initial positions increment by 1 from 1 at the front of the line to n at the back

import java.util.*;

public class NewYears {

    static void minimumBribes(int[] q) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int bribeCounter = 0;
        int[] arr = q;
        int n = arr.length;
        int temp = 0;
        List<Integer> changes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    bribeCounter++;
                    temp = arr[j - 1];
                    // System.out.println(temp);
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    changes.add(temp);
                }
            }
        }
        for (int num : changes) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        int max = Collections.max(hm.values());
        if (max > 2) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribeCounter);
        }
    }
}