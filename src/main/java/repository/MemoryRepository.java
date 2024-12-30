package repository;

import model.User;

import java.util.ArrayList;

public class MemoryRepository {
    static ArrayList<User> userList = new ArrayList<>();

    static {
        userList.add(new User("AAA", "1111", "UserA", "aaaa@gmail.com"));
        userList.add(new User("BBB", "1111", "UserB", "aaaa@gmail.com"));
    }

    public static ArrayList<User> findAll() {
        return userList;
    }

    public static void addUser(User user) {
        userList.add(user);
    }

    public static User findUserById(String userId) {
        return userList.stream()
                .filter(user -> userId.equals(user.getUserId()))
                .findFirst()
                .orElse(null);
    }
}
