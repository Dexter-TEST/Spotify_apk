package p.uz7;
import java.lang.String;
import java.util.regex.Pattern;
import java.io.File;
import java.util.ArrayList;
import p.tz7;
import java.io.FilenameFilter;
import java.lang.Integer;
import p.dy7;
import java.lang.Object;
import java.lang.CharSequence;
import java.io.FileInputStream;
import p.kx7;
import java.io.InputStream;
import p.ix7;

public abstract class uz7	// class@002951 from classes.dex
{
    public static final Pattern a;

    static {
       uz7.a = Pattern.compile("[0-9]+-\(NAM|LFH\)\\.dat");
    }
    public static ArrayList a(File p0,File p1){
       File[] uFileArray;
       int len;
       ix7 a;
       File uFile;
       int i2;
       ArrayList uArrayList = new ArrayList();
       if ((uFileArray = p1.listFiles(tz7.a)) == null) {
          uFileArray = new File[0];
       }else {
          len = uFileArray.length;
          File[] uFileArray1 = new File[len];
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                object oobject1 = uFileArray[i1];
                if ((i2 = Integer.parseInt(oobject1.getName().split("-")[0])) <= uFileArray.length && uFileArray1[i2] == null) {
                   uFileArray1[i2] = oobject1;
                   i1 = i1 + 1;
                }else {
                   throw new dy7("Metadata folder ordering corrupt.");
                }
             }else {
                uFileArray = uFileArray1;
             }
          }
          Object[] objArray = new Object[]{uFile.getCanonicalPath()};
          throw new dy7(String.format("Missing asset file %s during slice reconstruction.", objArray));
       }
       len = uFileArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return uArrayList;
          }
          object oobject = uFileArray[i];
          uArrayList.add(oobject);
          if (oobject.getName().contains("LFH")) {
             FileInputStream uFileInputSt = new FileInputStream(oobject);
             if ((a = new kx7(uFileInputSt).b().a) != null) {
                uFile = new File(p0, a);
                if (uFile.exists()) {
                   uArrayList.add(uFile);
                   uFileInputSt.close();
                }else {
                }
             }else {
                throw new dy7("Metadata files corrupt. Could not read local file header.");
             }
          }
          i = i + 1;
       }
    }
}
