package people;

import java.util.Scanner;

public class Umpire {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gusser g = new Gusser();
		System.out.println("Gusser, what is your name?");
		g.setName(sc.nextLine());
		System.out.println(g.getName()+", what is the number?");
		g.setNum(sc.nextInt());
		
		System.out.println("How many players are there?");
		int count = sc.nextInt();
		
		Player[] p = new Player[count];
		String name;
		int number;
		for(int i=0; i<p.length; i++){
			System.out.println("Player "+(i+1)+" what is your name?");
			sc.nextLine();
			name=(sc.nextLine());
			System.out.println("Player "+(i+1)+" what is the number?");
			number=(sc.nextInt());
			p[i] = new Player(name, number);
			
		}
		int flag = 0;
		for(Player j : p){
			if(j.getNum()==g.getNum()){
				System.out.println(j.getName()+" is the winner");
				flag++;
			}
		}
		if(flag==0)
			System.out.println("There is no winner");
	}

}
