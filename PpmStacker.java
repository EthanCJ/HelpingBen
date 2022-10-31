package a3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that uses image stacking to perform noise reduction on images. On
 * initialization, a stacker object reads a series of PPM text-based image
 * files. A noise reduced image is produced by computing the average color of
 * each pixel over all of the images.
 */
public class PpmStacker {

	/**
	 * The noise reduced average image.
	 */
	private SimpleImage avg;

	/**
	 * The stack of images.
	 */
	private List<SimpleImage> stack;

	/**
	 * Initializes an image stacker object by reading a series of PPM text-based
	 * image files and computing a noise reduced image by averaging the pixel colors
	 * over all of the images. The image files are assumed to be all in the same
	 * directory and the names of the image files should follow the pattern
	 * PREFIX_000.ppm, PREFIX_001.ppm, PREFIX_002.ppm, etc., where PREFIX is a
	 * common filename prefix.
	 * 
	 * @param dir        a directory that the image files are contained in
	 * @param filePrefix the common filename prefix
	 * @param n          the number of images in the stack
	 * @throws PpmException if a PPM file in the stack is readable but contains
	 *                      invalid or unexpected data, or if images in the stack
	 *                      have different sizes
	 */
	public PpmStacker(String dir, String filePrefix, int n) {
		if (n < 0) {
			throw new IllegalArgumentException("number of images less than zero");
		}
		this.stack = readImageStack(dir, filePrefix, n);
		this.avg = average();
	}

	/**
	 * Reads a series of PPM text-based images files and returns the list of read
	 * images.
	 * 
	 * @param dir        a directory that the image files are contained in
	 * @param filePrefix the common filename prefix
	 * @param n          the number of images in the stack
	 * @return a list of images
	 * @throws PpmException if a PPM file in the stack is readable but contains
	 *                      invalid or unexpected data, or if images in the stack
	 *                      have different sizes
	 */
	private static List<SimpleImage> readImageStack(String dir, String filePrefix, int n) {
		// IMPLEMENT THIS METHOD
		
		
	}

	/**
	 * Computes the average image over all of the images in the image stack
	 * this.stack without modifying any images in this.stack
	 * 
	 * @return the average image
	 */
	private SimpleImage average() {
		// IMPLEMENT THIS METHOD
		
		
	}
	
	
	/*
	 * EVERYTHING ELSE IS ALREADY DONE
	 */

	/**
	 * Returns the noise reduced averaged image.
	 * 
	 * @return the noise reduced averaged image
	 */
	public SimpleImage getAverage() {
		return this.avg;
	}

	/**
	 * Returns the specified image in the image stack. The first image in the stack
	 * is image 0.
	 * 
	 * @param i the index of the image in the image stack to return
	 * @return the specified image in the image stack
	 */
	public SimpleImage getImage(int i) {
		return this.stack.get(i);
	}
}
