public class NullPointException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			s.toString();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e+"s contains null value so .toString() method cannot be used");
		}
		finally {
			System.out.println("Code execution completed finally");
		}
	}

}
