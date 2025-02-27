package Dao_Dto;

public class Customer_dto {
String item;
int quant;
public Customer_dto(String item, int quant) {
	this.item = item;
	this.quant = quant;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
}

}
