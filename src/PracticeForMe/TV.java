package PracticeForMe;

public class TV {

	String Name;
	int size;
	void Play() {
		System.out.println("the Tv can Play viodos ");
		
	}
	public static void main(String[] args) {
		TV tv=new TV();
		tv.Name="Sumsung";
		tv.size=55;
		tv.Play();
		System.out.println(tv.Name+" "+tv.size);
		

	}

}
