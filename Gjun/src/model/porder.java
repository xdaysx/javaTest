package model;

public class porder {
	private Integer id;
	private String name;
	private int pro1;
	private int pro2;
	private int pro3;
	private int pro4;
	private int pro5;
	private int pro6;
	private int pro7;
	private int pro8;
	private int sum;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPro1() {
		return pro1;
	}
	public void setPro1(int pro1) {
		this.pro1 = pro1;
	}
	public int getPro2() {
		return pro2;
	}
	public void setPro2(int pro2) {
		this.pro2 = pro2;
	}
	public int getPro3() {
		return pro3;
	}
	public void setPro3(int pro3) {
		this.pro3 = pro3;
	}
	public int getPro4() {
		return pro4;
	}
	public void setPro4(int pro4) {
		this.pro4 = pro4;
	}
	public int getPro5() {
		return pro5;
	}
	public void setPro5(int pro5) {
		this.pro5 = pro5;
	}
	public int getPro6() {
		return pro6;
	}
	public void setPro6(int pro6) {
		this.pro6 = pro6;
	}
	public int getPro7() {
		return pro7;
	}
	public void setPro7(int pro7) {
		this.pro7 = pro7;
	}
	public int getPro8() {
		return pro8;
	}
	public void setPro8(int pro8) {
		this.pro8 = pro8;
	}
	public int getSum() {
		sum=pro1*160+pro2*70+pro3*90+pro4*130+pro5*1880+pro6*980+pro7*1080+pro8*520;
		return sum;
	}
	
}
