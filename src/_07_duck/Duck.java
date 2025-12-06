package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}


public void quack() {
	System.out.println("the ducks favorite food is" + favoriteFood);
}
public void waddle() {
	System.out.println("the duck has" + numberOfFriends + " friends");
	
}
}
