package ir.pi.project.shared.response;

//import ir.pi.project.shared.model.Board;
//import ir.pi.project.shared.model.User;

import ir.pi.project.shared.enums.others.Buttons;
import ir.pi.project.shared.model.Tweet;
import ir.pi.project.shared.model.help.HelpMessage;
import ir.pi.project.shared.model.help.HelpUser;

import java.util.List;
import java.util.Map;

public interface ResponseVisitor {

    void showMessage(String message);

    //Entering
    void loadWelcomePage();
    void loadSignUpPage();
    void loadLoginPage();

    void loadMainMenu(int authToken);

    //MyPage
    void loadMyPage(HelpUser helpUser);
    void loadEditProfilePage(HelpUser helpUser);
    void loadNotificationsPage(List<String> notifications);
    void loadPendingListPage(List<String> pendingList);
        //Lists
    void loadBlackList(Map<String,String> blackList);
    void loadRequestsList(Map<String,String>  request);
    void loadFollowersList(Map<String,String> followers);
    void loadFollowingsList(Map<String,String>  followings);

    //Tweet
    void loadTweet(Tweet tweet,HelpUser writer,HelpUser retweetedBy);
    void loadForwardPage();

    //Explorer
    void loadExplorerPage();

    //Settings
    void loadSettingsPage();
    void loadDeleteAccountPage();
    void loadPrivacySettingsPage(HelpUser helpUser);
    void loadCurrentPassword();
    void loadNewPassword();

    //ShowProfile
    void loadProfilePage(HelpUser user,String followButtonText,String blockButtonText,String muteButtonText,String blockStateText,String followingStateText,String lastSeenText);


    //Messages
    void loadMessagesPage();
         //MultipleMessaging
    void loadMultipleToUsersPage(List<String> usernames);
    void loadMultipleToGroupsPage(List<String> groupNames);
         //Groups
    void loadGroupsPage(List<String> groupNames);
    void loadEditGroupPage(List<String> groupNames);
         //DirectChat
    void loadDirectChatsListPage(Map<String,Integer> unreadUsernames, List<String> alreadyReadUsernames);
         //GroupChat
    void loadGroupChatsListPage(Map<String,Integer> unreadGroupChats, List<String> alreadyReadGroupChats);
    void loadNewGroupChatPage(List<String > usernames);

    void loadChatPage(List<HelpMessage> messages,String name,boolean isDirect, int myId);



    void loadButton(Buttons buttons);
    void nothing();
}
