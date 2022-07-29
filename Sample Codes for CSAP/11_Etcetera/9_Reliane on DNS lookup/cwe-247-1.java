public class U247 extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
  throws ServletException, IOException {
    boolean trusted = false;
    String ip = req.getRemoteAddr();

    InetAddress addr = InetAddress.getByName(ip);

    if (addr.getCanonicalHostName().endsWith("trustme.com") ) {
      trusted = true;
    }
  }
}