import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import org.opencv.imgproc.Imgproc;

public class Main {

    public static void main(String[] args) {
        // Load OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Open video capture stream
        VideoCapture capture = new VideoCapture(0);

        // Load image from file
        Mat image = Imgcodecs.imread("C:\\Users\\123\\Pictures\\Camera Roll\\WIN_20230504_21_10_58_Pro.jpg");

        // Calculate scaling factors for width and height
        double widthScale = capture.get(3) / image.width();
        double heightScale = capture.get(4) / image.height();
        double scale = Math.min(widthScale, heightScale);

        // Calculate target size while preserving aspect ratio
        int targetWidth = (int) (image.width() * scale);
        int targetHeight = (int) (image.height() * scale);
        Size targetSize = new Size(targetWidth, targetHeight);

        // Main loop
        while (true) {
            // Read frame from video capture stream
            Mat frame = new Mat();
            capture.read(frame);

            // Resize image to match frame size
            Mat resizedImage = new Mat();
            Imgproc.resize(image, resizedImage, targetSize);

            // Perform image processing and display result
            // ...

            HighGui.imshow("Original", frame);
            HighGui.imshow("Resized", resizedImage);
            System.out.println("Image size: " + image.size());
            System.out.println("Image data type: " + image.type());
            System.out.println("Image size: " + frame.size());
            System.out.println("Image data type: " + frame.type());
            HighGui.waitKey(1);
            // Display frame
            // ...
        }
    }
}