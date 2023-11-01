package p.oz0;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.tz0;

public final class oz0 implements FileFilter	// class@0021ba from classes.dex
{
    public final int a;
    public final Object b;

    public void oz0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean accept(File p0){
       oz0 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return p0.equals(tb);
       }
       boolean b = (p0.isDirectory() && !p0.getName().equals(tb))? true: false;
       return b;
    }
}
