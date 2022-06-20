package ir.pi.project.shared.model.help;

import java.util.List;

public class HelpUser {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String birthDate;
    private String email;
    private String phoneNumber;
    private String biography;
    private String lastSeen;
    private String lastSeenState;
    private boolean EPBCanSee;
    private boolean isOnline;
    private boolean isActive;
    private boolean isPublic;
    private List<Integer> followers;
    private List<Integer> followings;
    private List<Integer> retweets;

    //    private byte[] profileImageInByte;
    private String profileImageInString;

    public HelpUser(String firstName, String lastName, String userName, String password, String birthDate, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getLastSeenState() {
        return lastSeenState;
    }

    public void setLastSeenState(String lastSeenState) {
        this.lastSeenState = lastSeenState;
    }

    public boolean isEPBCanSee() {
        return EPBCanSee;
    }

    public void setEPBCanSee(boolean EPBCanSee) {
        this.EPBCanSee = EPBCanSee;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public List<Integer> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Integer> followers) {
        this.followers = followers;
    }

    public List<Integer> getFollowings() {
        return followings;
    }

    public void setFollowings(List<Integer> followings) {
        this.followings = followings;
    }

    public List<Integer> getRetweets() {
        return retweets;
    }

    public void setRetweets(List<Integer> retweets) {
        this.retweets = retweets;
    }
//
//    public byte[] getProfileImageInByte() {
//        return profileImageInByte;
//    }
//
//    public void setProfileImageInByte(byte[] profileImageInByte) {
//        this.profileImageInByte = profileImageInByte;
//    }


    public String getProfileImageInString() {
        return profileImageInString;
    }

    public void setProfileImageInString(String profileImageInString) {
        this.profileImageInString = profileImageInString;
    }
}


