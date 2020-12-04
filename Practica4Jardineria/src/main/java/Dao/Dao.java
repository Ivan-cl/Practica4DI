package Dao;

import java.util.*;

public interface Dao{
	public String insert(Object obj);
	public String delete(Object obj); 
	public String update(Object obj);
	public List<?> read(); 
	public List<?> filter(String field, String searchCriteria);
}