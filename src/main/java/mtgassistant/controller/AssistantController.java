package mtgassistant.controller;

import javafx.scene.control.TextField;
import mtgassistant.model.Card;
import mtgassistant.model.Counter;
import mtgassistant.model.Deck;
import mtgassistant.model.Player;
import mtgassistant.model.Token;
import mtgassistant.view.ApiAssistantView;

public class AssistantController {
	
	private ApiAssistantView view;
	
	public AssistantController() {}
	
	public AssistantController(ApiAssistantView view) {
		this.view = view;
		this.view.registerController(this);
	}
	
	public void run() {
		this.view.init();
	}
	
	public void addCounter() {
		
	}
	
	public void editCounter(Counter counter) {
		
	}
	
	public void deleteCounter(Counter counter) {
		
	}
	
	public void addPlayer() {
		
	}
	
	public void editPlayer(Player player) {
		
	}
	
	public void deletePlayer(Player player) {
		
	}
	
	public void addCard() {
		
	}
	
	public void editCard(Card card) {
		
	}
	
	public void deleteCard(Card card) {
		
	}
	
	public void addDeck() {
		
	}
	
	public void editDeck(Deck deck) {
		
	}
	
	public void deleteDeck(Deck deck) {
		
	}
	
	public void addToken() {
		
	}
	
	public void editToken(Token token) {
		
	}
	
	public void deleteToken(Token token) {
		
	}

	public int onLifeUpdateRequested(TextField life, int result) {
		String l = life.toString();
		int hp = Integer.parseInt(l);
		 return hp += result;
	}
}
