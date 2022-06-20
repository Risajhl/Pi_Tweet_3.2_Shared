package ir.pi.project.shared.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tweet {

    int id;
    int writer;
    String text;
    List<Integer> comments;
    int likesNum;
    LocalDateTime time;
    int reportedTimes;
    boolean isBanned;
    boolean isRetweeted;
    int retweetedBy;
    String imageInString;


    public Tweet(int id,int userId, String text) {
            this.id=id;
            this.writer = userId;
            this.text = text;
            this.comments = new ArrayList<>();
            this.likesNum = 0;
            this.time = LocalDateTime.now();
            this.reportedTimes=0;
            this.isBanned=false;
            this.isRetweeted=false;
            this.retweetedBy=-1;

    }

    public int getId() {
        return id;
    }

    public int getWriter() {
        return writer;
    }

    public String getText() {
        return text;
    }

    public int getLikesNum() {
        return likesNum;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public List<Integer> getComments() {
        return comments;
    }


    public void addToLikeNums(int n){
        this.likesNum=likesNum+n;
    }
    public void addToReportedTimes(){
        this.reportedTimes++;
    }

    public int getReportedTimes() {
        return reportedTimes;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public boolean isRetweeted() {
        return isRetweeted;
    }

    public void setRetweeted(boolean retweeted) {
        isRetweeted = retweeted;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public String getImageInString() {
        return imageInString;
    }


    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setImageInString(String imageInString) {
        this.imageInString = imageInString;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWriter(int writer) {
        this.writer = writer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setComments(List<Integer> comments) {
        this.comments = comments;
    }

    public void setLikesNum(int likesNum) {
        this.likesNum = likesNum;
    }

    public void setReportedTimes(int reportedTimes) {
        this.reportedTimes = reportedTimes;
    }

    public int getRetweetedBy() {
        return retweetedBy;
    }

    public void setRetweetedBy(int retweetedBy) {
        this.retweetedBy = retweetedBy;
    }
}
