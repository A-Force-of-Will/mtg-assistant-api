package mtgassistant.view;

import mtgassistant.controller.AssistantController;

public interface ApiAssistantView {
	
	public void init();
	
	public void drawPlayers();
	
	public void drawDecks();

	public void drawTokens();

	public void drawCounters();

	public void registerController(AssistantController ac);
	
}
