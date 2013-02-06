To generate the code from the owl file:

mvn clean compile exec:java -Dexec.mainClass="gov.nasa.jpl.cdp.rdfreactor.App" -Dexec.args="<opmfile> <package> <generated source directory>"

For example, to generate the code for the opmo-20101012.owl:

$ cd ~/workspace/cdp-rdfreactor
$ mvn clean compile exec:java -Dexec.mainClass="gov.nasa.jpl.cdp.rdfreactor.App" -Dexec.args="opmo-20101012.owl gov.nasa.jpl.cdp.provenance.opmo mySource"
