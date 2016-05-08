package vn.taibt.bean;

public class PostCategory {
	private Integer postCategoryId;
	private String postCategoryName;

	public PostCategory() {

	}

	public PostCategory(Integer postCategoryId, String postCategoryName) {
		this.postCategoryId = postCategoryId;
		this.postCategoryName = postCategoryName;
	}

	public Integer getPostCategoryId() {
		return postCategoryId;
	}

	public void setPostCategoryId(Integer postCategoryId) {
		this.postCategoryId = postCategoryId;
	}

	public String getPostCategoryName() {
		return postCategoryName;
	}

	public void setPostCategoryName(String postCategoryName) {
		this.postCategoryName = postCategoryName;
	}

}
