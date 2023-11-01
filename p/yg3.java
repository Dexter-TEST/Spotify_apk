package p.yg3;
import p.c42;
import p.m95;
import p.el6;
import java.io.File;
import p.i15;
import java.io.FileOutputStream;
import p.nn;
import p.b57;
import java.io.OutputStream;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.io.IOException;
import java.lang.StringBuilder;
import p.i51;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Long;
import p.xg3;
import java.io.RandomAccessFile;
import p.nn6;
import p.on;
import p.xe7;

public class yg3 extends c42	// class@0003dd from classes2.dex
{

    public void yg3(){
       super();
    }
    public final el6 a(m95 p0){
       return new nn(new FileOutputStream(p0.toFile(), true), new b57());
    }
    public void b(m95 p0,m95 p1){
       co5.o(p0, "source");
       co5.o(p1, "target");
       if (p0.toFile().renameTo(p1.toFile())) {
          return;
       }
       throw new IOException("failed to move "+p0+" to "+p1);
    }
    public final void c(m95 p0){
       i51 oi51;
       int i;
       if (p0.toFile().mkdir()) {
          return;
       }
       if ((oi51 = this.i(p0)) != null) {
          i = 1;
          if (oi51.c == i) {
          label_0017 :
             if (i) {
                return;
             }else {
                throw new IOException("failed to create directory: "+p0);
             }
          }
       }
       i = 0;
       goto label_0017 ;
    }
    public final void d(m95 p0){
       co5.o(p0, "path");
       File uFile = p0.toFile();
       if (!uFile.delete() && uFile.exists()) {
          throw new IOException("failed to delete "+p0);
       }
       return;
    }
    public final List g(m95 p0){
       String[] stringArray;
       co5.o(p0, "dir");
       File uFile = p0.toFile();
       if ((stringArray = uFile.list()) == null) {
          if (!uFile.exists()) {
             throw new FileNotFoundException("no such file: "+p0);
          }else {
             throw new IOException("failed to list "+p0);
          }
       }else {
          ArrayList uArrayList = new ArrayList();
          int len = stringArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = stringArray[i];
             co5.l(oobject, "it");
             uArrayList.add(p0.c(oobject));
          }
          if (uArrayList.size() > 1) {
             Collections.sort(uArrayList);
          }
          return uArrayList;
       }
    }
    public i51 i(m95 p0){
       i51 uFile.exists();
       co5.o(p0, "path");
       File uFile = p0.toFile();
       boolean b = uFile.isFile();
       boolean b1 = uFile.isDirectory();
       long l = uFile.lastModified();
       long l1 = uFile.length();
       if (!b && !b1) {
          int i = 0;
          if (!(l - i) && (!(l1 - i) && !uFile.exists())) {
             return null;
          }
       }
       uFile.exists() = new i51(b, b1, 0, Long.valueOf(l1), 0, Long.valueOf(l), 0);
       return uFile.exists();
    }
    public final xg3 j(m95 p0){
       co5.o(p0, "file");
       return new xg3(new RandomAccessFile(p0.toFile(), "r"));
    }
    public final el6 k(m95 p0){
       co5.o(p0, "file");
       return new nn(new FileOutputStream(p0.toFile(), false), new b57());
    }
    public final nn6 l(m95 p0){
       co5.o(p0, "file");
       return xe7.c0(p0.toFile());
    }
    public String toString(){
       return "JvmSystemFileSystem";
    }
}
