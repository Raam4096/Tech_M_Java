package Dao_Dto;

public class Owner_dto {
  
	String item;
	int price;
	public Owner_dto(String item,int price) {
		this.item=item;
		this.price=price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
