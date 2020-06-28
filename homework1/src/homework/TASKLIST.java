package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TASKLIST {
	private String name;
	private String kind;
	private int i;
	private ArrayList<TASK> tasks;
	public TASKLIST(String name,String kind,int i,ArrayList<TASK> tasks) {
		this.name = name;
		this.kind = kind;
		this.i = i;
		this.tasks = tasks;
	}
		
	public TASKLIST() {}
		
	public void SetName(String name) {
		this.name = name;
	}
	public void SetKind(String kind) {
		this.kind = kind;
	}
	public void SetI(int i) {
		this.i = i;
	}
	public void SetTasks(ArrayList<TASK> tasks) {
		this.tasks = tasks;
	}
		
	public String GetName() {
		return name;
	}
	public String GetKind() {
		return kind;
	}
	public int GetI() {
		return i;
	}
	public ArrayList<TASK> GetTasks() {
		return tasks;
	}
}
