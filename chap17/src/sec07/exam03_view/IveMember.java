package sec07.exam03_view;

import javafx.beans.property.*;

public class IveMember {
	private SimpleStringProperty iveMember;
	private SimpleStringProperty image;
	
	public IveMember() {
		this.iveMember = new SimpleStringProperty();
		this.image = new SimpleStringProperty();
	}
	
	public IveMember(String iveMember, String image) {
		this.iveMember = new SimpleStringProperty(iveMember);
		this.image = new SimpleStringProperty(image);
	}

	public String getIveMember() {
		return iveMember.get();
	}
	
	public void setIveMember(String iveMember) {
		this.iveMember.set(iveMember);
	}
	
	public String getImage() {
		return image.get();
	}
	
	public void setImage(String image) {
		this.image.set(image);
	}
}
