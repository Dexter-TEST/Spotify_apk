package p.xl5;
import java.lang.Object;
import java.io.File;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Throwable;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;

public final class xl5	// class@002c9f from classes.dex
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public void xl5(int p0,int p1,long p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static xl5 a(File p0){
       xl5 p0;
       DataInputStream uDataInputSt = new DataInputStream(new FileInputStream(p0));
       p0 = new xl5(uDataInputSt.readInt(), uDataInputSt.readInt(), uDataInputSt.readLong(), uDataInputSt.readLong());
       uDataInputSt.close();
       return p0;
    }
    public final void b(File p0){
       p0.delete();
       DataOutputStream uDataOutputS = new DataOutputStream(new FileOutputStream(p0));
       uDataOutputS.writeInt(this.a);
       uDataOutputS.writeInt(this.b);
       uDataOutputS.writeLong(this.c);
       uDataOutputS.writeLong(this.d);
       uDataOutputS.close();
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || !p0 instanceof xl5) {
          return false;
       }
       if (this.b != p0.b || ((this.c - p0.c) || (this.a != p0.a || (this.d - p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.b),Long.valueOf(this.c),Integer.valueOf(this.a),Long.valueOf(this.d)};
       return Objects.hash(objArray);
    }
}
