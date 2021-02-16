import java.sql.Connection;
import java.sql.DriverManager;

//Author Swarup
public class PostgreSQLJDBC {
   public static void main(String args[]) {
      @SuppressWarnings("unused")
	Connection con = null;
      try {
         Class.forName("org.postgresql.Driver");
         con = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "bharat");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}
