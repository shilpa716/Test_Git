
public class Convert_Upper2Lower {

	public static void main(String[] args) {
		String s = "Women";
		int size = s.length();
		String sub_women = s.substring(1, size);
		String beginning_letter = s.substring(0,1);
		System.out.println(beginning_letter);
		System.out.println("SubString of women: "+sub_women);
		
		sub_women = sub_women.toUpperCase();
		System.out.println(sub_women);
		s = beginning_letter.concat(sub_women);
		System.out.println("Full String: "+s );

	}

}
