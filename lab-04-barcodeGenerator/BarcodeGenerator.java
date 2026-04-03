import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * The {@code BarcodeGenerator} class generates a QR code image from a given string.
 * <p>
 * This program uses the ZXing (Zebra Crossing) library to encode text data
 * (such as a URL) into a QR code and saves it as a PNG image file.
 * </p>
 *
 * <p>
 * In this implementation:
 * <ul>
 *   <li>The input data is a URL</li>
 *   <li>The QR code is generated with a resolution of 400x400 pixels</li>
 *   <li>The output file is saved as {@code barcode.png}</li>
 * </ul>
 * </p>
 *
 * <p>
 * This program is useful for generating QR codes for websites, text,
 * or other data that can be encoded visually.
 * </p>
 *
 * <p><b>Dependencies:</b></p>
 * <ul>
 *   <li>ZXing Core Library</li>
 *   <li>ZXing Java SE Extensions</li>
 * </ul>
 *
 * @author Kevin Turcios
 * @version 2.0
 */
public class BarcodeGenerator {

    /**
     * Main method that generates a QR code image from a predefined string.
     * <p>
     * The method encodes the given data into a QR code format using ZXing's
     * {@link MultiFormatWriter}, then writes the resulting {@link BitMatrix}
     * to a PNG file using {@link MatrixToImageWriter}.
     * </p>
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            /** The data to encode into the QR code (URL in this case) */
            String data = "https://kevinturcios.site/";

            /** The output file path for the generated QR code image */
            String filePath = "barcode.png";

            /**
             * Encodes the input data into a QR code matrix.
             * 
             * @see MultiFormatWriter#encode(String, BarcodeFormat, int, int)
             */
            BitMatrix matrix = new MultiFormatWriter().encode(
                    data,
                    BarcodeFormat.QR_CODE,
                    400,
                    400
            );

            /**
             * Defines the file system path where the image will be saved.
             */
            Path path = FileSystems.getDefault().getPath(filePath);

            /**
             * Writes the QR code matrix to a PNG image file.
             * 
             * @see MatrixToImageWriter#writeToPath(BitMatrix, String, Path)
             */
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);

            System.out.println("Barcode generated!");

        } catch (Exception e) {
            /**
             * Handles any exceptions that occur during QR code generation
             * or file writing.
             */
            e.printStackTrace();
        }
    }
}
