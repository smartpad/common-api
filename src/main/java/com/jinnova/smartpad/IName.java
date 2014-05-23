package com.jinnova.smartpad;

import java.io.IOException;
import java.io.InputStream;

public interface IName {
	
	//String getName();
	
	//void setName(String name);
	
	String getDescription();
	
	void setDescription(String desc);
	
	String[] getImages(String imageId, int size);
	
	String getImage(String imageId, int size);
	
	void setImage(String imageId, InputStream image) throws IOException;
	
	//void setImages(String[] images);
	//void setImage(String imageId, InputStream image);

}
