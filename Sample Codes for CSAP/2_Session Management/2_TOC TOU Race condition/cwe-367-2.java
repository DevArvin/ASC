public class S488 extends HttpServlet 
{
  String name; // 전역변수 선언

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    name = request.getParameter("name");
    if (name == null || "".equals(name)) return;
    out.println(name + ", thanks for visiting!");
  }
}