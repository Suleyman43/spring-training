package com.cydeo.proxy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy{


    /**
     * @param comment
     */
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment:" + comment.getText());
    }
}
