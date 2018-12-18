package com.imagebazar.main.vo;

public class CategoryImage {
	
	private String imageId;
	private String imagePath;
	private String imageType;
	private String imageName;
	private String imageSize;
	private String imageResolution;
	private String imageContact;
	private String imageLink;
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageSize() {
		return imageSize;
	}
	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}
	public String getImageResolution() {
		return imageResolution;
	}
	public void setImageResolution(String imageResolution) {
		this.imageResolution = imageResolution;
	}
	public String getImageContact() {
		return imageContact;
	}
	public void setImageContact(String imageContact) {
		this.imageContact = imageContact;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	@Override
	public String toString() {
		return "CategoryImage [imageId=" + imageId + ", imagePath=" + imagePath + ", imageType=" + imageType
				+ ", imageName=" + imageName + ", imageSize=" + imageSize + ", imageResolution=" + imageResolution
				+ ", imageContact=" + imageContact + ", imageLink=" + imageLink + "]";
	}
	

}
