import org.apache.log4j.Logger;


public class TestMain {

	private static final Logger log = Logger.getLogger(TestMain.class);
	public static void main(String[] args) {

		log.debug("Test");
		autreClasse();
	}
	
	
	public static void autreClasse() {

		log.error("Test");
	}

}
