package homework;

public class TASK {
	private String name;
	private String description;
	private boolean sign;
	private boolean flag1;
	public TASK(String name,String description,boolean sign) {
		this.name = name;
		this.description = description;
		this.sign = sign;
	}
	
	public TASK() {}
	
	public void SetName(String name) {
		this.name = name;
	}
	public void SetDescription(String description) {
		this.description = description;
	}
	public void SetSign(boolean sign) {
		this.sign = sign;
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
	public boolean GetFlag1() {
		return flag1;
	}
}