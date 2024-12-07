package Z10;

import java.io.File;

public class FileFinder
{
   private File[] children;

   /**
      Constructs a file finder for a given directory tree.
      @param startingDirectory the starting directory of the tree
   */
   public FileFinder(File startingDirectory)
   {
      children = startingDirectory.listFiles();
   }

   /**
      Prints all files whose names end in a given extension.
      @param extension a file extension (such as ".java")
   */
   public void find(String extension)
   {      
      // Iterate over all the files in the current directory
      for (File child : children)
      {
         String fileName = child.toString();
         // If the current file is a directory, create a new FileFinder for it and call find() recursively
         if (child.isDirectory())
         {
            FileFinder finder = new FileFinder(child);
            finder.find(extension);
         }
         // If the current file is a file and its name ends with the given extension, print its name
         else if (fileName.endsWith(extension))
         {
            System.out.println(fileName);
         }
      }
   }
}
