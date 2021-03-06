package java20190425;

import java.util.HashSet;
import java.util.Set;

public class Java20190425_1 {

	public static void main(String[] args) {
	//	Set<Integer> lotto = new HashSet<>();
	
//		for(int i = 0; lotto.size() < 6; i++) {
//			int ran =(int)(Math.random()*45)+1;
//			lotto.add(ran);
//		}
//		for(int s : lotto ) {
//			System.out.print(s+" ");
	//	}
		
		LottoCustomer customer = new LottoCustomer("����", "12121-21212");
		customer.showNumber();
		
		customer = new LottoCustomer("����2", "12121-21212");
		customer.showNumber();
		
		customer = new LottoCustomer("����3", "12121-21212");
		customer.showNumber();
	}

}


class LottoCustomer{
	
	String name, phone;
	Set<Integer> lotto = new HashSet<Integer>();
	
	LottoCustomer(String name, String phone){
		this.name = name;
		this.phone = phone;
		setLotto();
	}
	
	private void setLotto() {
	while(lotto.size()<6) {
		int random = (int)(Math.random()*45+1);
		lotto.add(random);
	}
	}
	
	public void showNumber() {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(lotto);
	}
}