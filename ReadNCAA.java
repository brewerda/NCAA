import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadNCAA {



	public static void main(String[] args)  throws FileNotFoundException {
		Scanner reader = new Scanner(new File("ncaa2014.csv"));

		while (reader.hasNextLine()) {
			String next = reader.nextLine();
			String[] values = next.split(",");

			//for (String s : values) {
				//System.out.print(s + " ");
			//}
			
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> seeds = new ArrayList<Integer>();
			ArrayList<Double> winp = new ArrayList<Double>();


			for (int i=0, j=0; i<values.length; i++, j++) {
				if(j==0) {
					String name = values[i];
					System.out.println(name + " ");
					names.add(name);
				} else if(j==1) {
					int seed = Integer.parseInt(values[i]);
					System.out.println(seed);
					seeds.add(seed);	
				} else if(j==2) {
					double wp = Double.parseDouble(values[i]);
					System.out.println(wp);
					winp.add(wp);
				}
				j=1;
			}
			for (int i=0,j=0; i<values.length; i++,j++ ) {
				ArrayList<Team> teams = new ArrayList<Team>();

				Team team = new Team(values[i], Integer.parseInt(values[i+1]), Double.parseDouble(values[i+2]));

				teams.add(team);

			}
			System.out.println();
		}
		
	}

}