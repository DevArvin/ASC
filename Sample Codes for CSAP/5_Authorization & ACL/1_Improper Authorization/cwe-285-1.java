public class Test {

public void f(String sSingleId, int iFlag, String sServiceProvider, String sUid, String sPwd)
{
  env.put(Context.INITIAL_CONTEXT_FACTORY, CommonMySingleConst.INITCTX);
  env.put(Context.PROVIDER_URL, sServiceProvider);
  // 익명으로 LDAP 인증을 사용

  env.put(Context.SECURITY_AUTHENTICATION, "none");
  env.put(Context.SECURITY_PRINCIPAL, sUid);
  env.put(Context.SECURITY_CREDENTIALS, sPwd);
  // ...
}

}