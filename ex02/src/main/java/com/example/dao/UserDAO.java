package com.example.dao;
import java.util.*;
import domain.UserVO;

public interface UserDAO {
	
	
   public List<HashMap<String, Object>> list();
   public void insert(UserVO vo);
   

   
}