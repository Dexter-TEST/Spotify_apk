package p.o51;
import android.content.Context;
import java.lang.String;
import p.qw6;
import p.ia4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.LinkedHashSet;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.Integer;
import java.util.Set;

public final class o51	// class@0020af from classes.dex
{
    public final Context a;
    public final String b;
    public final qw6 c;
    public final ia4 d;
    public final List e;
    public final boolean f;
    public final int g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final Callable n;
    public final List o;
    public final List p;

    public void o51(Context p0,String p1,qw6 p2,ia4 p3,ArrayList p4,boolean p5,int p6,Executor p7,Executor p8,boolean p9,boolean p10,LinkedHashSet p11,ArrayList p12,ArrayList p13){
       co5.o(p0, "context");
       co5.o(p3, "migrationContainer");
       kg4.t(p6, "journalMode");
       co5.o(p12, "typeConverters");
       co5.o(p13, "autoMigrationSpecs");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = null;
       this.k = p9;
       this.l = p10;
       this.m = p11;
       this.n = null;
       this.o = p12;
       this.p = p13;
    }
    public final boolean a(int p0,int p1){
       o51 tm;
       boolean b = true;
       p1 = (p0 > p1)? 1: 0;
       if (p1 && this.l != null) {
          return false;
       }else if(this.k != null && ((tm = this.m) == null && tm.contains(Integer.valueOf(p0)))){
          b = false;
       }
       return b;
    }
}
