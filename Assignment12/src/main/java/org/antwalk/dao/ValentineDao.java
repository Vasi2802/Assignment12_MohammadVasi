package org.antwalk.dao;
import java.util.List;
import javax.sql.DataSource;
import org.antwalk.model.Valentine;

public interface ValentineDao {
	public void setDataSource(DataSource ds);
	public void create(String day,String gift,String location);
	public List<Valentine> listValentine();
}
