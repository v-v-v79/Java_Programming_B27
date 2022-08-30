package replit.custom_classes;

/**
 * Create the `File.java` file according to the following requirements.
 *
 *   - declare these `instance variables`:
 *     - name (String)
 *     - size (double)
 *
 *   - create a `constructor` to initialize all the variables
 *
 *   - create a void instance method: `openFile()`
 *     - the method will print:
 *       > Opening $fileName
 *
 *   - create a `toString()` to print the File objects in this format:
 *     > File | $fileName | $size mb
 */
public class File {
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    public void openFile() {
        System.out.println("Opening " + name);
    }

    @Override
    public String toString() {
        return "File{" + name + " | " + size + " mb" +
                '}';
    }
}

