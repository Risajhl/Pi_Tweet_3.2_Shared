package ir.pi.project.shared.event;

import ir.pi.project.shared.enums.Pages.*;
import ir.pi.project.shared.enums.others.*;
import ir.pi.project.shared.response.Response;

import java.time.LocalDateTime;

public interface EventVisitor {
    //WelcomePage
    Response welcomePageEvent(WelcomePage welcomePage);
    Response signUp(String firstName,String lastName,String userName,String password,String email,String phoneNumber,String birthDate,boolean EPBCanSee);
    Response logIn(String username,String password);

    //MainMenu
    Response mainMenuPageEvent(MainMenuPage mainMenuPage);
    Response getMainMenu();

    //MyPage
    Response myPageEvent(MyPage myPage);
    Response newTweet(String text,String tweetImageInString);
    Response myPageUpReq();
    Response notificationsUpReq();
    Response pendingListUpReq();
    Response forwardTweetEvent(String username);
        //Lists
                 //BlackList
    Response unblock(String username);
                 //Requests
    Response requestComponentEvent(String username, RequestComponent requestComponent);
    Response requestsListUpReq();
                 //Followers
    Response deleteFollowerEvent(String username);
    Response followersListUpReq();
                 //Followings
    Response unfollowEvent(String username);
    Response followingsListUpReq();

    //EditInfo
    Response saveInfoEvent(String firstName,String lastName,String userName,String email,String phoneNumber,String birthDate,String biography,boolean canSee,String imageInString);

    //Tweet
    Response tweetComponentEvent(TweetComponent tweetComponent);
    Response showTweetUpReq();
    Response newComment(String text,String imageInString);

    //Explorer
    Response explorerPageEvent(String username, ExplorerPage explorerPage);

    //Settings
    Response settingsPageEvent(SettingsPage settings);
    Response deleteAccount(String password);
    Response changePasswordEvent();
    Response checkPassword(String password);
    Response savePrivacySettingsEvent(boolean isActive,boolean isPublic,String lasSeen,String password);

    //ProfilePage
    Response profilePageEvent(ProfilePage profilePage);
    Response profilePageUpReq();


    //Messages
    Response messagesPageEvent(MessagesPage messagesPage);
    Response addToMultiplesEvent(MessagesPage messagesPage,String string);
    Response sendMultipleMessageEvent(MessagesPage messagesPage, String text,String imageInByte);
    Response groupsPageEvent(GroupsPage groupsPage, String string);
    Response messagesUpReqEvent(MessagesUpReqs messagesUpReqs);
    Response newGroupChatEvent(NewGroupChat newGroupChat, String string);
    Response showChatEvent(MessagesPage messagesPage,String string);
    Response chatPageEvent(MessagesPage messagesPage, ChatPage chatPage, String string);
    Response newMessageEvent(MessagesPage messagesPage,String text,String imageInString);
    Response messageOnWorkEvent(MessageOnWork messageOnWork, int messageId);
    Response scheduleMessageEvent(MessagesPage messagesPage,LocalDateTime localDateTime,String text,String imageInString);


    Response closeEvent();
}
