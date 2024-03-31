package com.cydeo.respository;

import javax.xml.stream.events.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
