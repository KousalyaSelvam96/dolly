package kousi.datatypes;

public class Byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ab;
		ab=10;
		System.out.println(ab++);
		System.out.println(++ab);
		System.out.println(ab--);
		System.out.println(--ab);

		byte a = 126;

        // byte is 8 bit value
        System.out.println(a+"\n");

        a++;
        System.out.println(a+"\n");

        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a+"\n");

        // Looping back within the range
        a++;
        System.out.println(a+"\n");
    }
		

            }
	
	


