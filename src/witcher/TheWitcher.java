package witcher;

public class TheWitcher {
private String name;
private int health;
private boolean hasSould;
private boolean hassSould;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public boolean isHassSould() {
	return hassSould;
}
public void setHassSould(boolean hassSould) {
	this.hassSould = hassSould;
}



public boolean isDeath() {
	if (health==0) {
		return true;
	}
	else if(!hasSould) {
		return true; 
	}
	else {
		return false;
	}
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheWitcher wizard = new TheWitcher();
		wizard.setName("Merlin");
		wizard.setHealth(15);
		wizard.setHassSould(true);
  if (wizard.isDeath()== true) {
	  System.out.println(wizard.getName()+" está muerto");
  }
  else {
	  System.out.println(wizard.getName()+" está vivo");
  }
		
		
	}

}
