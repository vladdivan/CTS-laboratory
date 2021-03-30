package ro.ase.csie.cts.lab5.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		DbConnection dbConn1 = DbConnection.getConnection("127.0.0.1",
				"localDB");
		DbConnection dbConn2 = DbConnection.getConnection("127.0.0.1",
				"localDB");
		DbConnection dbConn3 = DbConnection.getConnection("127.0.0.1",
				"localDB");
		
		if(dbConn1 == dbConn2) {
			System.out.println("Same.");
		}
		
		if(dbConn1 != dbConn3) {
			System.out.println("Different.");
		}
	}

}
