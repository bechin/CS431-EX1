import java.io.IOException;

public class ProcessTest{

	public static void main(String[] args) throws IOException{
		ProcessBuilder javaBuilder = new ProcessBuilder("java").inheritIO();
		Process java = javaBuilder.start();
	}

}
