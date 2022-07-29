public class Test {

public void makeCookie(ServletRequest request) {
  String maxAge = request.getProperty("maxAge");
  if (maxAge.matches("[0-9]+")) {
    String sessionID = request.getParameter("sesionID");
    if (sessionID.matches("[A-Z=0-9a-z]+")) {
      Cookie c = new Cookie("sessionID", sessionID);
      // �ܺ� �Է��� ��Ű ��ȿ���� ������ �״�� ��� �Ǿ���.
      c.setMaxAge(Integer.parseInt(maxAge));
    }
  // ...
}
}
}