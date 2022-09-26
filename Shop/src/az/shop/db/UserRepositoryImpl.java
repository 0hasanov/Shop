package az.shop.db;

import az.shop.dto.eNum.Gender;
import az.shop.dto.userSignUP.User;
import az.shop.model.Shoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public boolean addUser(User user) {
        boolean result = false;
        try {
            Connection connection = DBConfig.getConnection();
            String sql = "INSERT INTO nese.user (name, surname, username, password,age) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setInt(5, user.getAge());
            result = preparedStatement.execute();
            connection.close();
            System.out.println("Connected to PostgreSQL server");
        } catch (SQLException e) {
            System.out.println("Error in connectiong to PostgreSQL server");
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean checkUserNamePass(String username, String pass) {
        Connection connection = null;
        boolean result=false;
        try {
            String sql = "SELECT count(*) FROM nese.user where username=? and password=? ";
            connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,pass);
            ResultSet rs = preparedStatement.executeQuery();
            int count=0;
            while (rs.next()) {
                 count = rs.getInt("count");
            }
            if(count>0){
                result=true;
            }
            DBConfig.closeConnection(connection);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return result;

        }
    }
}
