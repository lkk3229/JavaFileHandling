package textFiles;

import java.io.File;

public class FolderActions {

	//create folder
	public static void createFolder(String folderpath) 
	{
		File folder=new File(folderpath);
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder created:"+folderpath);
		}
	
	}
	
	//check if folder exist
	public static boolean checkFolderExist(String folderpath) 
	{
		File folder=new File(folderpath);
		return folder.exists();
	
	}
	
	//rename a folder
	public static void renameFolder(String oldPath, String newPath) {
		File oldFolder=new File(oldPath);
		File newFolder=new File(newPath);
		
		if(oldFolder.exists()) {
			oldFolder.renameTo(newFolder);
			System.out.println("Folder rename to:" + newPath);
		}
	}
	
	//delete a folder (before deleting the folder, delete all files inside the file)
	public static void deleteFolder(String folderPath)
	{
		File folder=new File(folderPath);
		if(folder.exists())
		{
			for(File file:folder.listFiles())
			{
			file.delete();
			}
	
			folder.delete();
			System.out.println("Folder deleted."+folderPath);
		}
	}
	
	public static void main(String[] args) {
		
		String folderpath="C:\\myfiles";
		
		createFolder(folderpath);
		boolean folderExists=checkFolderExist(folderpath);
		System.out.println("folderExists:"+folderExists);
	
		String newFolderpath="C:\\myfiles1";
		renameFolder(folderpath,newFolderpath);
	
		deleteFolder(newFolderpath);
	}

}
