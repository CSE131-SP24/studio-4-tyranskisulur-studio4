package studio4;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next(); 
		
		int red;
		int green;
		int blue;
		boolean filled;
		double point1;
		double point2;
		double point3;
		double point4;
		
		if(shapeType.equals("rectangle")) {
			red = in.nextInt(); 
			green = in.nextInt(); 
			blue = in.nextInt(); 
			filled = in.nextBoolean(); 
			point1 = in.nextDouble();
			point2 = in.nextDouble();
			point3 = in.nextDouble();
			point4 = in.nextDouble();
			Color ooga = new Color(red, green, blue);
			StdDraw.setPenColor(ooga);
			if(filled == true) {
				StdDraw.filledRectangle(point1, point2, point3, point4);
			}else {
				StdDraw.rectangle(point1, point2, point3, point4);
			}
			StdDraw.rectangle(point1, point2, point3, point4);
		}else if (shapeType.equals("ellipse")){
			red = in.nextInt(); 
			green = in.nextInt(); 
			blue = in.nextInt(); 
			filled = in.nextBoolean(); 
			point1 = in.nextDouble();
			point2 = in.nextDouble();
			point3 = in.nextDouble();
			point4 = in.nextDouble();
			Color ooga = new Color(red, green, blue);
			StdDraw.setPenColor(ooga);
			if(filled == true) {
				StdDraw.filledEllipse(point1, point2, point3, point4);
			}else {
				StdDraw.ellipse(point1, point2, point3, point4);
			}
		}
				
	}
}
