package justen;
import java.io.File;

public class DirectoryHelper {
	
	public static boolean createDirectory(String name)
	{
		File dir = new File(name);
		if (dir.isDirectory())
			deleteFolder(dir);
		return dir.mkdir();
	}
	
	public static boolean createCompletedDirectory(String name)
	{
		File dir = new File(name + "\\completed");
		if (dir.isDirectory())
			deleteFolder(dir);
		return dir.mkdir();
	}
	
	public static boolean createChunkDirectory(String name)
	{
		File dir = new File(name + "\\chunks");
		if (dir.isDirectory())
			deleteFolder(dir);
		return dir.mkdir();
	}
	
	/*
	 * Recursively deletes all files in directory
	 * */
	private static void deleteFolder(File folder)
	{
		File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                deleteFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	    folder.delete();
	}
	
}