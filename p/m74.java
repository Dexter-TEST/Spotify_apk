package p.m74;
import java.io.Serializable;
import p.y0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.security.MessageDigest;
import p.ap5;
import java.lang.AssertionError;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import p.w51;
import p.k74;
import p.l74;

public final class m74 extends y0 implements Serializable	// class@001e3d from classes.dex
{
    public final MessageDigest a;
    public final int b;
    public final boolean c;
    public final String t;

    public void m74(String p0,int p1,String p2){
       boolean b1;
       super();
       p2.getClass();
       try{
          this.t = p2;
          MessageDigest instance = MessageDigest.getInstance(p0);
          this.a = instance;
          int digestLength = instance.getDigestLength();
          boolean b = (p1 >= 4 && p1 <= digestLength)? true: false;
          ap5.c(p1, digestLength, "bytes \(%s\) must be >= 4 and < %s", b);
          try{
             this.b = p1;
             instance.clone();
          }catch(java.lang.CloneNotSupportedException e0){
             b1 = false;
          }
          this.c = b1;
          return;
       }catch(java.security.NoSuchAlgorithmException e5){
          throw new AssertionError(e5);
       }
    }
    public void m74(String p0,String p1){
       boolean b;
       try{
          super();
          MessageDigest instance = MessageDigest.getInstance(p0);
          this.a = instance;
          this.b = instance.getDigestLength();
          try{
             this.t = p1;
             instance.clone();
             b = true;
          }catch(java.lang.CloneNotSupportedException e0){
             b = false;
          }
          this.c = b;
          return;
       }catch(java.security.NoSuchAlgorithmException e2){
          throw new AssertionError(e2);
       }
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Use SerializedForm");
    }
    public final w51 b(){
       m74 tb = this.b;
       m74 ta = this.a;
       if (this.c != null) {
          return new k74(ta.clone(), tb);
       }
       String algorithm = ta.getAlgorithm();
       try{
          return new k74(MessageDigest.getInstance(algorithm), tb);
       }catch(java.security.NoSuchAlgorithmException e0){
          throw new AssertionError(e0);
       }
    }
    public final String toString(){
       return this.t;
    }
    public Object writeReplace(){
       return new l74(this.a.getAlgorithm(), this.b, this.t);
    }
}
