package p.i32;
import p.j22;
import java.io.File;
import java.lang.Object;
import p.au0;
import p.qn6;
import p.m95;
import p.ir2;
import p.c42;
import p.m32;
import java.lang.String;
import java.io.Closeable;
import android.webkit.MimeTypeMap;
import p.co5;
import p.av6;
import p.q63;

public final class i32 implements j22	// class@001916 from classes.dex
{
    public final File a;

    public void i32(File p0){
       this.a = p0;
    }
    public final Object a(au0 p0){
       i32 ta = this.a;
       String name = ta.getName();
       co5.l(name, "name");
       return new qn6(new m32(ir2.w(ta), c42.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(av6.H0('.', name, "")), 3);
    }
}
