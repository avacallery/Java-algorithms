// How tall will tree be after n growth cycles?
// 2 growth cycles a year
// // spring - doubles in height
// // summer - increases by 1 meter

// Return integer height of tree after the input # of growth cycles (n)

// if divisible by 2, it is even
// if not, it is odd

//                cycle 0;
//        height = 1
//                cycle 1: (height * 2)
//        height = 2
//                cycle 2: (height + 1)
//        height = 3
//                cycle 3: (height * 2)
//        height = 6
//                cycle 4: (height + 1)
//        height = 7

public class UtopianTree {

    static int utopianTree(int cycles) {
        int height = 1;

        for (int i = 1; i <= cycles; i++) {

            height = i % 2 == 0 ? height + 1 : height * 2;

        }
        return height;
    }
}
