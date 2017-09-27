package UserDB;

import fenn.user.User;
import java.sql.*;

public class UserDB {
    
    public static int insert(User user) {
        PreparedStatement ps = null;
        
        String query
                = "INSERT INTO User (fname, lname, phone, address, city, state, zipcode, email, username, password) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getCity());
            ps.setString(6, user.getState());
            ps.setString(7, user.getZipcode());
            ps.setString(8, user.getEmail());
            ps.setString(9, user.getUsername());
            ps.setString(10, user.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
        }
    }
    
}
