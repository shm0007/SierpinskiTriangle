
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Shamim Ehsan
 */
public class SierpinskiTriangle {

    public static void main(final String[] args) {

        if (args.length < 2) {
            System.out.println("Missing Argument!\n Usage: java SierpinskiTriangle dimentsion iteration");
            return;
        }
        int dim = Integer.parseInt(args[0]);
        int iteration = Integer.parseInt(args[1]);

        makeSierpinskiTriangle(dim, iteration);
    }

    /**
     * This method takes a dimension , creates a bufferedImage of size dim *
     * dim, filled each pixels with white color and returns the image
     *
     * @param dim dimension of the image
     * @return bufferedimage
     */
    public static BufferedImage createImage(int dim) {
        final BufferedImage image = new BufferedImage(dim, dim, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                image.setRGB(i, j, Color.WHITE.getRGB());
            }
        }
        return image;
    }

    /**
     *
     * @param dim dimension of the image
     * @param itarations iteration count for creating Sierpinski Triangle
     */
    private static void makeSierpinskiTriangle(int dim, int itarations) {
        final BufferedImage image = createImage(dim);

        // Three points of equilateral triangle
        int[][] points = {{0, dim - 1},
        {dim - 1, dim - 1},
        {dim / 2, 0}};

        // A random index which will change in each iteration. In this implementation mid point is chosen, but any random point will work same
        int curX = dim / 2;
        int curY = dim / 2;

        while (itarations-- > 0) {
            // Set current pixel to black
            image.setRGB(curX, curY, Color.BLACK.getRGB());
            // Step 1: pick a random endpoint of the traingle
            int ind = (int) (Math.random() * 3);

            //Step 2: find midpoint of current pixel and random endpoint
            curX = (curX + points[ind][0]) / 2;
            curY = (curY + points[ind][1]) / 2;

        }
        try {
            RenderedImage rendImage = image;
            // Make a jpeg file. png/bm[ file will also work
            ImageIO.write(rendImage, "jpeg", new File("SierpinskiTriangle.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
