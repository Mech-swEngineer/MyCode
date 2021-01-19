//打印杨辉三角

public class yanghuiTriangle {
    public static void main(String[] args) {
        int[][] yangHui = new int[10][];
	for(int i=0;i<yangHui.length;i++){
		yangHui[i]= new int[i+1];
		//每行首末元素为1
		yangHui[i][0]=yangHui[i][i]=1;
		//可以不用判断i>1
		for(int j=1;j<yangHui[i].length-1;j++){
			yangHui[i][j]=yangHui[i-1][j]+yangHui[i-1][j-1];
		}
	}
	//遍历二维数组
	for(int i=0;i<yangHui.length;i++){
		for(int j=0;j<yangHui[i].length;j++){
			System.out.print(yangHui[i][j]+"  ");
		}
		//每行打印完换行
		System.out.println();	
	}
    }
}

//回行数

//数组的反转
public class reverseArray {
    	public static void main(String[] args) {
		String[] str= new String[]{"aa","dd","gg","hh","ll"};
		//方式1
		for(int i=0;i<str.length/2;i++){
			String temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		//方式2
		//for(int i=0,j=str.length-1;i<j;i++,j--){
			String temp=str[i];
			str[i]=str[j];
			str[j]=temp;	
		}
	}
}






