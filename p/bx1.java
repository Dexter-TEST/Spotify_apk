package p.bx1;
import java.io.DataInput;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.lang.Math;
import java.io.EOFException;
import java.lang.String;
import p.tp2;
import java.lang.UnsupportedOperationException;
import java.lang.Double;
import java.lang.Float;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Object;

public class bx1 extends InputStream implements DataInput	// class@001151 from classes.dex
{
    public final DataInputStream a;
    public ByteOrder b;
    public int c;
    public byte[] t;
    public static final ByteOrder v;
    public static final ByteOrder w;

    static {
       bx1.v = ByteOrder.LITTLE_ENDIAN;
       bx1.w = ByteOrder.BIG_ENDIAN;
    }
    public void bx1(InputStream p0){
       super(p0, ByteOrder.BIG_ENDIAN);
    }
    public void bx1(InputStream p0,ByteOrder p1){
       super();
       this.b = ByteOrder.BIG_ENDIAN;
       DataInputStream uDataInputSt = new DataInputStream(p0);
       this.a = uDataInputSt;
       uDataInputSt.mark(0);
       this.c = 0;
       this.b = p1;
    }
    public void bx1(byte[] p0){
       super(new ByteArrayInputStream(p0), ByteOrder.BIG_ENDIAN);
    }
    public final int available(){
       return this.a.available();
    }
    public final void b(int p0){
       int i3;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < p0) {
             bx1 ta = this.a;
             int i2 = p0 - i1;
             if ((i3 = (int)ta.skip((long)i2)) <= 0) {
                i3 = 8192;
                if (this.t == null) {
                   byte[] uobyteArray = new byte[i3];
                   this.t = uobyteArray;
                }
                if ((i3 = ta.read(this.t, i, Math.min(i3, i2))) == -1) {
                   break ;
                }
             }
             i1 = i1 + i3;
          }else {
             this.c = this.c + i1;
             return;
          }
       }
       throw new EOFException(tp2.l("Reached EOF while skipping ", p0, " bytes."));
    }
    public final void mark(int p0){
       throw new UnsupportedOperationException("Mark is currently unsupported");
    }
    public final int read(){
       this.c = this.c + 1;
       return this.a.read();
    }
    public final int read(byte[] p0,int p1,int p2){
       int i = this.a.read(p0, p1, p2);
       this.c = this.c + i;
       return i;
    }
    public final boolean readBoolean(){
       this.c = this.c + 1;
       return this.a.readBoolean();
    }
    public final byte readByte(){
       int i;
       this.c = this.c + 1;
       if ((i = this.a.read()) >= 0) {
          return (byte)i;
       }
       throw new EOFException();
    }
    public final char readChar(){
       this.c = this.c + 2;
       return this.a.readChar();
    }
    public final double readDouble(){
       return Double.longBitsToDouble(this.readLong());
    }
    public final float readFloat(){
       return Float.intBitsToFloat(this.readInt());
    }
    public final void readFully(byte[] p0){
       this.c = this.c + p0.length;
       this.a.readFully(p0);
    }
    public final void readFully(byte[] p0,int p1,int p2){
       this.c = this.c + p2;
       this.a.readFully(p0, p1, p2);
    }
    public final int readInt(){
       bx1 tb;
       this.c = this.c + 4;
       bx1 ta = this.a;
       int i = ta.read();
       int i1 = ta.read();
       int i2 = ta.read();
       int i3 = ta.read();
       if (((((i | i1) | i2) | i3)) < 0) {
          throw new EOFException();
       }
       if ((tb = this.b) == bx1.v) {
          return ((((i3 << 24) + (i2 << 16)) + (i1 << 8)) + i);
       }
       if (tb == bx1.w) {
          return ((((i << 24) + (i1 << 16)) + (i2 << 8)) + i3);
       }
       throw new IOException("Invalid byte order: "+this.b);
    }
    public final String readLine(){
       return null;
    }
    public final long readLong(){
       bx1 b;
       bx1 uobx1 = this;
       uobx1.c = uobx1.c + 8;
       bx1 a = uobx1.a;
       int i = a.read();
       int i1 = a.read();
       int i2 = a.read();
       int i3 = a.read();
       int i4 = a.read();
       int i5 = a.read();
       int i6 = a.read();
       int i7 = a.read();
       if (((((((((i | i1) | i2) | i3) | i4) | i5) | i6) | i7)) < 0) {
          throw new EOFException();
       }
       if ((b = uobx1.b) == bx1.v) {
          return (((((((((long)i7 << 56) + ((long)i6 << 48)) + ((long)i5 << 40)) + ((long)i4 << 32)) + ((long)i3 << 24)) + ((long)i2 << 16)) + ((long)i1 << 8)) + (long)i);
       }
       int i8 = i;
       if (b == bx1.w) {
          return (((((((((long)i8 << 56) + ((long)i1 << 48)) + ((long)i2 << 40)) + ((long)i3 << 32)) + ((long)i4 << 24)) + ((long)i5 << 16)) + ((long)i6 << 8)) + (long)i7);
       }
       throw new IOException("Invalid byte order: "+uobx1.b);
    }
    public final short readShort(){
       bx1 tb;
       this.c = this.c + 2;
       bx1 ta = this.a;
       int i = ta.read();
       int i1 = ta.read();
       if (((i | i1)) < 0) {
          throw new EOFException();
       }
       if ((tb = this.b) == bx1.v) {
          return (short)((i1 << 8) + i);
       }
       if (tb == bx1.w) {
          return (short)((i << 8) + i1);
       }
       throw new IOException("Invalid byte order: "+this.b);
    }
    public final String readUTF(){
       this.c = this.c + 2;
       return this.a.readUTF();
    }
    public final int readUnsignedByte(){
       this.c = this.c + 1;
       return this.a.readUnsignedByte();
    }
    public final int readUnsignedShort(){
       bx1 tb;
       this.c = this.c + 2;
       bx1 ta = this.a;
       int i = ta.read();
       int i1 = ta.read();
       if (((i | i1)) < 0) {
          throw new EOFException();
       }
       if ((tb = this.b) == bx1.v) {
          return ((i1 << 8) + i);
       }
       if (tb == bx1.w) {
          return ((i << 8) + i1);
       }
       throw new IOException("Invalid byte order: "+this.b);
    }
    public final void reset(){
       throw new UnsupportedOperationException("Reset is currently unsupported");
    }
    public final int skipBytes(int p0){
       throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
