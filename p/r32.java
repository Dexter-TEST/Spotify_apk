package p.r32;
import p.oh3;
import java.lang.Object;
import p.u45;
import java.lang.String;
import java.io.File;
import java.lang.StringBuilder;

public final class r32 implements oh3	// class@002469 from classes.dex
{
    public final boolean a;

    public void r32(boolean p0){
       this.a = p0;
    }
    public final String a(Object p0,u45 p1){
       p0 = (this.a != null)? p0.getPath()+':'+p0.lastModified(): p0.getPath();
       return p0;
    }
}
