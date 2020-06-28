package homework;

public class TEMPTASK extends TASK{
	private String name;
	private String description;
	private boolean sign;
	private boolean flag1;
	private String date;       //½ØÖ¹ÈÕÆÚ
	public TEMPTASK(String name,String description,boolean sign,String date) {
		this.name = name;
		this.description = description;
		this.sign = sign;
		this.date = date;
	}
	
	public TEMPTASK() {}
	
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
	public void SetFlag1(boolean flag1) {
		this.flag1 = flag1;
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
	public boolean GetFlag1() {
		return flag1;
	}
}
