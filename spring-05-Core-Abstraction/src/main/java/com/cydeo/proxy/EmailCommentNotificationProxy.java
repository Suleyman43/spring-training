package com.cydeo.proxy;

import javax.xml.stream.events.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "+comment.getText());
    }
}
