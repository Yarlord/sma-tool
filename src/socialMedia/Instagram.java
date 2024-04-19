package socialMedia;

public class Instagram implements SocialMediaPlatform {
    private String apiUrl;

    // Constructor
    public Instagram(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    // Implementing the fetchData method
    @Override
    public String fetchData() {
        // This is just a placeholder, actual implementation will vary
        return "Data fetched from Instagram";
    }

    // Implementing the setApiUrl method
    @Override
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    // Implementing the getApiUrl method
    @Override
    public String getApiUrl() {
        return apiUrl;
    }

    // Nested class InstagramPost
    public class InstagramPost {
        private String image;
        private String caption;
        private int likes;
        private int comments;

        // Constructor
        public InstagramPost(String image, String caption, int likes, int comments) {
            this.image = image;
            this.caption = caption;
            this.likes = likes;
            this.comments = comments;
        }

        // Getters and setters
        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }
    }
}