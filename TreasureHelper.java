package treasurehelper;
import java.util.Random;

import tables.MagicItemsTable;
import tables.MagicWeaponsArmourTable;
import tables.PotionsTable;
import tables.ScrollsGrimmoirsTable;

public class TreasureHelper {

	public static void main(String[] args) {
		Random dice = new Random();
		PotionsTable potions = new PotionsTable();
		ScrollsGrimmoirsTable scrollsGrimmoirs = new ScrollsGrimmoirsTable();
		MagicItemsTable magicItems = new MagicItemsTable();
		MagicWeaponsArmourTable magicWeaponsArmour = new MagicWeaponsArmourTable();

		int diceRoll1, diceRoll2, treasureCount = 3, collectedGold;
		String[] collectedItems;

		diceRoll1 = dice.nextInt(4);
		diceRoll2 = dice.nextInt(20);

	}
}
