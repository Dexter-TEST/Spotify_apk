package p.uk;
import p.vv7;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import p.co5;
import java.util.Arrays;
import java.lang.System;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Appendable;
import p.zf2;
import p.ye7;
import java.io.File;
import p.av6;
import p.en6;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;
import p.ib3;
import p.gb3;
import java.lang.Integer;
import java.util.AbstractSet;
import java.util.Collection;
import p.ek;
import p.ll1;

public abstract class uk extends vv7	// class@0028cd from classes.dex
{

    public static final List h0(Object[] p0){
       co5.o(p0, "<this>");
       List list = Arrays.asList(p0);
       co5.l(list, "asList\(this\)");
       return list;
    }
    public static final boolean i0(Object[] p0,Object p1){
       int i;
       co5.o(p0, "<this>");
       boolean b = false;
       if (p1 == null) {
          int len = p0.length;
          i = 0;
          while (true) {
             if (i < len) {
                if (p0[i] != null) {
                   i = i + 1;
                }
             }else {
             label_0025 :
                i = -1;
             }
          }
       }else {
          i = p0.length;
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if (co5.c(p1, p0[i1])) {
                   i = i1;
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                goto label_0025 ;
             }
          }
       }
       if (i >= 0) {
          b = true;
       }
       return b;
    }
    public static final void j0(int p0,int p1,int p2,byte[] p3,byte[] p4){
       co5.o(p3, "<this>");
       co5.o(p4, "destination");
       System.arraycopy(p3, p1, p4, p0, (p2 - p1));
    }
    public static final void k0(int p0,int p1,int p2,Object[] p3,Object[] p4){
       co5.o(p3, "<this>");
       co5.o(p4, "destination");
       System.arraycopy(p3, p1, p4, p0, (p2 - p1));
    }
    public static void l0(Object[] p0,Object[] p1,int p2,int p3,int p4,int p5){
       if ((p5 & 0x02)) {
          p2 = 0;
       }
       if ((p5 & 0x04)) {
          p3 = 0;
       }
       if ((p5 & 0x08)) {
          p4 = p0.length;
       }
       uk.k0(p2, p3, p4, p0, p1);
       return;
    }
    public static final byte[] m0(byte[] p0,int p1,int p2){
       co5.o(p0, "<this>");
       vv7.i(p2, p0.length);
       p0 = Arrays.copyOfRange(p0, p1, p2);
       co5.l(p0, "copyOfRange\(this, fromIndex, toIndex\)");
       return p0;
    }
    public static final ArrayList n0(Object[] p0){
       object oobject;
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          if ((oobject = p0[i]) != null) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static String o0(Object[] p0,String p1,int p2){
       if ((p2 & 0x01)) {
          p1 = ", ";
       }
       String str = "";
       String str1 = ((p2 & 0x02))? str: null;
       if (!((p2 & 0x04))) {
          str = null;
       }
       int i = 0;
       int i1 = ((p2 & 0x08))? -1: 0;
       String str2 = ((p2 & 0x10))? "...": null;
       co5.o(p1, "separator");
       co5.o(str1, "prefix");
       co5.o(str, "postfix");
       co5.o(str2, "truncated");
       Appendable uAppendable = str1;
       int len = p0.length;
       int i2 = 0;
       for (; i < len; i = i + 1) {
          object oobject = p0[i];
          if ((i2 = i2 + 1) > 1) {
             uAppendable = uAppendable.append(p1);
          }
          if (i1 >= 0 && i2 > i1) {
             break ;
          }
          ye7.a(uAppendable, oobject, null);
       }
       if (i1 >= 0 && i2 > i1) {
          uAppendable = uAppendable+str2;
       }
       String str3 = uAppendable+str;
       co5.l(str3, "joinTo\(StringBuilder\(\), …ed, transform\).toString\(\)");
       return str3;
    }
    public static final File p0(File p0,String p1){
       File uFile = new File(p1);
       p1 = uFile.getPath();
       co5.l(p1, "path");
       int i = 0;
       int i1 = (vv7.w(p1) > 0)? 1: 0;
       if (!i1) {
          String str = p0.toString();
          co5.l(str, "this.toString\(\)");
          if (!str.length()) {
             i = 1;
          }
          File uFile1 = (!i && !av6.h0(str, File.separatorChar))? new File(en6.r(str)+File.separatorChar+uFile): new File(str+uFile);
          uFile = uFile1;
       }
       return uFile;
    }
    public static final char q0(char[] p0){
       int len;
       co5.o(p0, "<this>");
       if (!(len = p0.length)) {
          throw new NoSuchElementException("Array is empty.");
       }
       if (len == 1) {
          return p0[0];
       }
       throw new IllegalArgumentException("Array has more than one element.");
    }
    public static final byte[] r0(byte[] p0,ib3 p1){
       co5.o(p0, "<this>");
       if (!p1.isEmpty()) {
          return uk.m0(p0, Integer.valueOf(p1.a).intValue(), (Integer.valueOf(p1.b).intValue() + 1));
       }
       p0 = new byte[0];
       return p0;
    }
    public static final void s0(AbstractSet p0,Object[] p1){
       co5.o(p1, "<this>");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0.add(p1[i]);
       }
       return;
    }
    public static final List t0(Object[] p0){
       int len;
       ArrayList uArrayList;
       co5.o(p0, "<this>");
       if (len = p0.length) {
          uArrayList = (len != 1)? new ArrayList(new ek(p0, false)): ye7.J(p0[0]);
       }else {
          uArrayList = ll1.a;
       }
       return uArrayList;
    }
}
