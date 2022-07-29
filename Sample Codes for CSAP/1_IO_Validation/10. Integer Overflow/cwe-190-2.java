public class CWE190_Integer_Overflow__byte_console_readLine_add_01 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        byte data;

        /* init data */
        data = -1;

        /* POTENTIAL FLAW: Read data from console with readLine*/
        BufferedReader buffread = null;
        InputStreamReader instrread = null;
        try {
            instrread = new InputStreamReader(System.in, "UTF-8");
            buffread = new BufferedReader(instrread);
            String s_data = buffread.readLine();
            if (s_data != null)
            {
                data = Byte.parseByte(s_data.trim());
            }
        }
        ..  Áß·« ..

        /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
        byte result = (byte)(data + 1);

        IO.writeLine("result: " + result);
    }
}