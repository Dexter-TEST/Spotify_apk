package p.s80;
import java.lang.String;
import p.is7;
import java.util.HashSet;
import p.xl1;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.lang.IllegalArgumentException;

public final class s80	// class@0025d7 from classes.dex
{
    public final String a;
    public final String b;
    public static final String c;
    public static final Set d;

    static {
       s80.c = is7.G("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
       is7.G("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
       is7.G("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
       xl1[] oxl1Array = new xl1[]{new xl1("proto"),new xl1("json")};
       s80.d = Collections.unmodifiableSet(new HashSet(Arrays.asList(oxl1Array)));
    }
    public void s80(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static s80 a(byte[] p0){
       String str = new String(p0, Charset.forName("UTF-8"));
       if (!str.startsWith("1$")) {
          throw new IllegalArgumentException("Version marker missing from extras");
       }
       int i = 2;
       String[] stringArray = str.substring(i).split(Pattern.quote("\\"), i);
       if (stringArray.length != i) {
          throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
       }
       object oobject = stringArray[0];
       if (oobject.isEmpty()) {
          throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
       }
       object oobject1 = stringArray[1];
       if (oobject1.isEmpty()) {
          oobject1 = null;
       }
       return new s80(oobject, oobject1);
    }
}
