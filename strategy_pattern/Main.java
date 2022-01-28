package strategy_pattern;

public class Main {
	public static void main(String[] args) {
		XMLStorage xmlStorage=new XMLStorage();
		MySQLStorage mySQLStorage=new MySQLStorage();
		UserController userController=new UserController(mySQLStorage);
		userController.store();
	}

}
