public class S488 extends HttpServlet 
{

public void bad() throws Throwable
{

try {						
	Integer.parseInt("Test");	
}
catch (Exception e)				// 광범위한 예외처리 클래스 사용
{
	IO.writeLine("Caught Exception");
	throw e;
}

}

}