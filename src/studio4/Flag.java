package studio4;

import java.awt.Color;


import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.picture(0.5, 0.5, "m&m.jpg", 0.5, 0.5);
		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.ellipse(0.5, 0.5, 0.3, 0.3);
	}
}