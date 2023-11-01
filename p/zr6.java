package p.zr6;
import p.sm5;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.co5;

public final class zr6	// class@0003fc from classes2.dex
{
    public final sm5 a;
    public final int b;
    public final String c;

    public void zr6(sm5 p0,int p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String toString(){
       StringBuilder str = "";
       str = (this.a == sm5.b)? str+"HTTP/1.0": str+"HTTP/1.1";
       str = str+' '+this.b+' '+this.c;
       co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str;
    }
}
