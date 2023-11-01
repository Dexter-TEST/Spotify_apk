package p.fz5;
import p.lv1;
import p.vd6;
import p.rd6;
import java.lang.Object;
import java.util.ArrayList;
import p.pd6;
import java.lang.Math;

public final class fz5 extends lv1	// class@00166b from classes.dex
{

    public void fz5(){
       super();
    }
    public final void n(float p0,float p1,vd6 p2){
       p2.d((p1 * p0), 180.00f, 90.00f);
       p1 = (p1 * 2.00f) * p0;
       rd6 ord6 = new rd6(0, 0, p1, p1);
       ord6.f = 180.00f;
       ord6.g = 90.00f;
       p2.g.add(ord6);
       pd6 opd6 = new pd6(ord6);
       p2.a(180.00f);
       p2.h.add(opd6);
       p2.e = 270.00f;
       float f = (p1 + 0) * 0x3f000000;
       p1 = (p1 - 0) / 2.00f;
       double d = (double)270.00f;
       p2.c = ((float)Math.cos(Math.toRadians(d)) * p1) + f;
       p2.d = (p1 * (float)Math.sin(Math.toRadians(d))) + f;
    }
}
