package p.q76;
import p.xz4;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.lang.Object;
import p.mk7;
import java.lang.String;
import p.co5;
import java.lang.CharSequence;
import p.av6;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import p.ll1;
import p.fl3;
import java.util.List;
import java.lang.Runnable;
import p.kn;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.b86;
import p.s76;

public final class q76 implements xz4	// class@002349 from classes.dex
{
    public final SearchFragment a;

    public void q76(SearchFragment p0){
       this.a = p0;
       super();
    }
    public final void b(Object p0){
       String str2;
       SearchFragment a1;
       co5.l(p0, "it");
       q76 ta = this.a;
       ta.u();
       mk7 a = p0.a;
       void ovoid = null;
       String str = "";
       if (av6.p0(a)) {
          if ((p0 = ta.b) != null) {
             ta.x(p0.getInitialText(), str, str);
             ta.z(false, 0);
             ta.y(true);
             ta.A(false);
          }else {
             co5.N("searchConfig");
             throw ovoid;
          }
       }else {
          mk7 d = p0.d;
          if (p0.c == null || d != null) {
             String str1 = "rvAdapter";
             if (d != null) {
                ta.z(true, 300);
                ta.y(false);
                ta.A(false);
                if ((p0 = ta.A) != null) {
                   p0.t.b(ll1.a, ovoid);
                }else {
                   co5.N(str1);
                   throw ovoid;
                }
             }else if(p0.e != null){
                p0 = ta.getString(R.string.allboarding_request_error_title);
                co5.l(p0, "getString\(R.string.allbo…ding_request_error_title\)");
                str2 = ta.getString(R.string.allboarding_request_error_message);
                co5.l(str2, "getString\(R.string.allbo…ng_request_error_message\)");
                str1 = ta.getString(R.string.allboarding_request_error_dialog_retry);
                co5.l(str1, "getString\(R.string.allbo…quest_error_dialog_retry\)");
                ta.x(p0, str2, str1);
                ta.z(false, 0);
                ta.y(true);
                ta.A(false);
             }else {
                p0 = p0.b;
                if (p0.isEmpty()) {
                   p0 = new Object[true];
                   p0[0] = a;
                   p0 = ta.getString(R.string.allboarding_search_empty_state_no_result_title, p0);
                   co5.l(p0, "getString\(R.string.allbo…esult_title, queryString\)");
                   str2 = ta.getString(R.string.allboarding_search_empty_state_no_result_body);
                   co5.l(str2, "getString\(R.string.allbo…pty_state_no_result_body\)");
                   ta.x(p0, str2, str);
                   ta.z(false, 0);
                   ta.y(true);
                   ta.A(false);
                }else if((a1 = ta.A) != null){
                   HashSet hashSet = new HashSet();
                   ArrayList uArrayList = new ArrayList();
                   p0 = p0.iterator();
                   while (p0.hasNext()) {
                      Object obj = p0.next();
                      if (hashSet.add(obj.c)) {
                         uArrayList.add(obj);
                      }
                   }
                   a1.t.b(uArrayList, new s76(ta));
                   ta.z(false, 0);
                   ta.A(true);
                   ta.y(false);
                }else {
                   co5.N(str1);
                   throw ovoid;
                }
             }
          }
       }
       ta.u();
       if (ta.L != null) {
          ta.u();
          ta.L = false;
       }
       return;
    }
}
