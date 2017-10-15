import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		int[][] stops = new int[N][3];
		String[] temp = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			
			stops[i][0] = Integer.parseInt(temp[i]); // val at city
			stops[i][1] = 1000000; // least distance
			stops[i][2] = stops[i][0]; // best total value
		}
		int R = Integer.parseInt(in.readLine());
		int[][] roads = new int[R][3];
		for (int i = 0; i < R; i++) {
			String[] t = in.readLine().split(" ");
			roads[i][0] = Integer.parseInt(t[0]) - 1;
			roads[i][1] = Integer.parseInt(t[1])  - 1;
			roads[i][2] = Integer.parseInt(t[2]) ; // distance
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(N - 1);
		stops[N - 1][1] = 0;
		while (!q.isEmpty()) {
			int cur = q.remove();
			if(stops[cur][1] >= stops[0][1]){
				continue;
			}
//			System.out.println(cur + 1);
//			for (int i = 0; i < N; i++) {
//				System.out.println((i + 1) + ": " + stops[i][0] + " || " + stops[i][1] + " || " + stops[i][2] + " || ");
//			}
			for (int i = 0; i < R; i++) {
				if (roads[i][0] == cur) {
					if (stops[cur][1] + roads[i][2] == stops[roads[i][1]][1]) {
						stops[roads[i][1]][1] = stops[cur][1] + roads[i][2];
						stops[roads[i][1]][2] = Math.max(stops[cur][2] + stops[roads[i][1]][0], stops[roads[i][1]][2]);
						q.add(roads[i][1]);
					}
					else if (stops[cur][1] + roads[i][2] < stops[roads[i][1]][1]) {
						stops[roads[i][1]][1] = stops[cur][1] + roads[i][2];
						stops[roads[i][1]][2] =stops[cur][2] + stops[roads[i][1]][0];
						q.add(roads[i][1]);
					}
				} else if (roads[i][1] == cur) {
					if (stops[cur][1] + roads[i][2] == stops[roads[i][0]][1]) {
						stops[roads[i][0]][1] = stops[cur][1] + roads[i][2];
						stops[roads[i][0]][2] = Math.max(stops[cur][2] + stops[roads[i][0]][0], stops[roads[i][0]][2]);
						q.add(roads[i][0]);
					}
					else if (stops[cur][1] + roads[i][2] < stops[roads[i][0]][1]) {
						stops[roads[i][0]][1] = stops[cur][1] + roads[i][2];
						stops[roads[i][0]][2] =stops[cur][2] + stops[roads[i][0]][0];
						q.add(roads[i][0]);
					}
				}
			}
		}
//		for (int i = 0; i < N; i++) {
//			System.out.println((i + 1) + ": " + stops[i][0] + " || " + stops[i][1] + " || " + stops[i][2] + " || ");
//		}
		if (stops[0][1] != 1000000) {
			System.out.println(stops[0][1] + " " + stops[0][2]);
		} else {
			System.out.println("impossible");
		}
	}

}
