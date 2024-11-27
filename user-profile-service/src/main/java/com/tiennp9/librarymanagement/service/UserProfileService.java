public interface UserProfileService {
    UserProfile createUserProfile(UserProfile userProfile);
    UserProfile getUserProfileById(Long id);
    UserProfile updateUserProfile(Long id, UserProfile userProfile);
    void deleteUserProfile(Long id);
    List<UserProfile> getAllUserProfiles();
}
