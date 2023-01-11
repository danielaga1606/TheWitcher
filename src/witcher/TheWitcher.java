package witcher;

public class TheWitcher {
private String name;
private int health;
private boolean hasSould;
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
public boolean isHasSould() {
	return hasSould;
}
public void setHasSould(boolean hassSould) {
	this.hasSould = hassSould;
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
		wizard.setHealth(8);
		wizard.setHasSould(true);
  if (wizard.isDeath()== true) {
	  System.out.println(wizard.getName()+" está muerto");
  }
  else {
	  System.out.println(wizard.getName()+" está vivo");
  }
		
		
	}

}
