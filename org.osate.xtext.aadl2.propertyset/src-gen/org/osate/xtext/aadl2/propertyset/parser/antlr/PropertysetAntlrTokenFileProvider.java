/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.propertyset.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PropertysetAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/osate/xtext/aadl2/propertyset/parser/antlr/internal/InternalPropertysetParser.tokens");
	}
}