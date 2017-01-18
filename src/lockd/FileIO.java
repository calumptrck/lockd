package lockd;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    //Note: data.csv has test data in it right now.
    
    static File dFile = new File("data.csv");
    static List<String[]> dataRowsList = new ArrayList<>();
    static String fileHeader = "service,username,password";

    /*
     * @purpose: Rewrites data.csv with contents of dataRowsList.
     */
    public final static void saveFile() throws IOException {
        PrintStream out = new PrintStream(dFile);
        out.println(fileHeader);
        dataRowsList.stream().forEach((row) -> {
            out.format("%s,%s,%s\n", row[0], row[1], row[2]);
        });
        out.close();
    }
    
    /*
     * @purpose: Inserts a String[] element to dataRowsList.
     * @params: String service: Name of service added to String[].
                String usr: Username added to String[].
                String pwd: Password added to String[].
     */
    public final static void addItem(String service, String usr, String pwd) throws IOException {
        dataRowsList.add(new String[]{service, usr, pwd});
    }
    
    /*
     * @purpose: Modify an element of dataRowsList.
     * @params: int index: Index of element to be removed.
     */
    public final static void removeItem(int index) throws IOException {
        dataRowsList.remove(index);
    }
    
    /*
     * @purpose: Modified a String[] element of dataRowsList
     * @params: int item: Index of dataRowsList element to be modified.
                int field: Index of array element inside dataRowsList element to be modified
                String content: Updated data to be inserted.
     */
    public final static void modifyItem(int item, int field, String content) {
        String[] row = dataRowsList.get(item);
        row[field] = content;
        dataRowsList.set(item, row);
    }

    /*
     * @purpose: Convert data.csv to List
     */
    public final static void indexData() throws IOException {
        Scanner fs = new Scanner(dFile);
        fs.nextLine();
        while (fs.hasNext()) {
            dataRowsList.add(fs.nextLine().split(","));
        }
        fs.close();
    }

    /*
     * @purpose: Retrieve a String[] element from dataRowsList
     * @params: int index: Index of element to be retrieved.
     * @returns: String[] element of dataRowsList at given index.
     */
    public final static String[] retrieveItem(int index) throws IOException {
        return dataRowsList.get(index);
    }
}
