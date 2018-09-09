package br.com.photoapi.model;

public class Photo {
	
	private String src;
	private String alt;
	
	public Photo(String url, String alt) {
		this.src = url;
		this.alt = alt;
	}
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String url) {
		this.src = url;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}

}
