package com.imagebazar.main.vo;

public class Categories {
	
	private String imageId;
	private String imagePath;
	private String imageName;
	private String imageLink;
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	@Override
	public String toString() {
		return "Categories [imagePath=" + imagePath + ", imageName=" + imageName + ", imageLink=" + imageLink + "]";
	}
	
	
	

}
