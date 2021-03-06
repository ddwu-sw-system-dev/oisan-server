package com.example.oisan.controller;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class PostCommand {

    private int postId;
    private int customerId;
    private String title;
    private String desc;
    private MultipartFile image;
    private int width;
    private int height;
    private int depth;
    private int categId;
    private List<String> tagList;
    private int price;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getCategId() {
        return categId;
    }

    public void setCategId(int categId) {
        this.categId = categId;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PostCommand [postId=" + postId + ", customerId=" + customerId + ", title=" + title + ", desc=" + desc
				+ ", image=" + image + ", width=" + width + ", height=" + height + ", depth=" + depth + ", categId="
				+ categId + ", tagList=" + tagList + ", price=" + price + "]";
	}
	

}
