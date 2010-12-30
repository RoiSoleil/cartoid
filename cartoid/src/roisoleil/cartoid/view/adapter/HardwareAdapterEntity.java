package roisoleil.cartoid.view.adapter;

import java.util.Map;

public class HardwareAdapterEntity {
	private int image;
	private String constructor;
	private String price;
	private Map<String, String> attributes;

	public HardwareAdapterEntity() {
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
}
