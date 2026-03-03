package com.hibernate.spring_beans;
import lombok.Data;
@Data
public class Car {

		private int carId;
		private String brand;
		private String model;
		private String colour;
		private String price;
		
		public int getCarId() {
			return carId;
		}

		public void setCarId(int carId) {
			this.carId = carId;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public  Car() {
	      		System.out.println("");
	}

}
