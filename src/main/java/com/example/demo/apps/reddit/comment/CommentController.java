package com.example.demo.apps.reddit.comment;

import com.example.demo.apps.reddit.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @RequestMapping(method = RequestMethod.POST,value="/comments")
    private String comment(@RequestBody Comment comment){
        return commentService.execute(comment);
    }
}
