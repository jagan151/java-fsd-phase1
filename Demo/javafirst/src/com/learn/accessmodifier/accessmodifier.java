package com.learn.accessmodifier;

public class accessmodifier {
	public void methodPublic() {
	System.out.println("this metod is public");
	}
	private void methodPrivate() {
		System.out.println("this method is private");
	}
	
	void methodDefault() {
		System.out.println("this method is default");
	}
	
	protected void methodProtected() {
		System.out.println("this method is protected");
	}

public static void main(String[] args) {
	accessmodifier obj = new accessmodifier();
	obj.methodPublic();
	obj.methodPrivate();
	obj.methodDefault();
	obj.methodProtected();
	
	}
}