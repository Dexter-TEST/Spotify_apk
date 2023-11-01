package p.su6;
import java.io.Serializable;
import java.io.Writer;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Appendable;
import java.lang.String;

public final class su6 extends Writer implements Serializable	// class@00033a from classes2.dex
{
    public final StringBuilder a;

    public void su6(){
       super();
       this.a = new StringBuilder(4);
    }
    public final Writer append(char p0){
       this.a+p0;
       return this;
    }
    public final Writer append(CharSequence p0){
       this.a+p0;
       return this;
    }
    public final Writer append(CharSequence p0,int p1,int p2){
       this.a+p0;
       return this;
    }
    public final Appendable append(char p0){
       this.a+p0;
       return this;
    }
    public final Appendable append(CharSequence p0){
       this.a+p0;
       return this;
    }
    public final Appendable append(CharSequence p0,int p1,int p2){
       this.a+p0;
       return this;
    }
    public final void close(){
    }
    public final void flush(){
    }
    public final String toString(){
       return this.a;
    }
    public final void write(String p0){
       if (p0 != null) {
          this.a+p0;
       }
       return;
    }
    public final void write(char[] p0,int p1,int p2){
       if (p0 != null) {
          this.a+p0;
       }
       return;
    }
}
