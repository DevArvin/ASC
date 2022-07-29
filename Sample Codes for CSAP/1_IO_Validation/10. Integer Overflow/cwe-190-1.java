public class CWE190_Integer_Overflow__int_database_add_01 extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        byte data;

        data = Integer.MIN_VALUE; /* Initialize data */

        /* Read data from a database */
        {
            Connection conn = null;
            PreparedStatement statement = null;
            ResultSet rs = null;
            try {
                /* setup the connection */
                conn = IO.getDBConnection();

                /* prepare and execute a (hardcoded) query */
                statement = conn.prepareStatement("select name from users where id=0");
                rs = statement.executeQuery();

                /* POTENTIAL FLAW: Read data from a database query resultset */
                String s_data = rs.getString(1);
                if (s_data != null)   // avoid NPD incidental warnings
                {
                    try
                    {
                        data = Integer.parseInt(s_data.trim());
                    }
                    catch(NumberFormatException nfe)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", nfe);
                    }
                }
            }
            .. Áß·« ..
        }

        /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
        int result = (int)(data + 1);

        IO.writeLine("result: " + result);
    }
}