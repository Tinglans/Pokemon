package Base;
import java.util.ArrayList;

public abstract class Pokemon {
	public int health;
	public String name;
	public int maxHealth;
	
	public enum Food {
		MEAT,
		GRASS,
		BERRY,
		CAKE
	}
	
	/**
	 * Pokemon constructor
	 * 
	 * @param nameFromConstructor name of pokemon
	 * @param maxHealth maximum health of pokemon
	 */
	public Pokemon(
			String nameFromConstructor, 
			int maxHealth) {
		name = nameFromConstructor;
		this.maxHealth = maxHealth;
		health = maxHealth;

	}
	
	/**
	 * The pokemon gains health
	 * @param health
	 */
	public void AddHealth(int health) {
		this.health = this.health + health;
		if (this.health > maxHealth) {
			this.health = maxHealth;
		}	
	}
	
	/**
	 * The pokemon loses health
	 * @param health
	 */
	public void RemoveHealth(int health) {
		this.health = this.health - health;
		if (this.health < 1) {
			this.health = 1;
		}
	}
	
	/**
	 * The pokemon rests. By resting it gains health. 
	 * It gains more health if it rests in it's pokéball.
	 * @param hours
	 * @param inPokeBall
	 */
	public void Rest(int hours, boolean inPokeBall) {
		if (inPokeBall) {
			health = health + hours * 5;
		}
		else {
			health = health + hours * 2;
		}
	}
	
	/**
	 * the pokemon eats food
	 * @param food
	 */
	public abstract void Eat(Food food);
	
	/**
	 * the pokemon takes damage
	 * @param damage
	 */
	public abstract void Damage(int damage);
	
	/**
	 * the pokemon attacks another pokemon
	 * @param pokemon
	 * @param attackName
	 */
	public abstract void Attack(Pokemon pokemon, String attackName);

//	äta
//	attackera
//	ta skada
//	vila
	
	

}
