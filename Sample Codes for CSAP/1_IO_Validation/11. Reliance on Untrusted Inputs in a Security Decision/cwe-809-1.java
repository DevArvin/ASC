public class Test {

public void makeCookie(ServletRequest request) {
  String maxAge = request.getProperty("maxAge");
  if (maxAge.matches("[0-9]+")) {
    String sessionID = request.getParameter("sesionID");
    if (sessionID.matches("[A-Z=0-9a-z]+")) {
      Cookie c = new Cookie("sessionID", sessionID);
      // 외부 입력이 쿠키 유효시한 설정에 그대로 사용 되었다.
      c.setMaxAge(Integer.parseInt(maxAge));
    }
  // ...
}
}
}