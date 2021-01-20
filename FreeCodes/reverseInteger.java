
class solution{
	public int reverse(int x){
		int rev = 0;
		while(x != 0){
			pop = x % 10;
			x /= 10;
			if((rev > Integer.MAX_VALUE / 10)||  //最大整数
				(rev == Integer.MAX_VALUE / 10 && pop > 7)){
				rerurn 0;
			}
			if((rev < Integer.MIN_VALUE / 10)||  //最小整数
				(rev == Integer.MIN_VALUE / 10 && pop < -8)){
				rerurn 0;
			}
			rev = rev * 10 + pop;
		}
		return rev;
	}
}

复杂度分析

时间复杂度：O(log(x))

空间复杂度：O(1)。
