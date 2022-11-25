package com.ho.last.main;


// bhc 02-123-4567 후라이드 치킨 17000
// 
public class HomeController {
	public static void main(String[] args) {
		BaeminDAO.getBda().setAllMenuCount();
		ConsoleScreen cs = new ConsoleScreen();
		int menu = 0;
		while (true) {
			menu = cs.printList();
			
			if(menu == 10) {
				break;
			} else if (menu == 1) {
				cs.printResult(BaeminDAO.getBda().regShop(cs.getInfo()));
			} else if (menu == 2) {
				cs.printResult(BaeminDAO.getBda().showShop());
				cs.printResult(BaeminDAO.getBda().regMenu(cs.getMInfo()));
			} else if (menu == 3) {
				cs.printResult(BaeminDAO.getBda().showShop());
			} else if (menu == 4) {
				cs.printResult(BaeminDAO.getBda().showMenu());
			} else if (menu == 5) {
				cs.printResult(BaeminDAO.getBda().getPageCount());
				cs.print(BaeminDAO.getBda().showPageMenu(cs.getPageNum()));
			}
		}
		
		
		cs.closeCs();
	}
}
