package com.cydeo.service;

import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.respository.CommentRepository;
import com.cydeo.respository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;
@Component
public class CommentService {

  //  @Autowired     constructor olusturunca buna gerek yok
    private final CommentRepository commentRepository;
    //  @Autowired     constructor olusturunca buna gerek yok
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
       commentRepository.storeComment(comment);  // save in the database DB
       commentNotificationProxy.sendComment(comment); // send email
    }
}
