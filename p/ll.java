package p.ll;
import p.p08;
import java.lang.Object;
import java.lang.Integer;
import p.wv7;
import java.util.HashMap;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import p.yv7;
import java.util.ArrayList;
import java.util.Arrays;

public final class ll extends p08	// class@001d7b from classes.dex
{

    public void ll(int p0,int p1){
       Object[] objArray;
       HashMap a;
       Integer integer;
       String str2;
       StringBuilder str3;
       String str = "\)";
       String str1 = "";
       int i = 0;
       int i1 = 2;
       if (p1 != 1) {
          objArray = new Object[i1];
          objArray[i] = Integer.valueOf(p0);
          a = wv7.a;
          integer = Integer.valueOf(p0);
          if (a.containsKey(integer)) {
             str1 = a.get(integer);
             str2 = wv7.b.get(integer);
             str3 = new StringBuilder(((String.valueOf(str1).length() + 113) + String.valueOf(str2).length()))+str1;
             str1 = str3+" \(https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"+str2+str;
          }
          objArray[1] = str1;
          super(String.format("Asset Pack Download Error\(%d\): %s", objArray));
          if (p0) {
             return;
          }else {
             throw new IllegalArgumentException("errorCode should not be 0.");
          }
       }else {
          objArray = new Object[i1];
          objArray[i] = Integer.valueOf(p0);
          a = yv7.a;
          integer = Integer.valueOf(p0);
          if (a.containsKey(integer)) {
             HashMap b = yv7.b;
             if (b.containsKey(integer)) {
                str1 = a.get(integer);
                str2 = b.get(integer);
                str3 = new StringBuilder(((String.valueOf(str1).length() + 103) + String.valueOf(str2).length()))+str1;
                str1 = str3+" \(https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"+str2+str;
             }
          }
          objArray[1] = str1;
          super(String.format("Install Error\(%d\): %s", objArray));
          if (p0) {
             return;
          }else {
             throw new IllegalArgumentException("errorCode should not be 0.");
          }
       }
    }
    public void ll(ArrayList p0){
       super("Dependency cycle detected: "+Arrays.toString(p0.toArray()));
    }
}
