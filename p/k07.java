package p.k07;
import java.lang.Object;
import p.xq7;
import java.lang.String;
import p.so6;
import p.he0;
import p.mi;
import p.fe0;
import p.uv1;
import java.lang.CharSequence;
import java.util.List;
import java.lang.Class;
import p.qo6;
import java.util.ArrayList;
import p.ro6;
import java.util.Collections;
import java.lang.StringBuilder;

public final class k07	// class@001b81 from classes.dex
{
    public final int a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;

    public void k07(){
       this.a = 0;
       super(0);
    }
    public void k07(int p0){
       this.a = p0;
       if (p0 != 2) {
          super();
          this.b = true;
          this.c = 0;
          return;
       }else {
          super();
          this.d = new xq7(8);
          return;
       }
    }
    public void k07(int p0,String p1,String p2,boolean p3){
       this.a = 3;
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.b = p3;
    }
    public void k07(int p0,String p1,String p2,boolean p3,int p4){
       this.a = 3;
       super(p0, p1, p2, p3);
    }
    public void k07(so6 p0){
       this.a = 1;
       super(p0, false, he0.D, Integer.MAX_VALUE);
    }
    public void k07(so6 p0,boolean p1,mi p2,int p3){
       this.a = 1;
       super();
       this.e = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
    public static k07 a(char p0){
       return new k07(new uv1(17, new fe0(p0, 0)));
    }
    public final List b(CharSequence p0){
       p0.getClass();
       qo6 oqo6 = this.e.a(this, p0);
       ArrayList uArrayList = new ArrayList();
       while (oqo6.a()) {
          uArrayList.add(oqo6.b());
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public final String toString(){
       switch (this.a){
           case 2:
           default:
             return super.toString();
       }
       return "PPSExt{transform_8x8_mode_flag="+this.b+", scalindMatrix="+this.d+", second_chroma_qp_index_offset="+this.c+", pic_scaling_list_present_flag="+this.e+'}';
    }
}
