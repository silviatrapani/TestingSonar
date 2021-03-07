package helloworldpackage;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String[] args) {
    	final Logger log = Logger.getLogger(HelloWorld.class.getName());
    	log.info("Hello, World");
    }

}