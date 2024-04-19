package socialMedia;

import user.User;

public class Facebook implements SocialMediaPlatform {
    private String apiUrl;

    // Constructor
    public Facebook(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    // Implementing the fetchData method
    @Override
    public String fetchData() {
        // This is just a placeholder, actual implementation will vary
        return "Data fetched from Facebook";
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

    // Nested class FacebookPost
    public class FacebookPost {
        private String postTitle;
        private int likes;
        private int shares;
        private int numberOfComments;

        // Constructor
        public FacebookPost(String postTitle, int likes, int shares, int numberOfComments) {
            this.postTitle = postTitle;
            this.likes = likes;
            this.shares = shares;
            this.numberOfComments = numberOfComments;
        }

        // Getters and setters
        public String getPostTitle() {
            return postTitle;
        }

        public void setPostTitle(String postTitle) {
            this.postTitle = postTitle;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getShares() {
            return shares;
        }

        public void setShares(int shares) {
            this.shares = shares;
        }

        public int getNumberOfComments() {
            return numberOfComments;
        }

        public void setNumberOfComments(int numberOfComments) {
            this.numberOfComments = numberOfComments;
        }
    }
}