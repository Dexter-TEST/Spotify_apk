package p.lr0;
import p.mv5;
import android.content.UriMatcher;
import java.lang.String;
import android.content.Context;
import p.cv5;
import android.net.Uri;
import java.lang.Object;
import android.provider.ContactsContract$Contacts;
import p.dm5;
import android.content.ContentResolver;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.ud5;
import p.nn6;

public final class lr0 extends mv5	// class@001da8 from classes.dex
{
    public final Context a;
    public static final UriMatcher b;

    static {
       UriMatcher uriMatcher = new UriMatcher(-1);
       lr0.b = uriMatcher;
       uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
       uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
       uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
       uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
       uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }
    public void lr0(Context p0){
       super();
       this.a = p0;
    }
    public final boolean b(cv5 p0){
       cv5 c = p0.c;
       boolean b = ("content".equals(c.getScheme()) && (ContactsContract$Contacts.CONTENT_URI.getHost().equals(c.getHost()) && lr0.b.match(p0.c) != -1))? true: false;
       return b;
    }
    public final dm5 e(cv5 p0,int p1){
       InputStream inputStream;
       Uri uri;
       ContentResolver contentResol = this.a.getContentResolver();
       p0 = p0.c;
       int i = lr0.b.match(p0);
       dm5 uodm5 = null;
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   throw new IllegalStateException("Invalid uri: "+p0);
                }
             }else {
             label_003d :
                inputStream = ContactsContract$Contacts.openContactPhotoInputStream(contentResol, p0, b);
             }
          }
          inputStream = contentResol.openInputStream(p0);
       }else if((uri = ContactsContract$Contacts.lookupContact(contentResol, p0)) == null){
          inputStream = uodm5;
       }else {
          goto label_003d ;
       }
       if (inputStream == null) {
          return uodm5;
       }else {
          return new dm5(xe7.d0(inputStream), ud5.c);
       }
    }
}
