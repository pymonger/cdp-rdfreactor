package gov.nasa.jpl.cdp.rdfreactor;

import org.ontoware.rdfreactor.generator.CodeGenerator;
import org.ontoware.rdf2go.Reasoning;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String version = 
		App.class.getPackage().getImplementationVersion();
	
	public static void printCommandHelp()
	{
		System.err.println("usage: owl2java <owlfile> " +
				"<package> <generated source directory>");
		System.err.println("e.g. owl2java opmo-20101012.owl " +
				"gov.nasa.jpl.cdp.provenance.opmo mySource");
		System.err.println("version: " + version);
		System.exit(1);
	}
	
    public static void main( String[] args )
    {
    	// 3 required args
    	if (args.length != 3) printCommandHelp();
    	String owlFile = args[0];
        String pkg = args[1];
        String srcDir = args[2];
    	
        try {
        	CodeGenerator.generate(owlFile, srcDir, pkg,
        			Reasoning.rdfs, true, true);
        }catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
