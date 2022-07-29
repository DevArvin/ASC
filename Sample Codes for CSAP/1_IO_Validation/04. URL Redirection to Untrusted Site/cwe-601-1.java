public class OSCommandInjection
{
public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
{
  String data;

  Connection conn = null;
  PreparedStatement statement = null;
  ResultSet rs = null;
  try {
    conn = IO.getDBConnection();
    statement = conn.prepareStatement("select name from users where id=0");
    rs = statement.executeQuery();
    data = rs.getString(1);
  }
  .. Áß·« ..

  if (data != null)
  {
    URI u;
    try
    {
      u = new URI(data);
    }
    catch (URISyntaxException e)
    {
      response.getWriter().write("Invalid redirect URL");
      return;
    }

    response.sendRedirect(data);
    return;
  }
}

}