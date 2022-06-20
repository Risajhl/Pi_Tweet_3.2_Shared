package ir.pi.project.shared.response.others;

import ir.pi.project.shared.model.Tweet;
import ir.pi.project.shared.model.User;
import ir.pi.project.shared.model.help.HelpUser;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadTweet extends Response {
    Tweet tweet;
    HelpUser writer;
    HelpUser retweetedBy;

    public LoadTweet(Tweet tweet,HelpUser writer,HelpUser retweetedBy){
        this.tweet=tweet;
        this.writer=writer;
        this.retweetedBy=retweetedBy;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadTweet(tweet,writer,retweetedBy);
    }
}
