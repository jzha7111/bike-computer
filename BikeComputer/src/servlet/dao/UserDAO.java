package servlet.dao;

import servlet.vo.User;

public interface UserDAO {
	public int queryByUsername(User user) throws Exception;//query the user names in database
	public int insertUserinfo(User user) throws Exception;//insert the new user into database
	public int checkRename(User user) throws Exception;//check the user name whether in database
	public User queryInfo(User user) throws Exception;
}
