package zifuchuan;
import java.util.Scanner;
public class zifuchuanDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入古诗：");
		String line = sc.nextLine();
        String result = "";
		
		char[] chs = line.toCharArray();
			for (int x = 0; x<= chs.length - 1; x++) {
				result += chs[x];
			}
		for (int i = 0; i<= chs.length - 1; i++) {
			int j=(i+1)/7;
			System.out.print(chs[i]);
			if((i+1)%7==0) {
				if(j % 2==1)
					System.out.print("，");
				if(j % 2==0)
					System.out.println("。");
			}
		}
		System.out.println("输入要查找的字符");
		String in=sc.next();
		int count=0;
		
		for(int a=0;a<line.length();a++) {
			char c=in.charAt(0);
			if (c==chs[a]) {
			    count++;
			   }
		}
		 System.out.println("古诗中出现"+count+"次");
		 System.out.println("本次程序结束");

	}

}
