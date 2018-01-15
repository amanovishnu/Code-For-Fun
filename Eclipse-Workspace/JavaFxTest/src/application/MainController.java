package application;
import javafx.event.ActionEvent;
import java.util.Random;
public class MainController {
	public void generateRandon(ActionEvent event) {
		Random rand = new Random();
		int myrand = rand.nextInt(50)+1;
		
	}
}
