import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
	public static HashMap<Integer, Integer> bs = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] H = in.readLine().split(" ");
		String[] B = in.readLine().split(" ");
		if (H[0].equals("0") || B[0].equals("0")) {
			System.out.println("impossible");
			System.exit(0);
		}
		int h = Integer.parseInt(H[0]);
		int b = Integer.parseInt(B[0]);
		Integer[] hh = new Integer[h];
		Integer[] bb = new Integer[b];
		for (int i = 1; i <= h; i++) {
			hh[i - 1] = Integer.parseInt(H[i]);
		}
		for (int i = 1; i <= b; i++) {
			bb[i - 1] = Integer.parseInt(B[i]);
		}
		Arrays.sort(hh, Collections.reverseOrder());
		Arrays.sort(bb, Collections.reverseOrder());
		findH(hh, 0, -1, 0);
		findB(bb, 0, -1, 0);
		int min = 10000000;
		int temp;
		for (Integer k : hs.keySet()) {
			if (bs.containsKey(k)) {
				temp = hs.get(k) + bs.get(k);
				if (temp < min) {
					min = temp;
				}
			}
		}
//
//		for (Integer name : hs.keySet()) {
//
//			String key = name.toString();
//			String value = hs.get(name).toString();
//			System.out.println(key + " " + value);
//
//		}
//		System.out.println("#########################################");
//		for (Integer name : bs.keySet()) {
//
//			String key = name.toString();
//			String value = bs.get(name).toString();
//			System.out.println(key + " " + value);
//
//		}
		if (min != 10000000) {
			System.out.println(min);

		} else {
			System.out.println("impossible");
		}
	}

	public static void findH(Integer[] a, int cur, int start, int num) {
		if (cur != 0) {
			if (hs.containsKey(cur)) {
				if (hs.get(cur) <= num) {
					return;
				} else {
					hs.put(cur, num);
				}
			} else {
				hs.put(cur, num);
			}
		}
		for (int i = start + 1; i < a.length; i++) {
			findH(a, cur + a[i], i, num + 1);
		}
	}

	public static void findB(Integer[] a, int cur, int start, int num) {
		if (cur != 0) {
			if (bs.containsKey(cur)) {
				if (bs.get(cur) <= num) {
					return;
				} else {
					bs.put(cur, num);
				}
			} else {
				bs.put(cur, num);
			}
		}
		for (int i = start + 1; i < a.length; i++) {
			findB(a, cur + a[i], i, num + 1);
		}
	}
}
