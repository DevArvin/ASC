public class Test{

public void f() 
{
  URL[] classURLs= new URL[]{new URL("file:subdir/")};
  URLClassLoader loader = new URLClassLoader(classURLs);
  Class loadedClass = Class.forName("MyClass", true, loader);
}


}