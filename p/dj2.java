package p.dj2;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import p.do5;
import java.lang.String;
import p.q12;
import android.accounts.Account;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import android.os.IBinder;
import p.aj2;
import p.bz5;
import p.op0;
import p.qx7;
import p.fp0;
import p.pu7;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p.ou7;
import p.ku7;
import java.util.ArrayList;
import p.gt7;
import java.util.List;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.SignInAccount;
import p.ul2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.HashMap;
import java.util.Map;
import android.net.Uri;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import p.j01;
import com.google.android.gms.auth.api.credentials.Credential;
import p.x52;
import p.v52;
import p.t52;
import p.co5;
import p.bn7;
import p.gt3;
import p.et3;
import p.ht3;
import p.ih3;
import p.ba3;
import p.fj2;

public final class dj2 implements Parcelable$Creator	// class@001359 from classes.dex
{
    public final int a;

    public void dj2(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       String str2;
       String str3;
       int i9;
       int i10;
       boolean i11;
       boolean b;
       int b1;
       int b2;
       String str7;
       String str8;
       boolean b3;
       String str9;
       int i12;
       String str10;
       String str11;
       String str12;
       String str13;
       String str14;
       String str15;
       String str19;
       String str20;
       Object obj = p0;
       int i = 8;
       int i1 = 0;
       int i2 = 1000;
       int i3 = 5;
       String str = "source";
       int i4 = 4;
       int i5 = 3;
       int i6 = 1;
       int i7 = 2;
       String str1 = null;
       int i8 = 0;
       switch (this.a){
           case 0:
             co5.o(obj, str);
             return new fj2(obj);
           case 1:
             co5.o(obj, str);
             return new ba3(obj);
           case 2:
             co5.o(obj, str);
             return new ih3(obj);
           case 3:
             co5.o(obj, str);
             return new ht3(obj);
           case 4:
             co5.o(obj, str);
             return new et3(obj);
           case 5:
             co5.o(obj, str);
             return new gt3(obj);
           case 6:
             co5.o(obj, str);
             return new bn7(obj);
           case 7:
             return new t52(obj);
           case 8:
             return new v52(obj);
           case 9:
             return new x52(obj);
           case 10:
             i = do5.A0(p0);
             str2 = str1;
             str3 = str2;
             Uri uri = str3;
             List list = uri;
             str = list;
             String str4 = str;
             String str5 = str4;
             String str6 = str5;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                i7 = i9 & 0xffff;
                switch (i7){
                    case 1:
                      str2 = do5.m(obj, i9);
                      break;
                    case 2:
                      str3 = do5.m(obj, i9);
                      break;
                    case 3:
                      uri = do5.l(obj, i9, Uri.CREATOR);
                      break;
                    case 4:
                      list = do5.o(obj, i9, IdToken.CREATOR);
                      break;
                    case 5:
                      str = do5.m(obj, i9);
                      break;
                    case 6:
                      str4 = do5.m(obj, i9);
                      break;
                    case 9:
                      str5 = do5.m(obj, i9);
                      break;
                    case 10:
                      str6 = do5.m(obj, i9);
                      break;
                    default:
                      do5.s0(obj, i9);
                }
             }
             do5.q(obj, i);
             Credential obj1 = new Credential(str2, str3, uri, list, str, str4, str5, str6);
             return obj;
             break;
           case 11:
             i = do5.A0(p0);
             i10 = 0;
             i11 = 0;
             b = false;
             b1 = false;
             b2 = false;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      if (i1 != i5) {
                         if (i1 != i4) {
                            if (i1 != i2) {
                               do5.s0(obj, i9);
                            }else {
                               i10 = do5.d0(obj, i9);
                            }
                         }else {
                            i11 = do5.d0(obj, i9);
                         }
                      }else {
                         b2 = do5.Z(obj, i9);
                      }
                   }else {
                      b1 = do5.Z(obj, i9);
                   }
                }else {
                   b = do5.Z(obj, i9);
                }
             }
             do5.q(obj, i);
             CredentialPickerConfig obj2 = new CredentialPickerConfig(i10, i11, b, b1, b2);
             return obj;
             break;
           case 12:
             i = do5.A0(p0);
             String[] stringArray = str1;
             CredentialPickerConfig uCredentialP = stringArray;
             CredentialPickerConfig uCredentialP1 = uCredentialP;
             str7 = uCredentialP1;
             str8 = str7;
             i10 = 0;
             i11 = false;
             b3 = false;
             boolean b4 = false;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i2) {
                   switch (i1){
                       case 1:
                         i11 = do5.Z(obj, i9);
                         break;
                       case 2:
                         i9 = do5.f0(obj, i9);
                         i1 = p0.dataPosition();
                         if (!i9) {
                            stringArray = str1;
                         }else {
                            i1 = i1 + i9;
                            obj.setDataPosition(i1);
                            stringArray = p0.createStringArray();
                         }
                         break;
                       case 3:
                         uCredentialP = do5.l(obj, i9, CredentialPickerConfig.CREATOR);
                         break;
                       case 4:
                         uCredentialP1 = do5.l(obj, i9, CredentialPickerConfig.CREATOR);
                         break;
                       case 5:
                         b3 = do5.Z(obj, i9);
                         break;
                       case 6:
                         str7 = do5.m(obj, i9);
                         break;
                       case 7:
                         str8 = do5.m(obj, i9);
                         break;
                       case 8:
                         b4 = do5.Z(obj, i9);
                         break;
                       default:
                         do5.s0(obj, i9);
                   }
                }else {
                   i10 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             j01 obj3 = new j01(i10, i11, stringArray, uCredentialP, uCredentialP1, b3, str7, str8, b4);
             return obj;
             break;
           case 13:
             i = do5.A0(p0);
             CredentialPickerConfig uCredentialP2 = str1;
             String[] stringArray1 = uCredentialP2;
             str7 = stringArray1;
             str8 = str7;
             i10 = 0;
             b = false;
             b1 = false;
             b3 = false;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i2) {
                   switch (i1){
                       case 1:
                         uCredentialP2 = do5.l(obj, i9, CredentialPickerConfig.CREATOR);
                         break;
                       case 2:
                         b = do5.Z(obj, i9);
                         break;
                       case 3:
                         b1 = do5.Z(obj, i9);
                         break;
                       case 4:
                         i9 = do5.f0(obj, i9);
                         i1 = p0.dataPosition();
                         if (!i9) {
                            stringArray1 = str1;
                         }else {
                            i1 = i1 + i9;
                            obj.setDataPosition(i1);
                            stringArray1 = p0.createStringArray();
                         }
                         break;
                       case 5:
                         b3 = do5.Z(obj, i9);
                         break;
                       case 6:
                         str7 = do5.m(obj, i9);
                         break;
                       case 7:
                         str8 = do5.m(obj, i9);
                         break;
                       default:
                         do5.s0(obj, i9);
                   }
                }else {
                   i10 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             HintRequest obj4 = new HintRequest(i10, uCredentialP2, b, b1, stringArray1, b3, str7, str8);
             return obj;
             break;
           case 14:
             i = do5.A0(p0);
             str9 = str1;
             while (p0.dataPosition() < i) {
                i1 = p0.readInt();
                if ((i12 = i1 & 0xffff) != i6) {
                   if (i12 != i7) {
                      do5.s0(obj, i1);
                   }else {
                      str9 = do5.m(obj, i1);
                   }
                }else {
                   str1 = do5.m(obj, i1);
                }
             }
             do5.q(obj, i);
             return new IdToken(str1, str9);
             break;
           case 15:
             i = do5.A0(p0);
             i9 = 0;
             while (p0.dataPosition() < i) {
                i1 = p0.readInt();
                if ((i12 = i1 & 0xffff) != i6) {
                   if (i12 != i7) {
                      if (i12 != i5) {
                         do5.s0(obj, i1);
                      }else {
                         str1 = do5.k(obj, i1);
                      }
                   }else {
                      i9 = do5.d0(obj, i1);
                   }
                }else {
                   i8 = do5.d0(obj, i1);
                }
             }
             do5.q(obj, i);
             return new ul2(i8, i9, str1);
             break;
           case 16:
             i = do5.A0(p0);
             str9 = str1;
             while (p0.dataPosition() < i) {
                i1 = p0.readInt();
                if ((i12 = i1 & 0xffff) != i7) {
                   if (i12 != i3) {
                      do5.s0(obj, i1);
                   }else {
                      GoogleSignInOptions googleSignIn = do5.l(obj, i1, GoogleSignInOptions.CREATOR);
                   }
                }else {
                   str1 = do5.m(obj, i1);
                }
             }
             do5.q(obj, i);
             return new SignInConfiguration(str1, str9);
             break;
           case 17:
             i9 = do5.A0(p0);
             long l = i1;
             str10 = str1;
             str11 = str10;
             str12 = str11;
             str13 = str12;
             str14 = str13;
             str7 = str14;
             str15 = str7;
             String str16 = str15;
             String str17 = str16;
             String str18 = str17;
             i10 = 0;
             while (p0.dataPosition() < i9) {
                i1 = p0.readInt();
                i12 = i1 & 0xffff;
                switch (i12){
                    case 1:
                      i10 = do5.d0(obj, i1);
                      break;
                    case 2:
                      str10 = do5.m(obj, i1);
                      break;
                    case 3:
                      str11 = do5.m(obj, i1);
                      break;
                    case 4:
                      str12 = do5.m(obj, i1);
                      break;
                    case 5:
                      str13 = do5.m(obj, i1);
                      break;
                    case 6:
                      str14 = do5.l(obj, i1, Uri.CREATOR);
                      break;
                    case 7:
                      str7 = do5.m(obj, i1);
                      break;
                    case 8:
                      do5.C0(obj, i1, i);
                      l = p0.readLong();
                      break;
                    case 9:
                      str15 = do5.m(obj, i1);
                      break;
                    case 10:
                      str16 = do5.o(obj, i1, Scope.CREATOR);
                      break;
                    case 11:
                      str17 = do5.m(obj, i1);
                      break;
                    case 12:
                      str18 = do5.m(obj, i1);
                      break;
                    default:
                      do5.s0(obj, i1);
                }
             }
             do5.q(obj, i9);
             GoogleSignInAccount obj5 = new GoogleSignInAccount(i10, str10, str11, str12, str13, str14, str7, l, str15, str16, str17, str18);
             return obj;
             break;
           case 18:
             i = do5.A0(p0);
             str19 = str1;
             str10 = str19;
             str14 = str10;
             str7 = str14;
             str20 = str7;
             int i13 = 0;
             b = false;
             b1 = false;
             b2 = false;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                i1 = i9 & 0xffff;
                switch (i1){
                    case 1:
                      i13 = do5.d0(obj, i9);
                      break;
                    case 2:
                      str19 = do5.o(obj, i9, Scope.CREATOR);
                      break;
                    case 3:
                      Parcelable parcelable = do5.l(obj, i9, Account.CREATOR);
                      break;
                    case 4:
                      b = do5.Z(obj, i9);
                      break;
                    case 5:
                      b1 = do5.Z(obj, i9);
                      break;
                    case 6:
                      b2 = do5.Z(obj, i9);
                      break;
                    case 7:
                      str14 = do5.m(obj, i9);
                      break;
                    case 8:
                      str7 = do5.m(obj, i9);
                      break;
                    case 9:
                      str1 = do5.o(obj, i9, ul2.CREATOR);
                      break;
                    case 10:
                      str20 = do5.m(obj, i9);
                      break;
                    default:
                      do5.s0(obj, i9);
                }
             }
             do5.q(obj, i);
             GoogleSignInOptions obj6 = new GoogleSignInOptions(i13, str19, str10, b, b1, b2, str14, str7, GoogleSignInOptions.c(str1), str20);
             return obj;
             break;
           case 19:
             i9 = do5.A0(p0);
             str2 = "";
             str3 = str2;
             while (p0.dataPosition() < i9) {
                i2 = p0.readInt();
                if ((i3 = i2 & 0xffff) != i4) {
                   if (i3 != 7) {
                      if (i3 != i) {
                         do5.s0(obj, i2);
                      }else {
                         str3 = do5.m(obj, i2);
                      }
                   }else {
                      str1 = do5.l(obj, i2, GoogleSignInAccount.CREATOR);
                   }
                }else {
                   str2 = do5.m(obj, i2);
                }
             }
             do5.q(obj, i9);
             return new SignInAccount(str2, str1, str3);
             break;
           case 20:
             i = do5.A0(p0);
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      do5.s0(obj, i9);
                   }else {
                      str1 = do5.m(obj, i9);
                   }
                }else {
                   i8 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             return new Scope(i8, str1);
             break;
           case 21:
             i = do5.A0(p0);
             str11 = str1;
             str12 = str11;
             str13 = str12;
             i10 = 0;
             i11 = 0;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      if (i1 != i5) {
                         if (i1 != i4) {
                            if (i1 != i2) {
                               do5.s0(obj, i9);
                            }else {
                               i10 = do5.d0(obj, i9);
                            }
                         }else {
                            Parcelable parcelable1 = do5.l(obj, i9, fp0.CREATOR);
                         }
                      }else {
                         Parcelable parcelable2 = do5.l(obj, i9, PendingIntent.CREATOR);
                      }
                   }else {
                      str11 = do5.m(obj, i9);
                   }
                }else {
                   i11 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             Status obj7 = new Status(i10, i11, str11, str12, str13);
             return obj;
             break;
           case 22:
             i = do5.A0(p0);
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      do5.s0(obj, i9);
                   }else {
                      str1 = do5.o(obj, i9, ku7.CREATOR);
                   }
                }else {
                   i8 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             return new gt7(i8, str1);
             break;
           case 23:
             i9 = do5.A0(p0);
             long l1 = i1;
             long l2 = l1;
             i10 = 0;
             i11 = 0;
             b = 0;
             while (p0.dataPosition() < i9) {
                i1 = p0.readInt();
                if ((i12 = i1 & 0xffff) != i6) {
                   if (i12 != i7) {
                      if (i12 != i5) {
                         if (i12 != i4) {
                            if (i12 != i3) {
                               do5.s0(obj, i1);
                            }else {
                               do5.C0(obj, i1, i);
                               l2 = p0.readLong();
                            }
                         }else {
                            do5.C0(obj, i1, i);
                            l1 = p0.readLong();
                         }
                      }else {
                         b = do5.d0(obj, i1);
                      }
                   }else {
                      i11 = do5.d0(obj, i1);
                   }
                }else {
                   i10 = do5.d0(obj, i1);
                }
             }
             do5.q(obj, i9);
             ku7 obj8 = new ku7(i10, i11, b, l1, l2);
             return obj;
             break;
           case 24:
             i = do5.A0(p0);
             str9 = str1;
             i1 = 0;
             while (p0.dataPosition() < i) {
                i12 = p0.readInt();
                if ((i2 = i12 & 0xffff) != i6) {
                   if (i2 != i7) {
                      if (i2 != i5) {
                         if (i2 != i4) {
                            do5.s0(obj, i12);
                         }else {
                            GoogleSignInAccount googleSignIn1 = do5.l(obj, i12, GoogleSignInAccount.CREATOR);
                         }
                      }else {
                         i1 = do5.d0(obj, i12);
                      }
                   }else {
                      str1 = do5.l(obj, i12, Account.CREATOR);
                   }
                }else {
                   i8 = do5.d0(obj, i12);
                }
             }
             do5.q(obj, i);
             return new ou7(i8, str1, i1, str9);
             break;
           case 25:
             i = do5.A0(p0);
             str10 = str1;
             str11 = str10;
             i10 = 0;
             b1 = false;
             b2 = false;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      if (i1 != i5) {
                         if (i1 != i4) {
                            if (i1 != i3) {
                               do5.s0(obj, i9);
                            }else {
                               b2 = do5.Z(obj, i9);
                            }
                         }else {
                            b1 = do5.Z(obj, i9);
                         }
                      }else {
                         Parcelable parcelable3 = do5.l(obj, i9, fp0.CREATOR);
                      }
                   }else {
                      i9 = do5.f0(obj, i9);
                      i1 = p0.dataPosition();
                      if (!i9) {
                         str10 = str1;
                      }else {
                         i1 = i1 + i9;
                         obj.setDataPosition(i1);
                         IBinder iBinder = p0.readStrongBinder();
                      }
                   }
                }else {
                   i10 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             pu7 obj9 = new pu7(i10, str10, str11, b1, b2);
             return obj;
             break;
           case 26:
             i = do5.A0(p0);
             str9 = str1;
             str2 = str9;
             while (p0.dataPosition() < i) {
                i12 = p0.readInt();
                if ((i2 = i12 & 0xffff) != i6) {
                   if (i2 != i7) {
                      if (i2 != i5) {
                         if (i2 != i4) {
                            do5.s0(obj, i12);
                         }else {
                            op0 oop0 = do5.l(obj, i12, op0.CREATOR);
                         }
                      }else {
                         i8 = do5.d0(obj, i12);
                      }
                   }else {
                      q12[] oq12Array = do5.n(obj, i12, q12.CREATOR);
                   }
                }else {
                   str1 = do5.k(obj, i12);
                }
             }
             do5.q(obj, i);
             return new qx7(str1, str9, i8, str2);
             break;
           case 27:
             i = do5.A0(p0);
             str19 = str1;
             str12 = str19;
             i11 = false;
             b = false;
             b2 = 0;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      if (i1 != i5) {
                         if (i1 != i4) {
                            if (i1 != i3) {
                               do5.s0(obj, i9);
                            }else {
                               b2 = do5.d0(obj, i9);
                            }
                         }else {
                            i9 = do5.f0(obj, i9);
                            i1 = p0.dataPosition();
                            if (!i9) {
                               str12 = str1;
                            }else {
                               int[] ointArray = p0.createIntArray();
                               i1 = i1 + i9;
                               obj.setDataPosition(i1);
                            }
                         }
                      }else {
                         b = do5.Z(obj, i9);
                      }
                   }else {
                      i11 = do5.Z(obj, i9);
                   }
                }else {
                   Parcelable parcelable4 = do5.l(obj, i9, bz5.CREATOR);
                }
             }
             do5.q(obj, i);
             op0 obj10 = new op0(str19, i11, b, str12, b2);
             return obj;
             break;
           case 28:
             i = do5.A0(p0);
             str12 = str1;
             str13 = str12;
             str14 = str13;
             str7 = str14;
             str8 = str7;
             str20 = str8;
             str15 = str20;
             String str21 = str15;
             i10 = 0;
             i11 = 0;
             b = 0;
             boolean b5 = false;
             int i14 = 0;
             boolean b6 = false;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                i1 = i9 & 0xffff;
                switch (i1){
                    case 1:
                      i10 = do5.d0(obj, i9);
                      break;
                    case 2:
                      i11 = do5.d0(obj, i9);
                      break;
                    case 3:
                      b = do5.d0(obj, i9);
                      break;
                    case 4:
                      str12 = do5.m(obj, i9);
                      break;
                    case 5:
                      i9 = do5.f0(obj, i9);
                      i1 = p0.dataPosition();
                      if (!i9) {
                         str13 = str1;
                      }else {
                         i1 = i1 + i9;
                         obj.setDataPosition(i1);
                         IBinder iBinder1 = p0.readStrongBinder();
                      }
                      break;
                    case 6:
                      Object[] objArray = do5.n(obj, i9, Scope.CREATOR);
                      break;
                    case 7:
                      Bundle uBundle = do5.k(obj, i9);
                      break;
                    case 8:
                      Parcelable parcelable5 = do5.l(obj, i9, Account.CREATOR);
                      break;
                    case 10:
                      Object[] objArray1 = do5.n(obj, i9, q12.CREATOR);
                      break;
                    case 11:
                      Object[] objArray2 = do5.n(obj, i9, q12.CREATOR);
                      break;
                    case 12:
                      b5 = do5.Z(obj, i9);
                      break;
                    case 13:
                      i14 = do5.d0(obj, i9);
                      break;
                    case 14:
                      b6 = do5.Z(obj, i9);
                      break;
                    case 15:
                      str21 = do5.m(obj, i9);
                      break;
                    default:
                      do5.s0(obj, i9);
                }
             }
             do5.q(obj, i);
             aj2 obj11 = new aj2(i10, i11, b, str12, str13, str14, str7, str8, str20, str15, b5, i14, b6, str21);
             return obj;
             break;
           default:
             i = do5.A0(p0);
             i10 = 0;
             i11 = false;
             b = false;
             b1 = 0;
             b2 = 0;
             while (p0.dataPosition() < i) {
                i9 = p0.readInt();
                if ((i1 = i9 & 0xffff) != i6) {
                   if (i1 != i7) {
                      if (i1 != i5) {
                         if (i1 != i4) {
                            if (i1 != i3) {
                               do5.s0(obj, i9);
                            }else {
                               b2 = do5.d0(obj, i9);
                            }
                         }else {
                            b1 = do5.d0(obj, i9);
                         }
                      }else {
                         b = do5.Z(obj, i9);
                      }
                   }else {
                      i11 = do5.Z(obj, i9);
                   }
                }else {
                   i10 = do5.d0(obj, i9);
                }
             }
             do5.q(obj, i);
             bz5 obj12 = new bz5(i10, i11, b, b1, b2);
             return obj;
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             fj2[] uofj2Array = new fj2[p0];
             return uofj2Array;
           case 1:
             ba3[] uoba3Array = new ba3[p0];
             return uoba3Array;
           case 2:
             ih3[] oih3Array = new ih3[p0];
             return oih3Array;
           case 3:
             ht3[] oht3Array = new ht3[p0];
             return oht3Array;
           case 4:
             et3[] uoet3Array = new et3[p0];
             return uoet3Array;
           case 5:
             gt3[] ogt3Array = new gt3[p0];
             return ogt3Array;
           case 6:
             bn7[] uobn7Array = new bn7[p0];
             return uobn7Array;
           case 7:
             t52[] ot52Array = new t52[p0];
             return ot52Array;
           case 8:
             v52[] ov52Array = new v52[p0];
             return ov52Array;
           case 9:
             x52[] ox52Array = new x52[p0];
             return ox52Array;
           case 10:
             Credential[] uCredentialA = new Credential[p0];
             return uCredentialA;
           case 11:
             CredentialPickerConfig[] uCredentialP = new CredentialPickerConfig[p0];
             return uCredentialP;
           case 12:
             j01[] oj01Array = new j01[p0];
             return oj01Array;
           case 13:
             HintRequest[] hintRequestA = new HintRequest[p0];
             return hintRequestA;
           case 14:
             IdToken[] idTokenArray = new IdToken[p0];
             return idTokenArray;
           case 15:
             ul2[] oul2Array = new ul2[p0];
             return oul2Array;
           case 16:
             SignInConfiguration[] signInConfig = new SignInConfiguration[p0];
             return signInConfig;
           case 17:
             GoogleSignInAccount[] googleSignIn = new GoogleSignInAccount[p0];
             return googleSignIn;
           case 18:
             GoogleSignInOptions[] googleSignIn1 = new GoogleSignInOptions[p0];
             return googleSignIn1;
           case 19:
             SignInAccount[] signInAccoun = new SignInAccount[p0];
             return signInAccoun;
           case 20:
             Scope[] scopeArray = new Scope[p0];
             return scopeArray;
           case 21:
             Status[] statusArray = new Status[p0];
             return statusArray;
           case 22:
             gt7[] ogt7Array = new gt7[p0];
             return ogt7Array;
           case 23:
             ku7[] oku7Array = new ku7[p0];
             return oku7Array;
           case 24:
             ou7[] oou7Array = new ou7[p0];
             return oou7Array;
           case 25:
             pu7[] opu7Array = new pu7[p0];
             return opu7Array;
           case 26:
             qx7[] oqx7Array = new qx7[p0];
             return oqx7Array;
           case 27:
             op0[] oop0Array = new op0[p0];
             return oop0Array;
           case 28:
             aj2[] uoaj2Array = new aj2[p0];
             return uoaj2Array;
           default:
             bz5[] uobz5Array = new bz5[p0];
             return uobz5Array;
       }
    }
}
