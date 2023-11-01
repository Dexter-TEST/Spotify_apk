package p.z03;
import p.a13;
import android.content.Context;
import android.view.ViewGroup;
import p.uu2;
import p.zk2;
import p.n96;
import p.cy2;
import p.o96;
import java.lang.Class;
import java.lang.Object;
import android.view.LayoutInflater;
import android.view.View;
import p.eo5;

public final class z03 extends a13	// class@002e60 from classes.dex
{
    public final int e;

    public void z03(int p0){
       this.e = p0;
       super();
    }
    public final zk2 f(Context p0,ViewGroup p1,uu2 p2){
       switch (this.e){
           case 0:
           default:
             return this.i(p0, p1);
       }
       return this.i(p0, p1);
    }
    public final n96 i(Context p0,ViewGroup p1){
       n96 on96;
       cy2 td = this.d;
       switch (this.e){
           case 0:
           default:
             td.a.getClass();
             on96 = new n96(LayoutInflater.from(p0).inflate(R.layout.glue_sectionheader_small_description, p1, false));
             eo5.P(on96);
             return on96;
       }
       td.a.getClass();
       on96 = new n96(LayoutInflater.from(p0).inflate(R.layout.glue_sectionheader_large_description, p1, false));
       eo5.P(on96);
       return on96;
    }
}
