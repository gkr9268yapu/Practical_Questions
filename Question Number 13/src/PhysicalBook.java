// PhysicalBook implements the search differently, which checks a catalog location instead
public class PhysicalBook implements Searchable {
    String title;
    String shelfLocation;

    public PhysicalBook(String title, String shelfLocation) {
        this.title = title;
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void search(String keyword) {
        if (title.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("PhysicalBook \"" + title + "\": Match found! Located at shelf " + shelfLocation + ".");
        } else {
            System.out.println("PhysicalBook \"" + title + "\": No title match for \"" + keyword + "\".");
        }
    }
}