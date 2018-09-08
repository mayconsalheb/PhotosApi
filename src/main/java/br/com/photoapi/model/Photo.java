package br.com.photoapi.model;

public class Photo {
	
	private String url;
	private String alt;
	
	public Photo(String url, String alt) {
		this.url = url;
		this.alt = alt;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}

}
