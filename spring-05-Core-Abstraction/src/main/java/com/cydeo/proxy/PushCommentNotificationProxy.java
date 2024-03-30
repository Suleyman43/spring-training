package com.cydeo.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
public class PushCommentNotificationProxy implements CommentNotificationProxy{


    /**
     * @param comment
     */
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment:" + comment.getText());
    }
}
