package p.ll5;
import java.io.File;
import java.lang.Object;
import java.io.FileOutputStream;
import p.ge6;
import p.t37;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;

public final class ll5	// class@001d79 from classes.dex
{
    public final File a;

    public void ll5(File p0){
       super();
       this.a = p0;
    }
    public final void a(byte[] p0){
       ll5 ta = this.a;
       int i = 0;
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(ta);
          Objects.toString(ta);
          Object[] objArray = new Object[i];
          t37.a().getClass();
          ge6.a(objArray);
          uFileOutputS.write(p0);
          eb3.d(uFileOutputS, null);
          return;
       }catch(java.io.IOException e0){
          Objects.toString(e0);
          Object[] objArray1 = new Object[i];
          t37.a().getClass();
          ge6.f(objArray1);
          return;
       }
    }
}
