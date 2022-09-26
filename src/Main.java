import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intNewList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {

            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {

                intNewList.add(intList.get(i++));
            }

        }
        Collections.sort(intNewList);
        System.out.println(intNewList);
    }

}

