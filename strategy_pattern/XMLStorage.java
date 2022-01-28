package strategy_pattern;

public class XMLStorage implements UserStorage {

	@Override
	public void store(User user) {
		System.out.println("save with xml");
		
	}

}
