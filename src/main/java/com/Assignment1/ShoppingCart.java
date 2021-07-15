package com.Assignment1;

public class ShoppingCart {

	private int shopping_id;
	private Item item;
	public int getShopping_id() {
		return shopping_id;
	}
	public void setShopping_id(int shopping_id) {
		this.shopping_id = shopping_id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "ShoppingCart [shopping_id=" + shopping_id + ", item=" + item + "]";
	}
	
}
