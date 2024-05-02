package model;

public class DBTest {

	public static void main(String[] args) {
		BBSDAO dao=new BBSDAOImpl();
		//dao.list();
		dao.read(1);

	}

}
