package mtgassistant;

import java.net.URL;

import edu.neumont.baydak.battleship.controller.Game;
import edu.neumont.baydak.battleship.gui.BattleshipView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mtgassistant.controller.AssistantController;

public class MtgAssistant extends Application {

	public static void main(String[] args) {
		AssistantController ac = new AssistantController();
		
		ac.run();
	}

	public void start(Stage stage) throws Exception {
		URL location = this.getClass().getClassLoader().getResource("Battleship.fxml");
		FXMLLoader loader = new FXMLLoader(location);
		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		BattleshipView viewController = loader.getController();
		viewController.setStage(stage);
		
		Game controller = new Game(viewController);
		controller.run();
	}

}
