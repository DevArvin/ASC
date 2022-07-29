public class OSCommandInjection
{

public void f()
{
  try {
    javax.naming.directory.DirContext ctx = new InitialDirContext(env);
    // 외부로 부터 입력을 받는다.
    String name = props.getProperty("ldap.properties");
    // 입력값에 대한 BasicAtrtribute를 생성한다.
    BasicAttribute attr = new BasicAttribute("name", name);
    // 외부 입력값이 LDAP search() 매소드에 인자로 사용이 된다.
    NamingEnumeration answer = ctx.search("ou=NewHires", attr.getID(), new SearchControls());
    printSearchEnumeration(answer);
    ctx.close();
    } catch (NamingException e) { }
  }
}

}