package Chapter08;

import java.io.File;

public class FileEx {
	
	public static void listDirectory(File dir) {	//디렉토리에 포함된 파일과 서브 디렉토리의 이름, 크기, 수정 시간을 출력
		System.out.println("===== " + dir.getPath() + " 의 서브 리스트입니다. =====");
		
		File[] subFiles = dir.listFiles();			//디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기
													//listFiles()는 파일과 서브디렉터리 경로명을 File[] 로 리턴
		for(int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t 파일 크기 : " + f.length());
			System.out.printf("\t 수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("C:/windows/system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		
		String res = "";
		if(f1.isFile())
			res = "파일";
		else if(f1.isDirectory())
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + " 입니다.");
		
		File f2 = new File("files/java_sample");
		if(!f2.exists())
			f2.mkdir();	//디렉토리 생성
		
		listDirectory(new File("files"));
		f2.renameTo(new File("files/javasample"));
		
		listDirectory(new File("files"));
	}
}