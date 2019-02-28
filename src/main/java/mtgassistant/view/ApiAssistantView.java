package mtgassistant.view;

import javafx.stage.Stage;

public interface ApiAssistantView {
	
	Stage stage();
	
	public void init();
	
	public void drawPlayers();
	
	public void drawDecks();

	public void drawTokens();

	public void drawCounters();
	
}
