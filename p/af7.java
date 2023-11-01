package p.af7;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.co5;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class af7 implements FilenameFilter	// class@000f73 from classes.dex
{
    public final int a;

    public void af7(int p0){
       this.a = p0;
       super();
    }
    public final boolean accept(File p0,String p1){
       String str2;
       Pattern pattern;
       Object[] objArray1;
       String str = "^%s[0-9]+.json$";
       int i = 1;
       int i1 = 0;
       String str1 = "name";
       switch (this.a){
           case 0:
             return Pattern.matches("cpu[0-9]+", p1);
           case 1:
             co5.l(p1, str1);
             Object[] objArray = new Object[]{"crash_log_","shield_log_","thread_check_log_"};
             str2 = String.format("^\(%s|%s|%s\)[0-9]+.json$", Arrays.copyOf(objArray, 3));
             co5.l(str2, "java.lang.String.format\(format, *args\)");
             pattern = Pattern.compile(str2);
             co5.l(pattern, "compile\(pattern\)");
             return pattern.matcher(p1).matches();
           case 2:
             co5.l(p1, str1);
             objArray1 = new Object[i];
             objArray1[i1] = "analysis_log_";
             str2 = String.format(str, Arrays.copyOf(objArray1, i));
             co5.l(str2, "java.lang.String.format\(format, *args\)");
             pattern = Pattern.compile(str2);
             co5.l(pattern, "compile\(pattern\)");
             return pattern.matcher(p1).matches();
           case 3:
             co5.l(p1, str1);
             objArray1 = new Object[i];
             objArray1[i1] = "anr_log_";
             str2 = String.format(str, Arrays.copyOf(objArray1, i));
             co5.l(str2, "java.lang.String.format\(format, *args\)");
             pattern = Pattern.compile(str2);
             co5.l(pattern, "compile\(pattern\)");
             return pattern.matcher(p1).matches();
           default:
             co5.l(p1, str1);
             objArray1 = new Object[i];
             objArray1[i1] = "error_log_";
             str2 = String.format(str, Arrays.copyOf(objArray1, i));
             co5.l(str2, "java.lang.String.format\(format, *args\)");
             pattern = Pattern.compile(str2);
             co5.l(pattern, "compile\(pattern\)");
             return pattern.matcher(p1).matches();
       }
    }
}
