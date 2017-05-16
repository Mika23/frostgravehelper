package tables;

public class MagicItemsTable {
	private String[] magicItems = { "Staff of Power (1)", "Staff of Power (2)",
		"Staff of Power (3)", "Ring of Power (1)", "Orb of Power (8)", "Staff of Casting",
		"Boots of Speed", "Ring of Slow Fall", "Ring of Will", "Ring of Teleportation",
		"Gloves of Strength", "Robes of Arrow Turning", "Amulet of Resistance",
		"Candle of Summoning", "Gloves of Casting", "Belt of Animal Repellance",
		"Horn of Destruction", "Fate Stone", "Drinking Horn of Healing", "Banner of Courage" };

	public String getItem(int i) {
		return magicItems[i];
	}
}
