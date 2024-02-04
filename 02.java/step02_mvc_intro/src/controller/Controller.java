package controller;

import model.Model;

public class Controller {
	// 1. view에서 전달 받은 것 -> model로 전달
	
	public static String transferResult (String keyword) {
		return Model.search(keyword);
	}
	
	// 2. model에서 받은 결과값 -> view로 전달
}
