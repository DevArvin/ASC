public class Test {


public Connection DBConnect()
{
  String url = "DBServer";
  String id = "scott";
  String password = "tiger";

  try {
    conn = DriverManager.getConnection(url, id, password);
  } catch (SQLException e) { }

  return conn;
}


}