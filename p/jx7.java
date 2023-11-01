package p.jx7;
import p.hy7;
import java.lang.Object;
import java.lang.String;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import p.jy7;
import p.i28;
import p.vj1;
import p.xe7;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import p.dy7;
import java.lang.Integer;
import java.lang.Exception;

public final class jx7	// class@001b66 from classes.dex
{
    public final hy7 a;

    public void jx7(hy7 p0){
       this.a = p0;
    }
    public final ParcelFileDescriptor$AutoCloseInputStream a(int p0,String p1,int p2,String p3){
       int i;
       ParcelFileDescriptor parcelFileDe;
       vj1 ovj1 = this.a.c().c(p0, p1, p2, p3);
       try{
          i = 4;
          if ((parcelFileDe = xe7.c(ovj1)) != null && parcelFileDe.getFileDescriptor() != null) {
             return new ParcelFileDescriptor$AutoCloseInputStream(parcelFileDe);
          }
          Object[] objArray1 = new Object[i];
          objArray1[0] = Integer.valueOf(p0);
          objArray1[1] = p1;
          objArray1[2] = p3;
          objArray1[3] = Integer.valueOf(p2);
          throw new dy7(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", objArray1), p0);
       }catch(java.util.concurrent.ExecutionException e0){
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p3;
          objArray[3] = Integer.valueOf(p2);
          throw new dy7(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", objArray), e0, p0);
       }catch(java.lang.InterruptedException e10){
          throw new dy7("Extractor was interrupted while waiting for chunk file.", e10, p0);
       }
    }
}
