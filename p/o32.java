package p.o32;
import p.a32;
import p.n32;
import java.lang.String;
import p.f32;
import java.io.File;
import p.ws6;
import p.m42;
import java.lang.Object;
import p.co5;
import p.kf7;
import java.lang.Class;
import java.lang.System;
import java.util.ArrayList;
import p.vs6;
import p.ts6;
import java.util.Date;
import p.ss6;
import java.lang.StringBuilder;
import java.lang.Boolean;
import p.ic;
import p.et0;
import java.lang.IllegalStateException;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;

public final class o32 extends a32	// class@00209e from classes.dex
{
    public final f32 a;
    public final File b;
    public final ws6 c;
    public final boolean t;
    public final m42 v;
    public static final n32 A;
    public static final n32 B;
    public static final n32 C;
    public static final n32 w;
    public static final n32 x;
    public static final n32 y;
    public static final n32 z;

    static {
       o32.w = new n32(2, 1, "Failed to rename file at:");
       o32.x = new n32(2, 1, "Failed to make dir at:");
       o32.y = new n32(2, 1, "Failed to make dirs at:");
       o32.z = new n32(1, 2, "Failed to list files at:");
       o32.A = new n32(3, 3, "Failed to delete file at:");
       o32.B = new n32(3, 3, "Failed to delete file on exit at:");
       o32.C = new n32(2, 1, "Failed to create file at:");
    }
    public void o32(f32 p0,File p1,ws6 p2,boolean p3,m42 p4){
       co5.o(p0, "fileFactory");
       co5.o(p2, "eventSender");
       co5.o(p4, "fileUtils");
       String absolutePath = p1.getAbsolutePath();
       co5.l(absolutePath, "file.absolutePath");
       super(absolutePath);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final a32[] a(){
       a32[] uoa32Array;
       o32 tv = this.v;
       tv.a.getClass();
       File[] uFileArray = this.b.listFiles();
       tv.a.getClass();
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       n32 z = o32.z;
       int i = 0;
       int i1 = 0;
       boolean b = (uFileArray != null)? true: false;
       this.b(z, l, i, b);
       if (uFileArray != null) {
          ArrayList uArrayList = new ArrayList(uFileArray.length);
          int len = uFileArray.length;
          for (int i2 = 0; i2 < len; i2 = i2 + 1) {
             object oobject = uFileArray[i2];
             co5.l(oobject, "file");
             o32 b1 = new o32(this.a, oobject, this.c, this.t, this.v);
             uArrayList.add(b);
          }
          uoa32Array = new a32[i1];
          uoa32Array = uArrayList.toArray(uoa32Array);
       }else {
          uoa32Array = null;
       }
       return uoa32Array;
    }
    public final void b(n32 p0,long p1,int p2,boolean p3){
       if (this.t != null) {
          n32 a = p0.a;
          ts6 ots6 = this.v.a(this.getAbsolutePath());
          Date uDate = new Date();
          ss6 oss6 = (p3)? null: new ss6(p0.c+' '+this.b.getAbsolutePath(), p0.b);
          vs6 v0 = new vs6(a, ots6, p2, uDate, p1, oss6);
          this.c.a(v0);
       }
       return;
    }
    public final boolean canRead(){
       return this.b.canRead();
    }
    public final boolean canWrite(){
       return this.b.canWrite();
    }
    public final boolean createNewFile(){
       Boolean uBoolean;
       boolean b1;
       o32 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          int i = 0;
          boolean b = i;
          uBoolean = Boolean.valueOf(this.b.createNewFile());
       }catch(java.lang.Exception e4){
       }
       long l1 = et0.m(tv.a, l);
       n32 c = o32.C;
       if (uBoolean != null) {
          b1 = uBoolean.booleanValue();
       }else if(!e4){
          b1 = true;
       }else {
          b1 = false;
       }
       this.b(c, l1, 0, b1);
       if (!e4) {
          if (uBoolean != null) {
             return uBoolean.booleanValue();
          }else {
             throw new IllegalStateException("File.createNewFile\(\) result cannot be null");
          }
       }else {
          throw e4;
       }
    }
    public final boolean delete(){
       o32 tb = this.b;
       int i = (int)tb.length();
       o32 tv = this.v;
       tv.a.getClass();
       tv.a.getClass();
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       boolean b = Boolean.valueOf(tb.delete()).booleanValue();
       n32 a = o32.A;
       int i1 = (b)? i: 0;
       this.b(a, l, i1, b);
       return b;
    }
    public final void deleteOnExit(){
       o32 tb = this.b;
       o32 tv = this.v;
       tv.a.getClass();
       tb.deleteOnExit();
       tv.a.getClass();
       this.b(o32.B, (System.currentTimeMillis() - System.currentTimeMillis()), (int)tb.length(), true);
    }
    public final boolean exists(){
       return this.b.exists();
    }
    public final File getAbsoluteFile(){
       File absoluteFile = this.b.getAbsoluteFile();
       co5.l(absoluteFile, "file.absoluteFile");
       o32 v6 = new o32(this.a, absoluteFile, this.c, this.t, this.v);
       return v6;
    }
    public final String getAbsolutePath(){
       String absolutePath = this.b.getAbsolutePath();
       co5.l(absolutePath, "file.absolutePath");
       return absolutePath;
    }
    public final String getCanonicalPath(){
       String canonicalPat = this.b.getCanonicalPath();
       co5.l(canonicalPat, "file.canonicalPath");
       return canonicalPat;
    }
    public final String getName(){
       String name = this.b.getName();
       co5.l(name, "file.name");
       return name;
    }
    public final File getParentFile(){
       File parentFile;
       o32 v0;
       if ((parentFile = this.b.getParentFile()) != null) {
          v0 = new o32(this.a, parentFile, this.c, this.t, this.v);
       }else {
          File uFile = null;
       }
       return v0;
    }
    public final String getPath(){
       String path = this.b.getPath();
       co5.l(path, "file.path");
       return path;
    }
    public final boolean isDirectory(){
       return this.b.isDirectory();
    }
    public final boolean isFile(){
       return this.b.isFile();
    }
    public final boolean isHidden(){
       return this.b.isHidden();
    }
    public final long lastModified(){
       return this.b.lastModified();
    }
    public final long length(){
       return this.b.length();
    }
    public final String[] list(){
       o32 tv = this.v;
       tv.a.getClass();
       String[] stringArray = this.b.list();
       tv.a.getClass();
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       n32 z = o32.z;
       boolean b = (stringArray != null)? true: false;
       this.b(z, l, 0, b);
       return stringArray;
    }
    public final File[] listFiles(FileFilter p0){
       a32[] uoa32Array;
       o32 tv = this.v;
       tv.a.getClass();
       File[] uFileArray = this.b.listFiles(p0);
       tv.a.getClass();
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       n32 z = o32.z;
       int i = 0;
       boolean b = (uFileArray != null)? true: false;
       this.b(z, l, i, b);
       if (uFileArray != null) {
          ArrayList uArrayList = new ArrayList(uFileArray.length);
          int len = uFileArray.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject = uFileArray[i1];
             co5.l(oobject, "file");
             o32 b1 = new o32(this.a, oobject, this.c, this.t, this.v);
             uArrayList.add(b);
          }
          uoa32Array = new a32[0];
          uoa32Array = uArrayList.toArray(uoa32Array);
       }else {
          uFileArray = null;
       }
       return uoa32Array;
    }
    public final File[] listFiles(FilenameFilter p0){
       a32[] uoa32Array;
       o32 tv = this.v;
       tv.a.getClass();
       File[] uFileArray = this.b.listFiles(p0);
       tv.a.getClass();
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       n32 z = o32.z;
       int i = 0;
       boolean b = (uFileArray != null)? true: false;
       this.b(z, l, i, b);
       if (uFileArray != null) {
          ArrayList uArrayList = new ArrayList(uFileArray.length);
          int len = uFileArray.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject = uFileArray[i1];
             co5.l(oobject, "file");
             o32 b1 = new o32(this.a, oobject, this.c, this.t, this.v);
             uArrayList.add(b);
          }
          uoa32Array = new a32[0];
          uoa32Array = uArrayList.toArray(uoa32Array);
       }else {
          uFileArray = null;
       }
       return uoa32Array;
    }
    public final boolean mkdir(){
       o32 tv = this.v;
       tv.a.getClass();
       tv.a.getClass();
       boolean b = Boolean.valueOf(this.b.mkdir()).booleanValue();
       this.b(o32.x, (System.currentTimeMillis() - System.currentTimeMillis()), 0, b);
       return b;
    }
    public final boolean mkdirs(){
       o32 tv = this.v;
       tv.a.getClass();
       tv.a.getClass();
       boolean b = Boolean.valueOf(this.b.mkdirs()).booleanValue();
       this.b(o32.y, (System.currentTimeMillis() - System.currentTimeMillis()), 0, b);
       return b;
    }
    public final boolean renameTo(File p0){
       co5.o(p0, "file");
       o32 tv = this.v;
       tv.a.getClass();
       tv.a.getClass();
       boolean b = Boolean.valueOf(this.b.renameTo(p0)).booleanValue();
       this.b(o32.w, (System.currentTimeMillis() - System.currentTimeMillis()), 0, b);
       return b;
    }
    public final boolean setLastModified(long p0){
       return this.b.setLastModified(p0);
    }
    public final URI toURI(){
       URI uRI = this.b.toURI();
       co5.l(uRI, "file.toURI\(\)");
       return uRI;
    }
}
