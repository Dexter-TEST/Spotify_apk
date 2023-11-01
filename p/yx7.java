package p.yx7;
import p.jd;
import java.lang.String;
import p.dx7;
import p.hy7;
import p.iy7;
import p.lz7;
import java.lang.Object;
import p.xx7;
import p.sz7;
import p.yy7;
import java.lang.Class;
import java.io.File;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import p.hx7;
import java.io.RandomAccessFile;
import p.dy7;
import java.lang.Integer;
import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.lang.Math;
import p.kx7;
import p.ix7;
import java.io.FileOutputStream;
import java.lang.Throwable;
import java.lang.Exception;
import p.jy7;
import p.i28;
import p.ax7;
import java.lang.Double;
import java.util.HashMap;
import com.google.android.play.core.assetpacks.zzbn;
import p.t5;
import java.lang.Runnable;
import android.os.Handler;

public final class yx7	// class@002e4a from classes.dex
{
    public final byte[] a;
    public final dx7 b;
    public final hy7 c;
    public final hy7 d;
    public final iy7 e;
    public final lz7 f;
    public static final jd g;

    static {
       yx7.g = new jd("ExtractChunkTaskHandler");
    }
    public void yx7(dx7 p0,hy7 p1,hy7 p2,iy7 p3,lz7 p4){
       super();
       byte[] uobyteArray = new byte[8192];
       this.a = uobyteArray;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(xx7 p0){
       Object[] objArray;
       xx7 h;
       boolean i4;
       hx7 a;
       Object[] objArray1;
       int i5;
       SequenceInputStream sequenceInpu;
       File uFile1;
       ix7 a2;
       File a2;
       int i6;
       Object[] objArray2;
       yy7 b1;
       yx7 e;
       Object[] objArray4;
       long l1;
       long l3;
       yx7 oyx7 = this;
       yy7 oyy7 = p0;
       yx7 b = oyx7.b;
       yy7 oyy71 = oyy7.b;
       xx7 c = oyy7.c;
       xx7 d = oyy7.d;
       xx7 f = oyy7.f;
       sz7 v0 = new sz7(b, oyy71, c, d, f);
       b.getClass();
       File uFile = new File(new File(new File(b.c(c, d, oyy71), "_slices"), "_metadata"), f);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       int i = 1;
       c = 3;
       int i1 = 0;
       int i2 = 2;
       try{
          xx7 l = oyy7.l;
          int i3 = 8192;
          xx7 oxx7 = (oyy7.g != i)? l: new GZIPInputStream(l, i3);
          if (oyy7.h > null) {
             hx7 ohx7 = v0.b();
             h = oyy7.h;
             i4 = h - 1;
             if (ohx7.e == i4) {
                if ((a = ohx7.a) != i) {
                   if (a != i2) {
                      if (a == c) {
                         objArray1 = new Object[i1];
                         yx7.g.a("Resuming central directory from last chunk.", objArray1);
                         sz7 a1 = v0.a;
                         RandomAccessFile randomAccess = new RandomAccessFile(v0.c(), "rw");
                         randomAccess.seek(ohx7.c);
                         do {
                            if ((i5 = oxx7.read(a1)) > 0) {
                               randomAccess.write(a1, i1, i5);
                            }
                         } while (i5 != i3);
                         randomAccess.close();
                         i5 = ((i5 = oyy7.h + i) == oyy7.i)? 1: 0;
                         if (i5) {
                            c = oxx7;
                         }else {
                            throw new dy7("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", oyy7.a);
                         }
                      }else {
                         objArray = new Object[i];
                         objArray[i1] = Integer.valueOf(ohx7.a);
                         throw new dy7(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", objArray), oyy7.a);
                      }
                   }else {
                      objArray4 = new Object[i1];
                      yx7.g.a("Resuming zip entry from last chunk during local file header.", objArray4);
                      e = oyx7.b;
                      e.getClass();
                      File uFile2 = new File(new File(new File(new File(e.c(oyy7.c, oyy7.d, oyy7.b), "_slices"), "_metadata"), oyy7.f), "checkpoint_ext.dat");
                      if (uFile2.exists()) {
                         c = oxx7;
                         sequenceInpu = new SequenceInputStream(new FileInputStream(uFile2), oxx7);
                      }else {
                         throw new dy7("Checkpoint extension file not found.", oyy7.a);
                      }
                   }
                }else {
                   objArray4 = new Object[i];
                   objArray4[i1] = ohx7.b;
                   yx7.g.a("Resuming zip entry from last chunk during file %s.", objArray4);
                   uFile1 = new File(ohx7.b);
                   if (uFile1.exists()) {
                      RandomAccessFile randomAccess1 = new RandomAccessFile(uFile1, "rw");
                      randomAccess1.seek(ohx7.c);
                      hx7 d2 = ohx7.d;
                      while (true) {
                         i5 = (int)Math.min(d2, 8192);
                         if ((i6 = Math.max(oxx7.read(oyx7.a, i1, i5), i1)) > 0) {
                            randomAccess1.write(oyx7.a, i1, i6);
                            break ;
                         }else {
                            break ;
                         }
                      }
                      long l2 = d2 - (long)i6;
                      if ((l2) > 0 && i6 > 0) {
                         l3 = l2;
                      }else {
                         l3 = randomAccess1.length();
                         randomAccess1.close();
                         if (i6 != i5) {
                            Object[] objArray5 = new Object[i1];
                            yx7.g.a("Chunk has ended while resuming the previous chunks file content.", objArray5);
                            c = oxx7;
                            v0.e(uFile1.getCanonicalPath(), l3, l2, oyy7.h);
                         }else {
                         label_01b9 :
                            c = oxx7;
                            sequenceInpu = c;
                         }
                      }
                   }else {
                      throw new dy7("Partial file specified in checkpoint does not exist. Corrupt directory.", oyy7.a);
                   }
                }
                sequenceInpu = null;
             }else {
                objArray2 = new Object[]{Integer.valueOf(h),Integer.valueOf(ohx7.e)};
                throw new dy7(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", objArray2), oyy7.a);
             }
          }else {
             goto label_01b9 ;
          }
          if (sequenceInpu != null) {
             kx7 okx7 = new kx7(sequenceInpu);
             uFile1 = oyx7.b.k(oyy7.b, oyy7.c, oyy7.d, oyy7.f);
             if (!uFile1.exists()) {
                uFile1.mkdirs();
             }
             while (true) {
                ix7 oix7 = okx7.b();
                if (oix7.d == null && okx7.v == null) {
                   objArray1 = (oix7.c == null)? 1: 0;
                   if (objArray1) {
                      a2 = ((a2 = oix7.a) == null)? 0: a2.endsWith("/");
                      if (!a2) {
                         v0.h(oix7.f);
                         a2 = new File(uFile1, oix7.a);
                         a2.getParentFile().mkdirs();
                         FileOutputStream uFileOutputS = new FileOutputStream(a2);
                         i6 = 8192;
                         i4 = okx7.read(oyx7.a, i1, i6);
                         while (i4 > 0) {
                            uFileOutputS.write(oyx7.a, i1, i4);
                            i4 = okx7.read(oyx7.a, i1, i6);
                         }
                         uFileOutputS.close();
                      }
                   }
                   v0.i(okx7, oix7.f);
                }else {
                   i6 = 8192;
                }
                if (okx7.t == null && okx7.v == null) {
                   continue ;
                }else if(okx7.v != null){
                   objArray2 = new Object[i1];
                   yx7.g.a("Writing central directory metadata.", objArray2);
                   v0.i(sequenceInpu, oix7.f);
                }
                uFile1 = (((oyy7.h + i)) == oyy7.i)? 1: 0;
                if (!uFile1) {
                   if (oix7.d != null) {
                      objArray1 = new Object[i1];
                      yx7.g.a("Writing slice checkpoint for partial local file header.", objArray1);
                      v0.f(oix7.f, oyy7.h);
                   }else if(okx7.v != null){
                      objArray4 = new Object[i1];
                      yx7.g.a("Writing slice checkpoint for central directory.", objArray4);
                      v0.d(oyy7.h);
                   }else if(oix7.c == null){
                      objArray2 = new Object[i1];
                      yx7.g.a("Writing slice checkpoint for partial file.", objArray2);
                      a2 = oyx7.b.k(oyy7.b, oyy7.c, oyy7.d, oyy7.f);
                      if (!a2.exists()) {
                         a2.mkdirs();
                      }
                      uFile1 = new File(a2, oix7.a);
                      l1 = oix7.b - okx7.c;
                      if (uFile1.length() - l1) {
                         throw new dy7("Partial file is of unexpected size.");
                      }
                   }else {
                      objArray1 = new Object[i1];
                      yx7.g.a("Writing slice checkpoint for partial unextractable file.", objArray1);
                      uFile1 = v0.c();
                      l1 = uFile1.length();
                   }
                   v0.e(uFile1.getCanonicalPath(), l1, okx7.c, oyy7.h);
                }
             }
             ax7 uoax7 = oyx7.d.c();
             b1 = oyy7.b;
             oxx7 = oyy7.j;
             e = oyx7.e;
             _monitor_enter(e);
             double d1 = ((double)oyy7.h + 0x3ff0000000000000) / (double)oyy7.i;
             e.a.put(b1, Double.valueOf(d1));
             _monitor_exit(e);
             zzbn ozzbn = zzbn.a(b1, 3, 0, oxx7, oxx7, d1, 1, oyy7.e, oyx7.f.a(oyy7.b));
             uoax7.o.post(new t5(uoax7, ozzbn, 28));
             return;
          }
          c.close();
          l = oyy7.h;
          uFile1 = (((l + 1)) == oyy7.i)? 1: 0;
          if (uFile1) {
             try{
                v0.g(l);
             }catch(java.io.IOException e0){
                Throwable throwable = e0;
                objArray = new Object[i];
                objArray[i1] = throwable.getMessage();
                yx7.g.c("Writing extraction finished checkpoint failed with %s.", objArray);
                throw new dy7("Writing extraction finished checkpoint failed.", throwable, oyy7.a);
             }
          }
          Object[] objArray3 = new Object[]{Integer.valueOf(oyy7.h),oyy7.f,oyy7.b,Integer.valueOf(oyy7.a)};
          yx7.g.e("Extraction finished for chunk %s of slice %s of pack %s of session %s.", objArray3);
          i28 oi28 = oyx7.c.c();
          yy7 a3 = oyy7.a;
          b1 = oyy7.b;
          h = oyy7.f;
          xx7 h1 = oyy7.h;
          try{
             oi28.g(a3, b1, h1, h);
             oyy7.l.close();
          }catch(java.io.IOException e0){
             objArray = new Object[3];
             objArray[i1] = Integer.valueOf(oyy7.h);
             objArray[i] = oyy7.f;
             objArray[2] = oyy7.b;
             yx7.g.f("Could not close file for chunk %s of slice %s of pack %s.", objArray);
          }
          if (oyy7.k == 3) {
          }else {
             return;
          }
       }catch(java.io.IOException e0){
          objArray = new Object[i];
          objArray[i1] = e0.getMessage();
          yx7.g.c("IOException during extraction %s.", objArray);
          objArray = new Object[4];
          objArray[i1] = Integer.valueOf(oyy7.h);
          objArray[i] = oyy7.f;
          objArray[2] = oyy7.b;
          objArray[3] = Integer.valueOf(oyy7.a);
          throw new dy7(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", objArray), e0, oyy7.a);
       }
    }
}
