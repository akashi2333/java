package homework;

public class LONGTASK extends TASK{
	private String name;
	private String description;
	private boolean sign;
	private String date;         //½ØÖ¹ÈÕÆÚ
	public LONGTASK(String name,String description,boolean sign,String date) {
		this.name = name;
		this.description = description;
		this.sign = sign;
		this.date = date;
	}
	
	public LONGTASK() {}
	
	public void SetName(String name) {
		this.name = name;
	}
	public void SetDescription(String description) {
		this.description = description;
	}
	public void SetSign(boolean sign) {
		this.sign = sign;
	}
	public void SetDate(String date) {
		this.date = date;
	}
	
	public String GetName() {
		return name;
	}
	public String GetDescription() {
		return description;
	}
	public boolean GetSign() {
		return sign;
	}
	public String GetDate() {
		return date;
	}
}
