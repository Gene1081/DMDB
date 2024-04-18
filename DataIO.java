import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataIO {
    public static List<String[]> importData(String filePath) {
        List<String[]> dataList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    public static void exportData(List<String[]> dataList, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] data : dataList) {
                String line = String.join(",", data);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Import Data
        List<String[]> importedData = importData("input.csv");
        System.out.println("Imported data:");
        for (String[] data : importedData) {
            System.out.println(String.join(", ", data));
        }

        // Export Data
        exportData(importedData, "output.csv");
        System.out.println("Data exported successfully.");
    }
}
