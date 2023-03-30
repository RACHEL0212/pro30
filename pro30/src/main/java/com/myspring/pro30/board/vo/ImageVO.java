package com.myspring.pro30.board.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("imageVO")
public class ImageVO {
	private int imageFileNO;
	private String imageFileName;
	private Date regDate;
	private int articleNO;
	
	public ImageVO() {
		
	}
	
	public void setImageFileNO(int imageFileNO) {
		this.imageFileNO = imageFileNO;
	}
	
	public int getImageFileNO() {
		return imageFileNO;
	}
	
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	
	public String getImageFileName() {
		return imageFileName;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public Date getRegdate() {
		return regDate;
	}
	
	public void setArticleNO(int articleNO) {
		this.articleNO = articleNO;
	}
	
	public int getArticleNO() {
		return articleNO;
	}
}
