import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ author Fei Gu
 * @ create 2021-04-13-11.35
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class BatchQueries {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")    ;
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_Bikes","sa","Sa@123456");
            System.out.println(con);

            PreparedStatement ps = con.prepareStatement("INSERT INTO DB_Bikes.tbl_bike VALUES(?,?,?,?)");
            PreparedStatement ps1 = con.prepareStatement("INSERT INTO DB_Bikes.tbl_category(category_name) VALUES(?)");

            ps.setInt(1,001);
            ps.setString(2,"R");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse("2000-01-01");
            ps.setDate(3,new java.sql.Date(date.getTime()));
            ps.setString(4,"Danmark");

            ps1.setString(1,"Road bike");

            ps.addBatch();

            ps.setInt(1,002);
            ps.setString(2,"M");
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = simpleDateFormat.parse("2010-01-01");
            ps.setDate(3,new java.sql.Date(date1.getTime()));
            ps.setString(4,"China");

            ps1.setString(1,"Mountain bike");

            ps.addBatch();


            ps.setInt(1,003);
            ps.setString(2,"F");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            Date date2 = simpleDateFormat.parse("2020-01-01");
            ps.setDate(3,new java.sql.Date(date2.getTime()));
            ps.setString(4,"German");

            ps1.setString(1,"Flodring bike");

            ps.addBatch();



            int[] a = ps.executeBatch();

            for (int i = 0; i < a.length; i++) {
                System.out.println("The number is : " + a[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int insertCategoryRecord(String bikeType, String categoryName) throws SQLException {

        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")    ;
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_Bikes","sa","Sa@123456");
            System.out.println(con);

            ps = con.prepareStatement("INSERT INTO tbl_category VALUES(?,?) ");
            ps.setString(1,'"' + bikeType + '"');
            ps.setString(2,'"' + categoryName + '"');

            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            return columns;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(ps != null){
                ps.close();
            }
            if(con != null){
                con.close();
            }
        }
        return 0;

    }

}

