package p.x3;
import p.v90;
import p.gf4;
import p.da5;
import java.lang.Object;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import java.io.File;
import java.lang.String;
import p.zb6;
import p.wx5;
import p.k01;
import java.lang.reflect.Type;
import p.e15;
import p.xk0;
import p.wk0;
import p.ca0;

public final class x3 implements v90, gf4, da5	// class@002c02 from classes.dex
{
    public final Object a;

    public void x3(Object p0){
       this.a = p0;
       super();
    }
    public static x3 c(int p0,int p1,int p2){
       return new x3(AccessibilityNodeInfo$CollectionInfo.obtain(p0, p1, false, p2));
    }
    public static x3 f(int p0,int p1,int p2,int p3,boolean p4){
       return new x3(AccessibilityNodeInfo$CollectionItemInfo.obtain(p0, p1, p2, p3, false, p4));
    }
    public static void h(File p0){
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             x3.h(uFileArray[i]);
          }
       }
       p0.delete();
       return;
    }
    public File a(String p0){
       File uFile = new File(this.a, p0);
       if (!uFile.exists() && !uFile.mkdirs()) {
          uFile = null;
       }
       return uFile;
    }
    public File b(){
       return this.a.e;
    }
    public File d(){
       return this.a.g;
    }
    public Object e(wx5 p0){
       x3 ta = this.a;
       ta.a = p0;
       return ta;
    }
    public Type g(){
       return this.a;
    }
    public File i(){
       return this.a.f;
    }
    public File j(){
       return this.a.a;
    }
    public File l(){
       return this.a.d;
    }
    public Object m(e15 p0){
       xk0 oxk0 = new xk0(p0);
       p0.x(new wk0(this, 1, oxk0));
       return oxk0;
    }
    public File n(){
       return this.a.b;
    }
    public File p(){
       return this.a.c;
    }
}
