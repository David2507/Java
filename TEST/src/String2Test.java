import java.util.Locale;

public class String2Test {

//    public String doubleChar(String str) {
//        String a = "";
//        for (int i = 0; i < str.length(); i++) {
//            a = a + str.charAt(i) + str.charAt(i);
//        }
//        return a;
//    }


//    public int countHi(String str) {
//        int a = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.substring(i, i + 2).equals("hi")) {
//                a++;
//            }
//        }
//        return a;
//    }


//    public boolean catDog(String str) {
//        int len = str.length();
//        int cat = 0;
//        int dog = 0;
//        for (int i = 0; i < len - 2; i++) {
//            String temp = str.substring(i, i+3);
//            if (temp.compareTo("cat") == 0)
//            cat++;
//            if (temp.compareTo("dog") == 0)
//            dog++;
//        }
//        if (cat == dog)
//        return true;
//  else
//        return false;
//    }


//    public int countCode(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length() - 3; i++)
//            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
//                count++;
//            }
//        return count;
//
//    }


//    public boolean endOther(String a, String b) {
//        a = a.toLowerCase();
//        int an = a.length();
//        b = b.toLowerCase();
//        int bn = b.length();
//        if (an < bn) {
//            String temp = b.substring(bn - an, bn);
//            if (temp.compareTo(a) == 0)
//                return true;
//            else
//                return false;
//        } else {
//            String temp = a.substring(an - bn, an);
//            if (temp.compareTo(b)==0)
//                return true;
//            else
//                return false;
//        }
//    }


//    public boolean xyzThere(String str) {
//        if (str.contains("xyz")) {
//            return true;
//        }
//        for (int i = 0; i < str.length() - 2; i++) {
//            if (str.substring(i, i + 3).equals("xyz")) {
//                if (i == 0) {
//                    return true;
//                } else if (str.charAt(i - 1) != ('.')) {
//                    return false;
//                }
//            }
//        }
//        return false;
//    }


//    public boolean bobThere(String str) {
//        if (str.contains("bob")){
//            return true;
//        }
//        for (int i = 0; i < str.length() - 2; i++) {
//            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') {
//                return true;
//            }
//        }
//        return false;
//
//    }


//    public boolean xyBalance(String str) {
//        if (str.equals("")){
//            return true;
//        }
//        if (str.equals("y")){
//            return true;
//        }
//        if (str.equals("x")){
//            return false;
//        }
//        for (int i = 0; i < str.length()-1; i++) {
//            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y') {
//                return true;
//            }
//        }
//        return false;
//    }kisat


//    public String mixString(String a, String b) {
//        int min = Math.min(a.length(),b.length());
//        String text= "";
//        for(int i = 0; i < min; i++) {
//            text = text + a.charAt(i) + b.charAt(i);
//        }
//        return text = text + b.substring(min) + a.substring(min);
//    }


//    public String repeatEnd(String str, int n) {
//        int a = str.length();
//        String text = "";
//        for (int i = 0;i<n;i++){
//            text = text + str.substring(a - n, a);
//        }
//        return text;
//
//    }


//    public String repeatFront(String str, int n) {
//        int a = str.length();
//        String text = "";
//        for (int i = n; n>0 ; n--){
//            text= text + str.substring(0,n);
//            }
//        return text;
//
//    }


//    public String repeatSeparator(String word, String sep, int count) {
//        if (count==0){
//            return "";
//        }
//        String text = word;
//        for (int i = 1;i<count;i++) {
//            text = text + sep + word;
//        }
//        return text;
//
//    }


//    public boolean xyzMiddle(String str) {
//        String a = str.substring(0, str.length() / 2 - 1);
//        String b = str.substring(str.length() / 2 + 1);
//        String c = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
//        if (c.equals("xyz")) {
//            return true;
//        }
//
//        return false;
//    }//kisat




//    public boolean sameStarChar(String str) {
//        for (int i = 1; i < str.length() - 1; i++) {
//            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
//                return false;
//            }
//        }
//        return true;
//
//    }




//    public String oneTwo(String str) {
//        String a = "";
//        for(int i=0; i <str.length()-2; i += 3)
//        {
//            a = a + str.substring(i+1,i+3) + str.charAt(i);
//        }
//        return a;
//    }




}