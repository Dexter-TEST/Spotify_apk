package p.ka1;
import android.content.res.AssetManager;
import p.bk;
import p.pl5;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import android.os.Build$VERSION;
import p.ap5;
import java.io.FileInputStream;
import android.content.res.AssetFileDescriptor;
import java.lang.Throwable;
import java.lang.CharSequence;
import java.io.Serializable;
import p.ja1;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public final class ka1	// class@001bd4 from classes.dex
{
    public final Executor a;
    public final pl5 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f;
    public ta1[] g;
    public byte[] h;

    public void ka1(AssetManager p0,bk p1,pl5 p2,String p3,File p4){
       int sDK_INT;
       byte[] uobyteArray;
       super();
       this.f = false;
       this.a = p1;
       this.b = p2;
       this.e = p3;
       this.d = p4;
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 24 && sDK_INT <= 33) {
          switch (sDK_INT){
              case 24:
              case 25:
                uobyteArray = ap5.B;
                break;
              case 26:
                uobyteArray = ap5.A;
                break;
              case 27:
                uobyteArray = ap5.z;
                break;
              case 28:
              case 30:
              case 29:
                uobyteArray = ap5.y;
                break;
              case 31:
              case '!':
              case 32:
                uobyteArray = ap5.x;
                break;
              default:
             label_002c :
                uobyteArray = null;
          }
       }else {
          goto label_002c ;
       }
       this.c = uobyteArray;
       return;
    }
    public final FileInputStream a(AssetManager p0,String p1){
       FileInputStream uFileInputSt;
       String message;
       try{
          uFileInputSt = p0.openFd(p1).createInputStream();
       label_001e :
          return uFileInputSt;
       }catch(java.io.FileNotFoundException e1){
          if ((message = e1.getMessage()) != null && message.contains("compressed")) {
             this.b.i();
          }
          uFileInputSt = null;
          goto label_001e ;
       }
    }
    public final void b(int p0,Serializable p1){
       this.a.execute(new ja1(this, p0, p1, 0));
    }
}
