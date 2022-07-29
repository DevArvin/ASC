public class Test{
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
{
  try {
    String id = request.getParameter("id");
    String passwd = request.getParameter("passwd");
    // 패스워드 복잡도 검증 없이 가입 승인 처리
    Connection con = DriverManager.getConnection(url, passwd);
   
    // ...
    } catch (SQLException e) { }
  }
  // ...
}
}