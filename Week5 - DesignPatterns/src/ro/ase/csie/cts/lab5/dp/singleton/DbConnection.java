package ro.ase.csie.cts.lab5.dp.singleton;

public class DbConnection {
	String socket;
	String schema;
	
	//private static DbConnection dbConnection = new DbConnection();
	private static DbConnection dbConnection = null;
	
	//class static initializer
	//executed only once when the class is loaded
	static {
		System.out.println("Initializing DB connection string!");
	}
	
	//constructor initializer
	//executed before each constructor call
	{
		System.out.println("Loading DB connection string!");
	}
	
	public DbConnection() {
		System.out.println("Creating a DB connection!");
		
		//access a local settings file to get credentials
	}

	private DbConnection(String socket, String schema) {
		this.socket = socket;
		this.schema = schema;
	}
	
	//method to return the reference to the unique object
	public static DbConnection getDbConnection() {
		if(DbConnection.dbConnection == null) {			
			//can get values from files
			dbConnection = new DbConnection();
		}
		return DbConnection.dbConnection;
	}
	
	
}
