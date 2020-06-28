package homework;

public class CYCLETASK extends TASK{
	private String name;
	private String description;
	private boolean sign;
	private boolean flag1;
	private String date;
	private String n;        //重复次数
	private String days;            //重复周期
	public CYCLETASK(String name,String description,boolean sign,String date,String n,String days) {
		this.name = name;
		this.description = description;
		this.sign = sign;
		this.date = date;
		this.n = n;
		this.days = days;
	}
	
	public CYCLETASK() {}
	
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
	public void SetN(String n) {
		this.n = n;
	}
	public void SetDays(String days) {
		this.days = days;
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
	public String GetN() {
		return n;
	}
	public String GetDays() {
		return days;
	}
	public boolean GetFlag1() {
		return flag1;
	}
}
