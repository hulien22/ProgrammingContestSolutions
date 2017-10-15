import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(input.readLine());
		o:
		for (int a=0;a<t;a++){
			String[] read = input.readLine().split(" ");
			int w = Integer.parseInt(read[0]);
			int h = Integer.parseInt(read[1]);
			char[][] floor = new char[h][w];
			int[] c = new int[3];
			for(int i=0;i<h;i++){
				for (int j=0;j<w;j++){
					floor[i][j]= (char) input.read();
					if(floor[i][j]=='C'){
						c[0] = i;
						c[1] = j;
						c[2] = 0;
					}
						
				}
				input.read();
			}
			Stack<int[]> q = new Stack<int[]>();
			q.push(c);
			while(!q.isEmpty()){
				int[] cur = q.lastElement();
				q.remove(q.size()-1);
				if(cur[2]==60){
					System.out.println("#notworth");
					continue o;
				}
				char u = 'X';
				char d = 'X';
				char l = 'X';
				char r = 'X';
				if (cur[0]>0 && floor[cur[0]-1][cur[1]] != 'X'){
					u = floor[cur[0]-1][cur[1]];
					floor[cur[0]-1][cur[1]] = 'X';
					if (u=='O')
						q.add(0,new int[]{cur[0]-1,cur[1],cur[2]+1});
				}
				if (cur[0]<h-1&&floor[cur[0]+1][cur[1]] != 'X'){
					d = floor[cur[0]+1][cur[1]];
					floor[cur[0]+1][cur[1]] = 'X';
					if (d=='O')
						q.add(0,new int[]{cur[0]+1,cur[1],cur[2]+1});
				}
				if (cur[1]>0&&floor[cur[0]][cur[1]-1] != 'X'){
					l=floor[cur[0]][cur[1]-1];
					floor[cur[0]][cur[1]-1] = 'X';
					if (l=='O')
						q.add(0,new int[]{cur[0],cur[1]-1,cur[2]+1});
				}
				if (cur[1]<w-1&&floor[cur[0]][cur[1]+1] != 'X'){
					r=floor[cur[0]][cur[1]+1];
					floor[cur[0]][cur[1]+1] = 'X';
					if (r=='O')
						q.add(0,new int[]{cur[0],cur[1]+1,cur[2]+1});
				}
				if(cur[2]+1<60 && (u=='W'||d=='W'||l=='W'||r=='W')){
					System.out.println(cur[2]+1);
					continue o;
				}
				/*System.out.println("****************\n" + u+" "+d+" "+l+" "+r);
				for(char[] row:floor)
					System.out.println(Arrays.toString(row));*/
			}
			System.out.println("#notworth");
			
		}
	}

}
