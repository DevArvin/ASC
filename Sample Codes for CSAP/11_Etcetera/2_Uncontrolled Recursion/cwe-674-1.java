public class S488 extends HttpServlet 
{

public int factorial(int n) {
  // 재귀 호출이 조건문/반복문 블럭 외부에서 일어나면 대부분 무한 재귀를 유발한다.
  return n * factorial(n - 1);
}

}