package metawebmodel.tools;

import metawebmodel.*;

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
  protected final String TEXT_1 = NL + "package org.lip6.struts.domain;" + NL;
  protected final String TEXT_2 = " " + NL + "public class ";
  protected final String TEXT_3 = "{" + NL;
  protected final String TEXT_4 = NL + NL + "\tprivate ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = ";" + NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_9 = " get";
  protected final String TEXT_10 = " (){" + NL + "\t\treturn ";
  protected final String TEXT_11 = ";" + NL + "\t}" + NL + "\t" + NL + "\tpublic void set";
  protected final String TEXT_12 = "(";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = "){" + NL + "\t\tthis.";
  protected final String TEXT_15 = " = ";
  protected final String TEXT_16 = ";" + NL + "\t}\t" + NL + "\t";
  protected final String TEXT_17 = NL + NL + NL + "}" + NL;
  protected final String TEXT_18 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Entity entite = (Entity) argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( entite.getNom() );
    stringBuffer.append(TEXT_3);
     for(int i =0; i<entite.getAtributes().size();i++){ 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( entite.getAtributes().get(i).getType().getNom() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( entite.getAtributes().get(i).getName() );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
     for (int i = 0 ; i<entite.getAtributes().size();i++){ 
    stringBuffer.append(TEXT_8);
    stringBuffer.append( entite.getAtributes().get(i).getType().getNom() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(entite.getAtributes().get(i).getName() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( entite.getAtributes().get(i).getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append( entite.getAtributes().get(i).getName() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(entite.getAtributes().get(i).getType().getNom() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( entite.getAtributes().get(i).getName() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( entite.getAtributes().get(i).getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append( entite.getAtributes().get(i).getName());
    stringBuffer.append(TEXT_16);
     } 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
