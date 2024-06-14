package Recursion;

public class RMain {
    public static void main(String[] args) {
        HanoiTower hanoiTower = new HanoiTower();
        int n = 3;
        // hanoiTower.towerOfHanoi(n, 'A', 'C', 'B');

        AdjacentDuplicate adjacentDuplicate = new AdjacentDuplicate();
        String str = "ejeerkokfdker";
        String result = adjacentDuplicate.rremove(str);
        System.out.println(result);
    }
}
