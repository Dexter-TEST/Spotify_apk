package p.jn5;
import p.sw6;
import android.database.sqlite.SQLiteProgram;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Double;
import java.lang.Long;
import java.util.List;
import android.database.sqlite.SQLiteClosable;

public class jn5 implements sw6	// class@001b0f from classes.dex
{
    public final int a;
    public final Object b;

    public void jn5(SQLiteProgram p0){
       this.a = 1;
       co5.o(p0, "delegate");
       super();
       this.b = p0;
    }
    public final void C(int p0,double p1){
       switch (this.a){
           case 0:
           default:
             this.b.bindDouble(p0, p1);
             return;
       }
       this.b(p0, Double.valueOf(p1));
       return;
    }
    public final void P(int p0,long p1){
       switch (this.a){
           case 0:
           default:
             this.b.bindLong(p0, p1);
             return;
       }
       this.b(p0, Long.valueOf(p1));
       return;
    }
    public final void b(int p0,Object p1){
       int i;
       p0--;
       jn5 tb = this.b;
       if (p0 >= tb.size() && (i = tb.size()) <= p0) {
          while (true) {
             tb.add(null);
             if (i != p0) {
                i = i + 1;
             }
          }
       }
       tb.set(p0, p1);
       return;
    }
    public final void close(){
       switch (this.a){
           case 0:
           default:
             this.b.close();
             return;
       }
       return;
    }
    public final void d0(byte[] p0,int p1){
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "value");
             this.b.bindBlob(p1, p0);
             return;
       }
       co5.o(p0, "value");
       this.b(p1, p0);
       return;
    }
    public final void s(int p0,String p1){
       switch (this.a){
           case 0:
           default:
             co5.o(p1, "value");
             this.b.bindString(p0, p1);
             return;
       }
       co5.o(p1, "value");
       this.b(p0, p1);
       return;
    }
    public final void z(int p0){
       switch (this.a){
           case 0:
           default:
             this.b.bindNull(p0);
             return;
       }
       this.b(p0, null);
       return;
    }
}
