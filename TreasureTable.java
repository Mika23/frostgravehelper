package tables;
import java.util.Random;

public class TreasureTable {
	// private Random dice = new Random();
	Random dice = new Random();
	private int gold;
	int goldValue;
	String Item;
	int goldRoll = dice.nextInt(20);
	int treasureRoll = dice.nextInt(20);

	public int setGold(int i) {
		gold = goldRoll * i;
		return gold;
	}

	public void getGoldValue(int i) {
		switch (i) {

		}
	}

}
