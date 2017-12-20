package com.demo.test;

import java.util.List;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "profile")
public class Book {
	

	
	@Id
    @Field
    private String id;

    @Field
    private String name;
    
    @Field
    private String description;
    
    @Field("categories_txt")
    private List<Category> categories;

    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String title) {
		this.name = title;
	}
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", description=" + description + ", title=" + name + "]";
	}
}