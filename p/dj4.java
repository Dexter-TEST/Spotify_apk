package p.dj4;
import p.yg3;
import java.nio.file.attribute.FileTime;
import java.lang.Long;
import p.aq3;
import java.lang.Number;
import p.m95;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.nio.file.Path;
import java.nio.file.CopyOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import p.i51;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.LinkOption;
import java.lang.Class;
import p.ir2;

public final class dj4 extends yg3	// class@0001bc from classes2.dex
{

    public void dj4(){
       super();
    }
    public static Long m(FileTime p0){
       Long longx = Long.valueOf(aq3.f(p0));
       int i = (longx.longValue())? 1: 0;
       if (!i) {
          longx = null;
       }
       return longx;
    }
    public final void b(m95 p0,m95 p1){
       co5.o(p0, "source");
       String str = "target";
       try{
          co5.o(p1, str);
          CopyOption[] uCopyOptionA = new CopyOption[]{StandardCopyOption.ATOMIC_MOVE,StandardCopyOption.REPLACE_EXISTING};
          Files.move(p0.d(), p1.d(), uCopyOptionA);
          return;
       }catch(java.nio.file.NoSuchFileException e4){
          throw new FileNotFoundException(e4.getMessage());
       }catch(java.lang.UnsupportedOperationException e0){
          throw new IOException("atomic move not supported");
       }
    }
    public final i51 i(m95 p0){
       Path path;
       FileTime uFileTime;
       Long longx3;
       co5.o(p0, "path");
       path = p0.d();
       try{
          int i = 0;
          LinkOption[] linkOptionAr = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
          BasicFileAttributes uBasicFileAt = Files.readAttributes(path, BasicFileAttributes.class, linkOptionAr);
          path = (uBasicFileAt.isSymbolicLink())? Files.readSymbolicLink(path): i;
          boolean b = uBasicFileAt.isRegularFile();
          boolean b1 = uBasicFileAt.isDirectory();
          m95 om95 = (path != null)? ir2.u(path.toString(), 0): i;
          Long longx = Long.valueOf(uBasicFileAt.size());
          Long longx1 = ((uFileTime = uBasicFileAt.creationTime()) != null)? dj4.m(uFileTime): i;
          Long longx2 = ((uFileTime = uBasicFileAt.lastModifiedTime()) != null)? dj4.m(uFileTime): i;
          if ((uFileTime = uBasicFileAt.lastAccessTime()) != null) {
             longx3 = dj4.m(uFileTime);
          }
          i51 linkOptionAr1 = new i51(b, b1, om95, longx, longx1, longx2, longx3);
          return linkOptionAr;
       }catch(java.nio.file.NoSuchFileException e0){
          return e0;
       }catch(java.nio.file.FileSystemException e0){
       }
    }
    public final String toString(){
       return "NioSystemFileSystem";
    }
}
