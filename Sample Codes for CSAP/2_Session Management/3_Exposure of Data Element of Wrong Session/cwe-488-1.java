public class U488 extends HttpServlet {
  private String name;
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    name = request.getParameter("name");
    // ...
    out.println(name + ", thanks for visiting!");
  }
}