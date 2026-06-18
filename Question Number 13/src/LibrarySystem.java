import java.util.ArrayList;

public class LibrarySystem {

    public static void main(String[] args) {

        ArrayList<Searchable> catalog = new ArrayList<>();
        catalog.add(new EBook("Java Basics", "This book covers loops, arrays, and object oriented programming."));
        catalog.add(new PhysicalBook("Java Basics", "A12"));
        catalog.add(new EBook("History of Rome", "Rome was founded according to legend in 753 BC."));

        String keyword = "java";

        // Each item searches in its OWN way, even though we call the same method
        for (Searchable item : catalog) {
            item.search(keyword);
        }
    }
}