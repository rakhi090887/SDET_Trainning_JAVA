package javaActivity2_1;

public class MyBook extends Book{

	public void setTitle(String s) {
		title=s;
	}
	
	public static void main(String[] args) {
		MyBook newNovel = new MyBook();
		newNovel.setTitle("title");
		System.out.println("The Title is "+newNovel.title);
	}

}
