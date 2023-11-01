package p.i71;
import p.ne;
import java.lang.String;
import java.lang.System;

public final class i71 extends ne	// class@001939 from classes.dex
{
    public final char[] a;
    public static final i71 b;

    static {
       String property = System.getProperty("line.separator");
       i71.b = new i71(property);
    }
    public void i71(String p0){
       super();
       char[] uocharArray = new char[32];
       this.a = uocharArray;
       int i1 = 0;
       for (int i = 0; i < 16; i = i + 1) {
          "  ".getChars(0, 2, this.a, i1);
          i1 = i1 + 2;
       }
       return;
    }
}
