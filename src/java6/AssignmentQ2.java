package java6;

import java.io.File;
import java.util.Scanner;

public class AssignmentQ2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the file name: ");
			String fileName = input.nextLine();

			File file = new File(fileName);

			if (file.exists()) {
			    System.out.println("File exists");
			    if (file.canRead()) {
			        System.out.println("File is readable");
			    } else {
			        System.out.println("File is not readable");
			    }
			    if (file.canWrite()) {
			        System.out.println("File is writable");
			    } else {
			        System.out.println("File is not writable");
			    }
			    System.out.println("File type: " + getFileType(fileName));
			    System.out.println("File size (bytes): " + file.length());
			} else {
			    System.out.println("File does not exist");
			}
		}
    }

    private static String getFileType(String fileName) {
        String fileType = "unknown";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            fileType = fileName.substring(dotIndex + 1).toLowerCase();
        }
        return fileType;
    }
}
