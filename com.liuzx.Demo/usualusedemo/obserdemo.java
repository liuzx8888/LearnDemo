package usualusedemo;

import java.util.Observable;
import java.util.Observer;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

/*
 * 
 *观察者模式 
 */
public class obserdemo extends Observable {
   private String price;

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	super.setChanged();   /*设置观察点*/
	super.notifyObservers(price);
	this.price = price;
}

public obserdemo(String price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "obserdemo [price=" + price + "]";
}
   
	
}
