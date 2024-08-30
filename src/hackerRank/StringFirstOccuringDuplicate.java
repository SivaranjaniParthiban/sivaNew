package hackerRank;

public class StringFirstOccuringDuplicate {

	public static void main(String[] args) {
		String note ="java";
		String lowerNote=note.toLowerCase();
//	String array[] = lowerNote.split(" ");
	for(int i=0;i<lowerNote.length();i++) {
	char hjh=lowerNote.charAt(i);
		int firstString=lowerNote.indexOf(hjh);
		int lastString=lowerNote.lastIndexOf(hjh);
		if(firstString!=lastString) {
			System.out.println(hjh);
			break;
		}
		
		
	}

	}

}
