public class Test{
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
{
  try {
    String id = request.getParameter("id");
    String passwd = request.getParameter("passwd");
    // �н����� ���⵵ ���� ���� ���� ���� ó��
    Connection con = DriverManager.getConnection(url, passwd);
   
    // ...
    } catch (SQLException e) { }
  }
  // ...
}
}