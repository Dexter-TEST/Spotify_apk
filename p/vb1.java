package p.vb1;
import p.dc1;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.io.File;
import p.xb1;
import p.we7;
import p.b42;
import java.lang.Class;
import p.on;
import p.xe7;
import p.ub1;
import java.util.Iterator;
import p.nn6;
import java.io.Closeable;

public final class vb1	// class@000382 from classes2.dex
{
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public tb1 g;
    public int h;
    public long i;
    public final dc1 j;

    public void vb1(dc1 p0,String p1){
       co5.o(p0, "this$0");
       co5.o(p1, "key");
       this.j = p0;
       super();
       this.a = p1;
       p0 = p0.t;
       long[] olongArray = new long[p0];
       this.b = olongArray;
       this.c = new ArrayList();
       this.d = new ArrayList();
       StringBuilder str = p1+'.';
       int i = str.length();
       for (int i1 = 0; i1 < p0; i1 = i2) {
          int i2 = i1 + 1;
          str = str.append(i1);
          this.c.add(new File(this.j.b, str.toString()));
          str = str.append(".tmp");
          this.d.add(new File(this.j.b, str.toString()));
          str.setLength(i);
       }
       return;
    }
    public final xb1 a(){
       if (this.e == null) {
          return null;
       }
       vb1 tj = this.j;
       if (tj.E == null && (this.g != null && this.f == null)) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Object obj = this.b.clone();
       try{
          dc1 t = tj.t;
          for (int i = 0; i < t; i = i1) {
             int i1 = i + 1;
             File uFile = this.c.get(i);
             tj.a.getClass();
             co5.o(uFile, "file");
             on oon = xe7.c0(uFile);
             if (tj.E == null) {
                int i2 = this.h + 1;
                this.h = i2;
                oon = new ub1(oon, tj, this);
             }
             uArrayList.add(oon);
          }
          xb1 v10 = new xb1(this.j, this.a, this.i, uArrayList, obj);
          return v10;
       }catch(java.io.FileNotFoundException e0){
          Iterator iterator = uArrayList.iterator();
       label_006c :
          if (iterator.hasNext()) {
             we7.d(iterator.next());
             goto label_006c ;
          }else {
             try{
                e0.m0(this);
                return null;
             }catch(java.io.IOException e0){
             }
          }
       }
    }
}
