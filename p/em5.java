package p.em5;
import p.xa4;
import p.eg3;
import java.lang.String;
import p.ne;
import java.util.Collection;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Object;

public abstract class em5 extends xa4	// class@0014b7 from classes.dex
{
    public final Collection b;
    public String c;

    public void em5(eg3 p0,String p1,ne p2,Collection p3){
       super(p0, p1, p2);
       this.b = p3;
    }
    public final String a(){
       em5 tc;
       em5 tb;
       StringBuilder str;
       int i;
       if ((tc = this.c) == null && (tb = this.b) != null) {
          str = new StringBuilder(100);
          if ((i = tb.size()) == 1) {
             str = str+" \(one known property: \""+String.valueOf(tb.iterator().next())+'"';
          }else {
             str = str+" \("+i+" known properties: ";
             Iterator iterator = tb.iterator();
             while (iterator.hasNext()) {
                str = str.append('"').append(String.valueOf(iterator.next())).append('"');
                if (str.length() > 1000) {
                   str = str+" [truncated]";
                   break ;
                }else if(iterator.hasNext()){
                   str = str.append(", ");
                }
             }
          }
          str = str+"]\)";
          this.c = str;
       }
       return str;
    }
}
