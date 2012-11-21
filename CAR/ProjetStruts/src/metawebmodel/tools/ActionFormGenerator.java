package metawebmodel.tools;

import metawebmodel.*;

public class ActionFormGenerator
{
  protected static String nl;
  public static synchronized ActionFormGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionFormGenerator result = new ActionFormGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " " + NL + "package org.lip6.struts.actionForm;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import org.apache.struts.action.ActionErrors; " + NL + "import org.apache.struts.action.ActionForm; " + NL + "import org.apache.struts.action.ActionMapping; " + NL + "import org.apache.struts.action.ActionMessage;" + NL + "" + NL + "public class ";
  protected final String TEXT_2 = "ValidationForm extends ActionForm {" + NL + "" + NL + "\t";
  protected final String TEXT_3 = NL + "\tprivate String ";
  protected final String TEXT_4 = ";" + NL + "\t\t";
  protected final String TEXT_5 = NL + "\t";
  protected final String TEXT_6 = NL + "\tpublic String get";
  protected final String TEXT_7 = "(){" + NL + "\t\treturn this.";
  protected final String TEXT_8 = ";" + NL + "\t}" + NL + "\t" + NL + "\tpublic void set";
  protected final String TEXT_9 = "(String ";
  protected final String TEXT_10 = "){" + NL + "\t\tthis.";
  protected final String TEXT_11 = "=";
  protected final String TEXT_12 = ";" + NL + "\t}" + NL + "\t\t";
  protected final String TEXT_13 = NL + "\t" + NL + "\tpublic void reset (ActionMapping mapping, HttpServletRequest request){";
  protected final String TEXT_14 = NL + "\t\t\tthis.";
  protected final String TEXT_15 = " = null;";
  protected final String TEXT_16 = NL + "\t}" + NL + "\t" + NL + "\tpublic ActionErrors validate(ActionMapping mapping, HttpServletRequest request){" + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t\tif(this.get";
  protected final String TEXT_18 = "() == null || this.get";
  protected final String TEXT_19 = "().length < 1){" + NL + "\t\t\terrors.add(\"";
  protected final String TEXT_20 = "\",new ActionMessage(\"creation.fn.error.required\"));" + NL + "\t\t}";
  protected final String TEXT_21 = NL + "\t\treturn errors;" + NL + "\t}" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Form formulaire = (Form) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( formulaire.getAction().getName() );
    stringBuffer.append(TEXT_2);
     for (int i =0; i<formulaire.getFields().size();i++){ 
		if (!formulaire.getFields().get(i).getInput().getInputType().getName().equals("Submit")){ 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_4);
     }}
    stringBuffer.append(TEXT_5);
     for (int i =0; i<formulaire.getFields().size();i++){ 
		if (!formulaire.getFields().get(i).getInput().getInputType().getName().equals("Submit")){ 
    stringBuffer.append(TEXT_6);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_12);
     }}
    stringBuffer.append(TEXT_13);
     for (int i =0; i<formulaire.getFields().size();i++){ if (!formulaire.getFields().get(i).getInput().getInputType().getName().equals("Submit")){ 
    stringBuffer.append(TEXT_14);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_15);
     } }
    stringBuffer.append(TEXT_16);
     for (int i =0; i<formulaire.getFields().size();i++)
		{ if (!formulaire.getFields().get(i).getInput().getInputType().getName().equals("Submit")){ 
    stringBuffer.append(TEXT_17);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( formulaire.getFields().get(i).getInput().getName() );
    stringBuffer.append(TEXT_20);
     }}
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
