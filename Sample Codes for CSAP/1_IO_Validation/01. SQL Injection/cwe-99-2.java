public class Test{

public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
{
  String data;

  Cookie cookieSources[] = request.getCookies();
  if (cookieSources != null)
  {
    data = cookieSources[0].getValue();
  }

  Connection conn_tmp2 = null;
  Statement sqlstatement = null;

  try {
    conn_tmp2 = IO.getDBConnection();
    sqlstatement = conn_tmp2.createStatement();
    Boolean bResult = sqlstatement.execute("insert into users (status) values ('updated') where name='"+data+"'");
  }
}

}
