class  College1{
	void Bubulu()throws ArithmeticException {
		System.out.println("  bubulu finding");
		//Thread.sleep(2000);
	}
	void guideteacher()throws InterruptedException{
		System.out.println(" guide teacher calling to bubulu ");
		Thread.sleep(2000);
		try{
		System.out.println(10/0);
		}catch(ArithmeticException ae){
		}
		Bubulu();
	}
	void hod()throws InterruptedException{
		System.out.println(" hod call to gt");
      guideteacher();
	}
	void princpal()throws InterruptedException{
		System.out.println("principal call to hod");
		hod();
	}
	void incharge()throws InterruptedException{
		System.out.println("incharge call to principal");
		princpal();
	}
	void reception() {
		System.out.println("reception call to incharge");
		try{
		 incharge();
		}catch(InterruptedException e){
			System.out.println("hiii");
		}finally{
			System.out.println("  hey user are you married");
		}
		

	}
	public static void main(String[] args) {
		College1 c=new College1();
		c.reception();
	}
}
