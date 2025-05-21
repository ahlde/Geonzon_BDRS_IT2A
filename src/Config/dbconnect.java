
package Config;

import java.sql.*;

public class dbconnect {
     private Connection connect;
     
     public dbconnect(){
        
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/barangay", "root", "");
        } catch (SQLException ex) {
            System.out.println("❌ Can't connect to database: " + ex.getMessage());
        }
    }
     
    // ✅ Correctly Implement getConnection()
    public Connection getConnection() {
        return connect;
    }

    // Method to fetch data from the database
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }

    // Method to insert/update data
    public int insertData(String sql){
        int result = 0;
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            result = pst.executeUpdate();
            System.out.println("✅ Data Inserted Successfully!");
        } catch (SQLException ex) {
            System.out.println("❌ Insert Error: " + ex.getMessage());
        }
        return result;
    }

    // ✅ Implement executeUpdate()
    public int executeUpdate(String sql) {
        int result = 0;
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            result = pst.executeUpdate();
            System.out.println("✅ Data Updated Successfully!");
        } catch (SQLException ex) {
            System.out.println("❌ Update Error: " + ex.getMessage());
        }
        return result;
    }
}
