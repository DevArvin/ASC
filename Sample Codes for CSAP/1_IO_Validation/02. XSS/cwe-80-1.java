public class Test{


public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
{
  String data;

  Cookie cookieSources[] = request.getCookies();   // Å½Áö
  if (cookieSources != null)
  {
    data = cookieSources[0].getValue();    
  }

  if (data != NULL) {
     response.getWriter().println("<br>bad(): data = " + data);
  }
}

}