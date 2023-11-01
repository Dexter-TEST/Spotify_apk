package p.g03;
import p.k03;
import p.c33;
import p.uz5;
import java.lang.Class;
import android.content.Context;
import android.view.ViewGroup;
import p.uu2;
import p.zk2;
import p.qz5;
import p.ju2;
import java.lang.CharSequence;
import p.eo5;
import p.o85;
import p.xj0;
import p.wz5;

public class g03 extends k03	// class@001672 from classes.dex
{

    public void g03(c33 p0){
       super(p0, uz5.class);
    }
    public zk2 f(Context p0,ViewGroup p1,uu2 p2){
       return this.j(p0, p1);
    }
    public void g(qz5 p0,ju2 p1){
       this.i(p0, p1);
    }
    public void i(uz5 p0,ju2 p1){
       p0.setText(eo5.m(p1));
    }
    public qz5 j(Context p0,ViewGroup p1){
       return this.k(p0, p1);
    }
    public uz5 k(Context p0,ViewGroup p1){
       wz5 owz5 = new wz5(xj0.x0(p0, p1, R.layout.glue_listtile_1));
       eo5.P(owz5);
       return owz5;
    }
}
