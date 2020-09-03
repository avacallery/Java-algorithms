public class UtopianTree {

    static int utopianTree(int cycles) {
        int height = 1;

        for (int i = 1; i <= cycles; i++) {

            height = i % 2 == 0 ? height + 1 : height * 2;

        }
        return height;
    }
}
