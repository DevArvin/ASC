public class Test{

public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
{
  String data;

  data = request.getParameter("name"); 

  if (data != null)
  {
    response.getWriter().println("<br>bad(): data = " + data); 
  }
}

}