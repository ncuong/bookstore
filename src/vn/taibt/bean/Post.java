package vn.taibt.bean;

import java.sql.Date;


public class Post {
	private Integer postId;
	private String postTitle;
	private String postSortContent;
	private String postContent;
	private Date dateModified;
	private PostCategory postCategory;

	public Post() {

	}

	public Post(Integer postId, String postTitle, String postSortContent, String postContent,
			Date dateModified, PostCategory postCategory) {
		super();
		this.postId = postId;
		this.postTitle = postTitle;
		this.postSortContent = postContent;
		this.postContent = postContent;
		this.dateModified = dateModified;
		this.postCategory = postCategory;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostSortContent() {
		return postSortContent;
	}

	public void setPostSortContent(String postSortContent) {
		this.postSortContent = postSortContent;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public PostCategory getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(PostCategory postCategory) {
		this.postCategory = postCategory;
	}

}
