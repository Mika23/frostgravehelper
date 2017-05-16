package tables;

public class ScrollsGrimmoirsTable {
	private String[][] scrolls = {
		{ "Reveal Death", "Curse", "Fleet Feet", "Leap", "Wall", "Push", "Teleport", "Strength",
			"Awareness", "Shield", "Bonde Dart", "Mud", "Decay", "Plague of Insects",
			"Elemental Bolt", "Furious Quill", "Monstrous Form", "Enchant Weapon",
			"Combat Awareness", "Circle of Protection" },
		{ "Bones of the Earth", "Poison Dart", "Slow", "Imp", "Call Storm", "Draining Word",
			"Invisibility", "Telekinesis", "Reveal Invisible", "Banish", "Spell Eater", "Fog",
			"Time Store", "Planar Tear", "Elemental Ball", "Absorb Knowledge", "Fool's Gold",
			"Grenade", "Wizard Eye", "Heal" },
		{ "Strike Dead", "Animal Companion", "Crumble", "Plane Walk", "Scatter Shot",
			"Explosive Rune", "Beauty", "Enchant Armour", "Will Power", "Blinding Light",
			"Steal Health", "Control Animal", "Petrify", "Possess", "Elemental Hammer",
			"Power Word", "Glow", "Embed Enchantment", "forget Spell", "Dispel" },
		{ "Control Undead", "Familiar", "Fast Act", "Bind Demon", "Destructive Spell",
			"Write Scroll", "Transpose", "Control Cunstruct", "Mind Control", "Mind Control",
			"Miraculous Cure", "Raise Zombie", "Brew Potion", "Time Walk", "Summon Demon",
			"Elemental Shield", "Create Grimmoir", "Illusionary Soldier", "Animate Construct",
			"Reveal Secret", "Restore Life" } };

	public String getScroll(int row, int col) {
		return scrolls[row][col];
	}

}
