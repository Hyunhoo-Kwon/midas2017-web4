package com.midas.websolution.menu.dao;

import java.util.List;

import com.midas.websolution.menu.vo.FoodSetVO;
import com.midas.websolution.menu.vo.FoodVO;
import com.midas.websolution.menu.vo.MenuLikeRequestVO;
import com.midas.websolution.menu.vo.MenuLogVO;
import com.midas.websolution.menu.vo.MenuMainRequestVO;
import com.midas.websolution.menu.vo.MenuResultVO;
import com.midas.websolution.menu.vo.MenuVO;

public interface MenuDao {
	
	public static final String MD = "MenuDao";
	public MenuVO selectById(String menu_number);
	public List<MenuMainRequestVO> getOneWeekMenu(int menu_kind);
	public List<MenuLogVO> selectByUserNumber(int user_number);
	public List<MenuLogVO> selectLogAll();
	public List<MenuMainRequestVO>  getTodayMenu();
	public int insertOneMenu(MenuVO menuVO);
	public int updateOneFood(FoodVO foodVO);

	public int insertLike(MenuLikeRequestVO menuLikeRequestVO);
	public MenuLikeRequestVO checkLike(MenuLikeRequestVO menuLikeRequestVO);
	
	public int insertOneFoodSet(FoodSetVO foodSetVO);
	public int getFoodNoByFoodName(String food_name);
	public List<MenuResultVO> getMenuList();
	public void deleteFoodSetByMenuNo(int menu_no);
	public void deleteMenuByMenuNo(int menu_no);
	public MenuResultVO getOneMenu(int menu_no);
	public int updateOneMenu(MenuVO menuVO);
	
}
