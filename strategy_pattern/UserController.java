package strategy_pattern;

public class UserController {
	public UserStorage userStorage;
	public UserController(UserStorage userStorage) {
		this.userStorage = userStorage;
	}
	public void store() {
		this.userStorage.store(null);
	}

}
