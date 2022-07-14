package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    private final static UserServiceImpl userService = new UserServiceImpl();
    public static void main(String[] args) throws SQLException {

        userService.createUsersTable();
        userService.saveUser("Хуй", "Простой", (byte) 44);
        userService.saveUser("Лев", "Толстой", (byte) 94);
        userService.saveUser("Александр", "Пистолетов", (byte) 55);
        userService.saveUser("Джо", "Байден", (byte) 88);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        }
    }
