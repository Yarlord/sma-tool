package posts;

import java.util.ArrayList;

public interface Post {
	long likes=0;
	long comments=0;
	long shares=0;
	ArrayList<String> hashtagUsed = new ArrayList<String>();
	String mediaType="";
}
