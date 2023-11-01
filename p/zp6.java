package p.zp6;
import java.lang.String;
import java.util.regex.Pattern;
import p.yk3;
import java.util.List;
import p.ll1;
import p.ml1;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class zp6	// class@002f42 from classes.dex
{
    public final String a;
    public final yk3 b;
    public final List c;
    public final String d;
    public final yk3 e;
    public final boolean f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public static final Pattern k;
    public static final Pattern l;
    public static final Pattern m;

    static {
       Pattern.compile("\\=|\\&");
       zp6.k = Pattern.compile(":");
       zp6.l = Pattern.compile("\\?");
       zp6.m = Pattern.compile("#");
       Pattern.compile("/");
    }
    public void zp6(String p0,yk3 p1,List p2,String p3,boolean p4,String p5,String p6,List p7,List p8,int p9){
       ll1 oll1;
       ll1 oll11;
       ll1 oll12;
       ll1 a = ll1.a;
       if ((p9 & 0x04)) {
          oll1 = a;
       }
       ml1 a1 = ((p9 & 0x08))? ml1.a: null;
       if ((p9 & 0x10)) {
          p3 = null;
       }
       if ((p9 & 0x40)) {
          p4 = false;
       }
       if ((p9 & 0x0080)) {
          p5 = null;
       }
       if ((p9 & 0x0100)) {
          p6 = null;
       }
       if ((p9 & 0x0200)) {
          oll11 = a;
       }
       if ((p9 & 0x0400)) {
          oll12 = a;
       }
       co5.o(a1, "parameters");
       co5.o(oll11, "examples");
       co5.o(oll12, "counterExamples");
       super();
       this.a = p0;
       this.b = p1;
       this.c = oll1;
       this.d = p3;
       this.e = null;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = oll11;
       this.j = oll12;
       return;
    }
    public final String toString(){
       return "mLinkName = "+this.a+", pattern = "+this.c+", verifier = "+this.d+", mLinkType = "+this.b+", mParentLinkType = "+this.e+", mIsPublic = "+this.f+", mOwner = "+this.g+", mDescription = "+this.h+", mExamples = "+this.i+", mCounterExamples = "+this.j;
    }
}
