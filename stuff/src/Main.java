
import java.sql.SQLException;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        var sql = "CREATE TABLE products (" +
                "    id SERIAL PRIMARY KEY," +
                "    name VARCHAR(255) NOT NULL," +
                "    price DECIMAL(10, 2) NOT NULL" +
                ");";
        try (var conn =  DB.connect();
             var stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}






/*what worked for me historically
* public static void main(String[] args){
        try (var connection =  DB.connect()){
            System.out.println("Connected to the PostgreSQL database.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
* */
