package strategy_pattern;

public class MySQLStorage implements UserStorage {

	@Override
	public void store(User user) {
		System.out.println("save with mysql");

	}

}
