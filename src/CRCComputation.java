public class CRCComputation{
	
	public static void main(String args[]){
		int code = Integer.parseInt(args[0]);
		int crc = crc(code, 18, 359, 9);
		System.out.println(code + "->" + crc);
	}
	
	public static int crc(long n, int i, final int n2, final int n3) {
		final long n4 = n2;
		n <<= 64 - i;
		long n5;
        for (--i; i >= 0; --i) {
			n5 = n;
			if ((n & 1L << 63) != 0x0L) {
				n5 = (n ^ n4 << 64 - n3);
			}
			n = n5 << 1;
        }
        return (int)(n >>> 64 - n3 + 1);
	}
    
}
