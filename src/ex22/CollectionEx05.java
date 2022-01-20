package ex22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class Dataes {
    private Set<Integer> dataes;

    Dataes(Set<Integer> dataes) {
        this.dataes = dataes;
    }

    public Set<Integer> getDataes() {
        return dataes;
    }

}

public class CollectionEx05 {
    public static void main(String[] args) {
        Set<Integer> dataes = new HashSet<>();
        Set<Integer> dataes2 = new HashSet<>();
        Random num = new Random();
        List<Set<Integer>> dataesArray = new ArrayList<>();

        while (true) {
            int n = num.nextInt(45) + 1;
            dataes.add(n);
            if (dataes.size() == 6) {
                break;
            }
        }
        while (true) {
            int n = num.nextInt(45) + 1;
            dataes2.add(n);
            if (dataes2.size() == 6) {
                break;
            }
        }
        dataesArray.add(dataes);
        dataesArray.add(dataes2);

        System.out.println(dataesArray);
    }
}
