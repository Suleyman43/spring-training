package com.cydeo.proxy;

import javax.xml.stream.events.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
