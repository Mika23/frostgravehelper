package tables;

public class MagicWeaponsArmourTable {
	private String[] weaponsArmour = { "Hand Weapon (+1 Fight)", "Hand Weapon (+2 Fight)",
		"Hand Weapon (+2 Damage)", "Two-Handed Weapon (+1 Fight)", "Two-Handed Weapon (+1 Damage)",
		"Two-Handed Weapon (+2 Damage)", "Bow (+1 Shoot)", "Bow (+2 Damage)", "Crossbow (+1 Shoot)",
		"Crossbow (+2 Damage)", "Dagger (+1 Fight)", "Dagger (+1 Damage)", "Dagger (+2 Damage)",
		"Leather Armour (+1 Armour)", "Mail  Armour (+1 Armour)", "Rin gof Protection (+1 Armour)",
		"Cloak of Protection (+1 Armour)", "Staff (+1 Fight)", "Staff (+2 Damage)",
		"Shield (+1 Armour)" };

	public String getWeaponsArmour(int i) {
		return weaponsArmour[i];
	}
}
