import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectorySearcher {
    static List<String> stringList = new ArrayList<>();
    static List<String> stringParentList = new ArrayList<>();
    // 합리적으로 생각하면 객체에 path를 주는게 맞겠지만
    // 클래스 안에서 또 객체 만들고.. 그러는게 맘에 안 들어서 static으로 했다
    // static으로 하면 클래스 안에서 메소드를 그대로 불러와 사용하기가 편하니까?

    public static List<String>[] searchFolder(String path){
        File file = new File(path);
        File[] filesInsideFile = file.listFiles();

        // filesInsideFile을 File f로 순회한다
        for(File f:filesInsideFile){
            if(f.isDirectory() && !(f.getName().contains(".git"))) { // 두번째 조건은 !(.git폴더가 아닐것)
                // 폴더면 그 안을 탐색한다.
                DirectorySearcher.searchFolder(f.getAbsolutePath()).toString();
            }else {
                // 폴더가 아니면
                // 즉, 파일이면 파일명을 add한다.
                if(f.getName().contains(".sln")) { // 프로젝트 파일만 넣으면 되니까
                    stringList.add(f.getName());
                    stringParentList.add(f.getParentFile().getParentFile().getName());

                }
            }
        }

        return new List[]{stringList, stringParentList};
    }
}
