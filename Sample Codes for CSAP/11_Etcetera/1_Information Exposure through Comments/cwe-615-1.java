public class Test{

// Password for administrator is "tiger." <- �ּ��� �н����尡 �����ִ�.
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