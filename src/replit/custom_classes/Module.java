package replit.custom_classes;

import java.util.ArrayList;

/**
 * Create the `Module.java` file according to the following requirements.
 *
 *   - declare these `instance variables`:
 *     - name (String)
 *     - files (ArrayList of File objects)
 *
 *   - create these `constructors` to initialize the variables:
 *     - 1 argument (`String`): initialize the name and create an empty ArrayList of Files
 *     - 2 arguments (`String and ArrayList<File>`) initialize the name and use the given ArrayList as the starting Files
 *
 *   - create a void instance method: `addFile()`
 *     - accept a File object and add the given File to the ArrayList of Files
 *
 *   - create a void instance method: `removeFile()`
 *     - accept a File object and remove the given File to the ArrayList of Files
 *
 *     Note: this could be tricky, try to use lambda and some logic to remove when the files name and size are the same to what you want to remove
 *
 *   - create a `toString()` to print the Module objects in this format:
 *     > $module name
 *     >
 *     > Files:
 *     >
 *     > print ArrayList of files
 */
public class Module {
    String name;
    ArrayList<File> files;

    public Module(String name) {
        this.name = name;
        ArrayList<File> files1 = new ArrayList<>();
    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }
    public void addFile(File file) {
        files.add(file);
    }
    public void removeFile(File file) {
        files.removeIf(p -> file.name.equals("Programming.pdf") && file.size == 1.54);
    }

    @Override
    public String toString() {

        return name + "\n" + "\n" + "Files:\n" + "\n" + files;
    }
}
