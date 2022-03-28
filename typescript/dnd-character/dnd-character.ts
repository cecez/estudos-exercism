function rollTheDice() {
    return Math.floor(Math.random() * 6) + 1;
}

// type AbilityScore = 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18;

export class DnDCharacter {
  charisma: number;
  constitution: number;
  dexterity: number;
  hitpoints: number;
  intelligence: number;
  strength: number;
  wisdom: number;

  constructor() {
    this.charisma = DnDCharacter.generateAbilityScore()
    this.constitution = DnDCharacter.generateAbilityScore()
    this.dexterity = DnDCharacter.generateAbilityScore()
    this.intelligence = DnDCharacter.generateAbilityScore()
    this.strength = DnDCharacter.generateAbilityScore()
    this.wisdom = DnDCharacter.generateAbilityScore()

    this.hitpoints = 10 + DnDCharacter.getModifierFor(this.constitution)
  }


  public static generateAbilityScore(): number {
    const dices: number[] = [rollTheDice(), rollTheDice(), rollTheDice(), rollTheDice()];
    dices.sort();
    const a = dices.splice(1);
    return a.reduce((a, b) => a + b, 0);
  }

  public static getModifierFor(abilityValue: number): number {
    return Math.floor((abilityValue - 10) / 2);
  }

}
