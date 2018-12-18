package com.imagebazar.main.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import com.imagebazar.main.vo.Categories;
import com.imagebazar.main.vo.CategoryImage;
@CrossOrigin(value="http://localhost:4200")
@RestController
public class ImageBazarRestController {
	@RequestMapping(value = "/getcategories")
	   public List<Categories> getcategories() {
	      return loadCategories();
	   }
	
	@RequestMapping(method = RequestMethod.GET , value = "/getcategoryimages/{categoryid}")
	   public List<CategoryImage> getcategoryimagesById() {
	      return loadCategoryImage();
	   }
	@RequestMapping(method = RequestMethod.GET ,value = "/getimagedetails/{imageid}")
	   public List<CategoryImage> getCategoryImagesbyIdDEtails() {
	      return loadCategoryImage();
	   }
	@RequestMapping(method = RequestMethod.GET ,value = "/getcontactdetails/{imageid}")
	   public CategoryImage getcontactdetails() {
		System.out.println("Get Method getcontactdetails");
		CategoryImage categoryImage =new CategoryImage();
		categoryImage.setImageId("3");
		categoryImage.setImagePath("Sandwich");
		categoryImage.setImageName("Sandwich");
		categoryImage.setImageContact("KFC");
	      return categoryImage;
	   }
	@RequestMapping(method = RequestMethod.POST, value = "/addtocart")
	   public String addtocart() {
		System.out.println("Post Method addtocart");
	      return "Order successfully placed";
	   }
	private List<Categories> loadCategories()
	{
		List<Categories> listOfCategories = new ArrayList<Categories>();
		Categories categories =new Categories();
		categories.setImageId("1");
		categories.setImagePath("BeautyFashion");
		categories.setImageName("Beauty & Fashion");
		listOfCategories.add(categories);
		categories =new Categories();
		categories.setImageId("2");
		categories.setImagePath("FoodDrink");
		categories.setImageName("Food & Drink");
		listOfCategories.add(categories);
		categories =new Categories();
		categories.setImageId("3");
		categories.setImagePath("HealthFitness");
		categories.setImageName("Health & Fitness");
		listOfCategories.add(categories);
		categories =new Categories();
		categories.setImageId("4");
		categories.setImagePath("Lifestyle");
		categories.setImageName("Lifestyle");
		listOfCategories.add(categories);
		return listOfCategories;
	}
	private List<CategoryImage> loadCategoryImage()
	{
		List<CategoryImage> listOfCategoryImage = new ArrayList<CategoryImage>();
		CategoryImage categoryImage =new CategoryImage();
		categoryImage.setImageId("1");
		categoryImage.setImagePath("Pizza");
		categoryImage.setImageName("Pizza");
		categoryImage.setImageContact("Dominos");
		listOfCategoryImage.add(categoryImage);
		categoryImage =new CategoryImage();
		categoryImage.setImageId("2");
		categoryImage.setImagePath("Burger");
		categoryImage.setImageName("Burger");
		categoryImage.setImageContact("BurgerKing");
		listOfCategoryImage.add(categoryImage);
		categoryImage =new CategoryImage();
		categoryImage.setImageId("3");
		categoryImage.setImagePath("Sandwich");
		categoryImage.setImageName("Sandwich");
		categoryImage.setImageContact("KFC");
		listOfCategoryImage.add(categoryImage);

		return listOfCategoryImage;
	}
	
	private void testing()
	{
		 RConnection connection = null;

	        try {
	            /* Create a connection to Rserve instance running on default port
	             * 6311
	             */
	            connection = new RConnection();

	            /* Note four slashes (\\\\) in the path */
	          //  connection.eval("source('E:\\\\MyScript.R')");
	            connection.eval("source('E:/MyScript.R')");
	            int num1=10;
	            int num2=20;
	            int sum=connection.eval("myAdd("+num1+","+num2+")").asInteger();
	            System.out.println("The sum is=" + sum);
	            connection.eval("source('E:/MyScript2.R')");
	            int data = connection.eval("myAdd()").asInteger();
	            System.out.println("The data is=" + data);
	        } catch (RserveException e) {
	            e.printStackTrace();
	        } catch (REXPMismatchException e) {
	            e.printStackTrace();
	        }
	}
	
	public static void main(String args[])
	{
		ImageBazarRestController imageBazarRestController= new ImageBazarRestController();
		imageBazarRestController.testing();
	}

}
