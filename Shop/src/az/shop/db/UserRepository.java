package az.shop.db;

import az.shop.dto.userSignUP.User;

public interface UserRepository {

    boolean addUser(User user);
    boolean checkUserNamePass(String username, String pass);




}
