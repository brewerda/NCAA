public class Game {


	public static void main(String[] args) {
		//win(team1,team2,wp1,wp2);
		
	
}
	public Game(String[] values) {
		for (int i=0;i<values.length;i++) {
			 String team1 = values[i];
			 String team2 = values[i+3];
			 double wp1 = Double.parseDouble(values[i+2]);
			 double wp2 = Double.parseDouble(values[i+5]);

			//System.out.println(win(team1,team2,wp1,wp2));
			 System.out.println(team1);

			 win(team1,team2,wp1,wp2);
		}


	}


	public void win(String team1, String team2, double wp1, double wp2) {
		double top = (wp1 - (wp1 * wp2));
		double bottom = wp1 + wp2 - (2*wp1 * wp2);
		double win = top / bottom;

		System.out.println(win);
	}

}
