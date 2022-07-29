public class Test{

// Password for administrator is "tiger." <- 주석에 패스워드가 적혀있다.
public boolean DBConnect() {
  String url = "DBServer";
  String password = "tiger";
  Connection con = null;

  try {
    con = DriverManager.getConnection(url, "scott", password);
  } catch (SQLException e) {
  // ...
  }
}


}