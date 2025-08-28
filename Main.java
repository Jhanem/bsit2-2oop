import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager post_Mngr = new PostManager();

        String title = "Java Programming Tips";
        int engagement = post_Mngr.calculateEngagement(150, 75, 25);
        String category = post_Mngr.getCategoryRating(engagement);

        String[] hashtags = { "#java", "#coding", "#programming", "#java", "#tips" };
        ArrayList<String> uniqueHashtags = post_Mngr.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
            "Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"
        ));
        HashMap<String, Integer> engagementMap = new HashMap<>();
        engagementMap.put("Java Programming Tips", engagement);
        engagementMap.put("Advanced Java Tutorial", 800);
        engagementMap.put("Spring Boot Guide", 1200);

        LinkedList<String> trending = post_Mngr.findTrendingPosts(posts, engagementMap);

  
        HashSet<String> authors = post_Mngr.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        // formatted output
        System.out.println();
        System.out.println("=== Social Media Post Manager ===");
        post_Mngr.displayPostStats(title, engagement, category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + authors);
    }
}
