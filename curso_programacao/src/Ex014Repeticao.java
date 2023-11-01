import java.util.*;
public class Ex014Repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num0e100 = 0;
		int num101e200 = 0;
		for(int i = 1; i <=20; i++) {
			int valor = sc.nextInt();
			if(valor>=0 && valor <=100) {
				num0e100++;
			}else if(valor>=101 && valor <=200) {
				num101e200++;
			}
		}
		sc.close();
		System.out.printf("%d números entre 0 e 100 %n%d números entre 101 e 200.", num0e100, num101e200);
	}

}
