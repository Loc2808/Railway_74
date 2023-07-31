package loctran.DemoJDBC.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IManagerRespository {
	void getListManagerById (int id) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException;
}
