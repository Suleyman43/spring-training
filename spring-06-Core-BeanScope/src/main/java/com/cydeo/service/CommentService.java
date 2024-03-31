package com.cydeo.service;

import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.respository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {

  //  @Autowired     constructor olusturunca buna gerek yok
    private final CommentRepository commentRepository;
    //  @Autowired     constructor olusturunca buna gerek yok
    private final CommentNotificationProxy commentNotificationProxy;

                                                                           //default bean name
    public CommentService(CommentRepository commentRepository,@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
       commentRepository.storeComment(comment);  // save in the database DB
       commentNotificationProxy.sendComment(comment); // send email
    }
}
