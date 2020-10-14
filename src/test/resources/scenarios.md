TestWizardry Scenarios
======================

Apply to Hogwarts School of Witchcraft & Wizardry
-------------------------------------------------
- Create a player character

 - Tell your name
 - Specify gender -- wizard or witch (muggles not allowed)
 - Give you age (must be 11 years old to attend)

	player = new Person(name, gender, age)

- Apply to Hogwarts

	letter = Hogwarts.apply(player)

- Acceptance / Rejection

	if (letter == accepted)
		Hogwards.enroll(player)

- Off to Diagon alley

2. Purchase Supplies in Diagon Alley
 
* Gringott's Bank
* Ollivander's Wand Shop
* Eeyote's Owlry 
* Magical Menagerie
* Madam Malkin's Robes for all occasions
* Blott & Flourish
... etc

3. Catch the Hogwarts Express

* Kings Cross Station
* Platform 9 3/4
* Onboard the train
* Sweets
* Dementor (chance of encounter)

4. Great Hall
Welcome
Sorting Hat - Assign House

	sortingHat.