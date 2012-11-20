package metawebmodel.tools;

public class EntitiesGenerator
{
  protected static String nl;
  public static synchronized EntitiesGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    EntitiesGenerator result = new EntitiesGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    return stringBuffer.toString();
  }
}
