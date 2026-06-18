// EBook implements the search differently, which checks digital content/text
public class EBook implements Searchable {
    String title;
    String content; // simulates the full text of the ebook

    public EBook(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("EBook \"" + title + "\": Found \"" + keyword + "\" in digital content.");
        } else {
            System.out.println("EBook \"" + title + "\": \"" + keyword + "\" not found in content.");
        }
    }
}