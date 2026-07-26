package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment();
        comment.setAuthor("HerinOd");
        comment.setText("Nằn ná na na");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
