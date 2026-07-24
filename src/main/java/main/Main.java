package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        DBCommentRepository dbCommentRepository = new DBCommentRepository();
        EmailCommentNotificationProxy emailCommentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(emailCommentNotificationProxy, dbCommentRepository);

        Comment comment = new Comment();

        comment.setAuthor("HerinOd");
        comment.setText("Sẽ có những con cá phải giả chó!");

        commentService.publishComment(comment);

    }
}
