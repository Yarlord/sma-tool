package userinfo;

import posts.Post;
import user.User;

public class InstagramUserInfo implements User,Post {
    private String userId;
    private String userName;

    // Constructor
    public InstagramUserInfo(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}