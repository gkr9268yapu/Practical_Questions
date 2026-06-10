//The 'Duplicate Finder' (ArrayList & Loops).

import java.util.ArrayList;

public class GuestList {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Cyaanzo");
        list.add("Ravi");
        list.add("Govinda");
        list.add("Kumar");
        list.add("Ravi");

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    System.out.println(list.get(i));
                }
            }
        }

    }
}
