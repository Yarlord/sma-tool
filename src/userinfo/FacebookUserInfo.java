package userinfo;

import user.User;
import posts.Post;
import socialMedia.Facebook;

public class FacebookUserInfo implements User,Post {
    private String userId;
    private String userName;

    // Constructor
    public FacebookUserInfo(String userId, String userName) {
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