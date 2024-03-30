package com.cydeo.respository;

import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {

        System.out.println("Storing comment: "+ comment.getText());
    }
}
