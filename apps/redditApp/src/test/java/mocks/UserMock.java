package mocks;

import com.ScalableTeam.reddit.app.entity.User;

public class UserMock {
    private static final String id = "MockUser";
    private static final String photoLink = "https://google.com/image/123";
    private static final String email = "someemail@gmail.com";
    private static final String password = "password";

    public static User getUser() {
        return User.builder()
                .userNameId(id)
                .email(email)
                .profilePhotoLink(photoLink)
                .password(password)
                .build();
    }

    public static String getId() {
        return id;
    }
}
