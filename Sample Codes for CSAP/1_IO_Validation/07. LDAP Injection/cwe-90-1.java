public class OSCommandInjection
{

public void f()
{
  try {
    javax.naming.directory.DirContext ctx = new InitialDirContext(env);
    // �ܺη� ���� �Է��� �޴´�.
    String name = props.getProperty("ldap.properties");
    // �Է°��� ���� BasicAtrtribute�� �����Ѵ�.
    BasicAttribute attr = new BasicAttribute("name", name);
    // �ܺ� �Է°��� LDAP search() �żҵ忡 ���ڷ� ����� �ȴ�.
    NamingEnumeration answer = ctx.search("ou=NewHires", attr.getID(), new SearchControls());
    printSearchEnumeration(answer);
    ctx.close();
    } catch (NamingException e) { }
  }
}

}