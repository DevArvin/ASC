public class S488 extends HttpServlet 
{
  String name; // �������� ����

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    name = request.getParameter("name");
    if (name == null || "".equals(name)) return;
    out.println(name + ", thanks for visiting!");
  }
}