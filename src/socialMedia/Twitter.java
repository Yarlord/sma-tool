package socialMedia;

public class Twitter implements SocialMediaPlatform {
    private String apiUrl;

    // Constructor
    public Twitter(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    // Implementing the fetchData method
    @Override
    public String fetchData() {
        // This is just a placeholder, actual implementation will vary
        return "Data fetched from Twitter";
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

    // Nested class TwitterPost
    public class TwitterPost {
        private String tweetContent;
        private int retweets;
        private int likes;
        private boolean isExclusive; // New field indicating whether the tweet is exclusive

        // Constructor
        public TwitterPost(String tweetContent, int retweets, int likes, boolean isExclusive) {
            this.tweetContent = tweetContent;
            this.retweets = retweets;
            this.likes = likes;
            this.isExclusive = isExclusive;
        }

        // Getters and setters
        public String getTweetContent() {
            return tweetContent;
        }

        public void setTweetContent(String tweetContent) {
            this.tweetContent = tweetContent;
        }

        public int getRetweets() {
            return retweets;
        }

        public void setRetweets(int retweets) {
            this.retweets = retweets;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public boolean isExclusive() {
            return isExclusive;
        }

        public void setExclusive(boolean exclusive) {
            isExclusive = exclusive;
        }
    }
}