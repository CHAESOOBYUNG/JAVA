package quiz23;

public class Data {

	private String region; //지역
	private String size; //규모구분
	private String year; //년도
	private String month; //월
	private String price; //가격
	
	public Data() {
		
	}

	
	
	
	
	public Data(String region, String size, String year, String month, String price) {
		super();
		this.region = region;
		this.size = size;
		this.year = year;
		this.month = month;
		this.price = price;
	}





	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}





	@Override
	public String toString() {
		return "Data [region=" + region + ", size=" + size + ", year=" + year + ", month=" + month + ", price=" + price
				+ "]";
	}
	 
	
	
	
}
