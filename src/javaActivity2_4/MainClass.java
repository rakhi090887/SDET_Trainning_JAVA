package javaActivity2_4;

public class MainClass{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MainClass ma = new MainClass();
			ma.exceptionTest(" Will print to console");
			ma.exceptionTest(null);
			ma.exceptionTest(" won't execute");
		}catch(CustomException e) {
			System.out.println(" Inside catch block: "+e.getMessage());
		}
	}

	
	public  void exceptionTest(String messgae) throws CustomException{
		
		if(messgae ==  null) {
			throw new CustomException("Exception: String value is null");
			
		}else {
			System.out.println(messgae);
		}
	}
}
