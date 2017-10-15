import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int v = 0;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		int F = Integer.parseInt(input.readLine());
		int[][] teams = new int[4][3];
		for (int[] row : teams)
			Arrays.fill(row, -1);
		int G = Integer.parseInt(input.readLine());
		for (int i = 0; i < G; i++) {
			String[] s = input.readLine().split(" ");
			if (Integer.parseInt(s[2]) > Integer.parseInt(s[3])) {
				teams[Integer.parseInt(s[0]) - 1][Integer.parseInt(s[1]) - 2] = 3;
				teams[Integer.parseInt(s[1]) - 1][Integer.parseInt(s[0]) - 1] = 0;
			} else if (Integer.parseInt(s[2]) < Integer.parseInt(s[3])) {
				teams[Integer.parseInt(s[0]) - 1][Integer.parseInt(s[1]) - 2] = 0;
				teams[Integer.parseInt(s[1]) - 1][Integer.parseInt(s[0]) - 1] = 3;
			} else {
				teams[Integer.parseInt(s[0]) - 1][Integer.parseInt(s[1]) - 2] = 1;
				teams[Integer.parseInt(s[1]) - 1][Integer.parseInt(s[0]) - 1] = 1;
			}
		}
		//System.out.println(Arrays.deepToString(teams));
		calc(teams, F);
		System.out.println(v);
	}

	public static void calc(int[][] a, int fav) {
		int[][] teams = new int[4][3];
		for (int i = 0; i < 4; i++)
			teams[i] = a[i].clone();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (teams[i][j] == -1) {
					teams[i][j] = 3;
					teams[j + 1][i] = 0;
					calc(teams, fav);
					teams[i][j] = 0;
					teams[j + 1][i] = 3;
					calc(teams, fav);
					teams[i][j] = 1;
					teams[j + 1][i] = 1;
					calc(teams, fav);
					return;
				}
			}
		}
		int a1 = teams[0][0] + teams[0][1] + teams[0][2];
		int a2 = teams[1][0] + teams[1][1] + teams[1][2];
		int a3 = teams[2][0] + teams[2][1] + teams[2][2];
		int a4 = teams[3][0] + teams[3][1] + teams[3][2];
		
		if (fav == 1 && a1 > a2 && a1 > a3 && a1 > a4)
			v++;
		else if (fav == 2 && a2 > a1 && a2 > a3 && a2 > a4)
			v++;
		else if (fav == 3 && a3 > a2 && a3 > a1 && a3 > a4)
			v++;
		else if (fav == 4 && a4 > a2 && a4 > a3 && a4 > a1)
			v++;
	}

}
