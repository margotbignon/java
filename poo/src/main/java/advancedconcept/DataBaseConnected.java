package advancedconcept;

import java.sql.*;

public class DataBaseConnected {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {



        //jdbc : JavaDataBaseConnectivity
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);

        try {
            //INSERT VALUE
            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO users(`username`, `password`) VALUES(?, ?) ");
            insertStatement.setString(1, "John");
            insertStatement.setString(2, "john63");
            insertStatement.executeUpdate();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users where ID = ?");

            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();

            connection.commit();

            while(resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }

            resultSet.close();
            preparedStatement.close();
            insertStatement.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            connection.rollback();
        } finally {
            connection.close();
        }


        /*Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");*/

        //Prepared statement


    }
}
