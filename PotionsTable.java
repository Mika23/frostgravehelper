package tables;

public class PotionsTable {
	private String[] potions = { "Potion of Healing", "Potion of Healing", "Potion of Healing",
		"Potion of Healing", "Potion of Strength", "Potion of Strength", "Potion of Toughness",
		"Potion of Toughness", "Elixir of Speed", "Elixir of Speed", "Potion of Invisibility",
		"Potion of Invisibility", "Explosive Cocktail", "Explosive Cocktail",
		"Potion of Invulnerability", "Potion of Invulnerability", "Potion of Teleportation",
		"Potion of Teleportation", "Demon in a Bottle", "Demon in a Bottle", "Elixir of Live" };

	public String getPotion(int i) {
		return potions[i];

	}
}
