
package socialMedia;

public interface SocialMediaPlatform {
    String PLATFORM_NAME = ""; // Constant for platform name
    String API_URL = ""; // Constant for API URL

    // Method to fetch data from the social media platform
    String fetchData();

    // Method to set API URL for data retrieval
    void setApiUrl(String apiUrl);

    // Method to get API URL for data retrieval
    String getApiUrl();
}
