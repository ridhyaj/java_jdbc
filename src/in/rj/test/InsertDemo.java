package in.rj.test;

import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/Student";
        String username="root";
        String password="Ridhya@23";
        String query ="Insert into details (ID,Name,class) values (?,?,?)";

//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1001,"John doe");
        ResultSet rs=ps.executeQuery();

        ps.close();
        con.close();
    }
}
