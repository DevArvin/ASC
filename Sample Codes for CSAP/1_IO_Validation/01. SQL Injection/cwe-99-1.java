public class Test{

public void bad() throws Throwable
{
  String data;

  data = System.getProperty("user.home");  

  Connection conn_tmp2 = null;
  Statement sqlstatement = null;

  try {
    conn_tmp2 = IO.getDBConnection();
    sqlstatement = conn_tmp2.createStatement();
    Boolean bResult = sqlstatement.execute("insert into users (status) values ('updated') where name='"+data+"'");
       }
}

}