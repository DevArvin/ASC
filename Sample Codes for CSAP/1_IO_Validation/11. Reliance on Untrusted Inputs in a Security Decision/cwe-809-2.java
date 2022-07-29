public class Test {

public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        HttpSession session = request.getSession(true);
        boolean admin = false;
        Cookie[] cookies = request.getCookies();      
        for (int i=0; i<cookies.length; i++)
        {
            Cookie c = cookies[i];                      
            if (c.getName().equals("role"))         
            {
                if (c.getValue().equals("admin"))      
                {
                    admin = true;
                }
            }
        }
}

}