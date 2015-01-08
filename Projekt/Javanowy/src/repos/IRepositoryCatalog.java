package repos;

import Store.*;

public interface IRepositoryCatalog {
	
public IUserRepository getUsers();
public IRepository<Person> getPersons();
public IRepository<Role> getRoles();


}
