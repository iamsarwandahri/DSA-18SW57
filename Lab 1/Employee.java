class Employee{
	public static int s,h;
	public static void getInfo(int t,int u){
		s = t;
		h = u;
		System.out.println("Sallery = " +s+"$ Number of Hours of Weeks "+h);
	}
	public static void addSallery(){
		if(s>=500){
		 s = s+10;
		 System.out.println("Sallery= "+s+"$");	}
	}
	public static void addWorkHourBonus(){
		if (h>=5){
			s=s+5;
			System.out.println("Sallery= "+s+"$");	
	}
}
		public static void main(String[]args){
			getInfo(600,7);
			addSallery();
			addWorkHourBonus();

		}
}