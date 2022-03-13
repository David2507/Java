import java.io.Serializable;
import java.util.Locale;

public class String1Test {
//    public int arrayCount9(int[] nums) {
//        int a = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 9) {
//                a++;
//            }
//        }
//
//        return a;
//    }


//    public boolean arrayFront9(int[] nums) {
//        int number = nums.length;
//        if (number > 4) {
//            number = 4;
//        }
//        for (int i = 0; i < number; i++) {
//            if (nums[i] == 9) {
//                return true;
//            }
//        }
//        return false;
//    }


//    public boolean array123(int[] nums) {
//        for (int i = 0; i < (nums.length - 2); i++) {
//            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
//                return true;
//            }
//        }
//
//return false;
//    }


//    public String helloName(String name) {
//        String anun = "Hello ";
//        return anun + name;
//    }


//    public String makeAbba(String a, String b) {
//        return a + b + b + a;
//
//    }

//    public String makeTags(String tag, String word) {
//        String a = "<" +tag + ">";
//        String b = "</" + tag + ">";
//        return a + word + b;
//
//    }


//    public String makeOutWord(String out, String word) {
//        String a = out.substring(0,2);
//        String b = out.substring(2,4);
//        return a + word + b;
//
//
//    }


//    public String extraEnd(String str) {
//
//        String a = str.substring(str.length() - 2);
//        return a + a + a;
//
//
//    }


//    public String firstTwo(String str) {
//        if (str.length()< 2)
//            return str;
//        String a = str.substring(0,2);
//        return a;
//
//    }




//    public String firstHalf(String str) {
//        String a = str.substring(0,str.length()/2);
//        return a;
//
//    }




//    public String withoutEnd(String str) {
//        String a = str.substring(1,str.length()-1);
//        return a;
//
//    }



//    public String comboString(String a, String b) {
//        if (a.length() < b.length()) {
//            return a + b + a;
//        } else
//            return b + a + b;
//    }



//    public String nonStart(String a, String b) {
//        String c = a.substring(1,a.length());
//        String d = b.substring(1,b.length());
//        return c + d;
//
//    }

//
//    public String left2(String str) {
//
//        return str.substring( str.length() - 2)+ str.substring(0, str.length()-2);
//
//    }




//    public String withouEnd2(String str) {
//        if (str.length()< 1)
//            return "";
//        return str.substring(1,str.length()-1);
//
//
//    }




//    public boolean endsLy(String str) {
//        if (str.endsWith("ly")){
//            return true;
//        }
//        else return false;
//
//
//    }




//    public String atFirst(String str) {
//        if (str.length() == 1) {
//            return str + "@";
//        }
//            if (str.length() == 0){
//                return "@@";
//
//        } else
//            return str.substring(0, 2);
//    }



//    public String nTwice(String str, int n) {
//        String a = str.substring(0,n);
//        String b = str.substring(str.length() - n);
//        return a + b;
//
//    }




//    public String lastChars(String a, String b) {
//        if (a.length() >= 2 && b.length() == 0) {
//            return a.substring(0, 1) + "@";
//        }
//        if (a.length() == 0 && b.length()>= 2) {
//            return "@"+ b.substring(b.length() - 1);
//        }
//        if (a.length() == 0 && b.length() == 0) {
//            return "@@";
//        }
//        String c = a.substring(0, 1);
//        String d = b.substring(b.length() - 1);
//        return c + d;
//
//    }




//    public String lastTwo(String str) {
//        if (str.length() == 1){
//            return str;
//        }
//        if (str.length()==0){
//            return "";
//        }
//        String a = str.substring(0,str.length()-2);
//        String b = str.substring(str.length()-2,str.length()-1);
//        String c = str.substring(str.length()-1);
//
//        return a + c + b;
//
//    }


//    public boolean frontAgain(String str) {
//        if (str.length()<=1 ){
//        return false;
//    }
//        String a = str.substring(0, 2);
//        String b = str.substring(str.length() - 2);
//
//        if (a.equals(b)) {
//            return true;
//        }
//        if (str.length() == 0){
//            return false;
//        }
//
//        return false;
//    }


//    public String withoutX(String str) {
//        if (str.equals("x")){
//            return "";
//        }
//        if (str.equals("")){
//            return "";
//        }
//        String a = str.substring(0, 1);
//        String b = str.substring(str.length() - 1);
//        if (a.equals(b)) {
//            return str.substring(1, str.length() - 1);
//        }
//
//        if (str.charAt(0) == 'x') {
//            return str.substring(1);
//        }
//        if (str.substring(str.length() - 1).equals("x")) {
//            return str.substring(0, str.length() - 1);
//        }
//        return str;
//    }

//    public String withoutX2(String str) {
//        if (str.equals("")){
//            return "";
//        }
//        if (str.equals("x")){
//            return "";
//        }
//        if (str.charAt(0) == 'x' && str.charAt(1) == 'x'){
//            return str.substring(2);
//        }
//        if (str.charAt(0) == 'x'){
//            return str.substring(1);
//        }
//        if (str.charAt(1) == 'x'){
//            return str.charAt(0) + str.substring(2);
//        }
//        return str;
//
//    }


//    public String extraFront(String str) {
//        if (str.length() <= 2) {
//            return str + str + str;
//        }
//        String a = str.substring(0, 2);
//        return a + a + a;
//
//    }

//    public String middleThree(String str) {
//        if (str.length() <= 3){
//            return str;
//        }
//        return str.substring((str.length()/2 -1),(str.length()/2 +1)) ;
//    }

//    public boolean hasBad(String str) {
//        if (str.equals("")){
//            return false;
//        }
//        if (str.equals("bad")){
//            return true;
//        }
//        if (str.equals("ba")) {
//            return false;
//        }
//        if (str.equals("xba")) {
//            return false;
//        }
//        String a = str.substring(0, 3);
//        String b = str.substring(1, 4);
//
//        if (a.equals("bad")) {
//            return true;
//        }
//        if (b.equals("bad")) {
//            return true;
//        }
//
//        else return false;
//    }


//    public String conCat(String a, String b) {
//        if (b.equals("")){
//            return a;
//        }
//        if (a.equals("")){
//            return b;
//        }
//        String c = a.substring(a.length()-1);
//        String d = b.substring(0,1);
//        if (c.equals(d)){
//            return a + b.substring(1);
//        }
//        return a + b;
//
//    }


//    public String seeColor(String str) {
//        if (str.equals("")){
//            return "";
//        }
//        if (str.equals("red")){
//            return "red";
//        }
//        if (str.length()<=3){
//            return "";
//        }
//       if (str.substring(0, 3).equals("red") ){
//           return "red";
//       }
//       if (str.substring(0,4).equals("blue")){
//           return "blue";
//       }
//       return "";
//
//    }


//    public String minCat(String a, String b) {
//        if (a.length()< b.length()){
//            return a +(b.substring(b.length()-a.length()));
//        }
//        return (a.substring(a.length()-b.length()) + b);
//
//    }


//    public String without2(String str) {
//        if (str.length() <= 2 ){
//            return "";
//        }
//        if (str.equals("x")){
//            return "x";
//        }
//        if (str.substring(0,2).equals(str.substring(str.length()-2))){
//            return str.substring(2);
//        }
//        return str;
//
//    }

//    public String deFront(String str) {
//        if (str.charAt(0) == 'a' && str.charAt(1) == 'b'){
//            return str;
//        }
//        if (str.charAt(0) == 'a'){
//            return str.charAt(0) +str.substring(2);
//        }
//        if (str.charAt(1) == 'b'){
//            return str.substring(1);
//        }
//        return str.substring(2);
//
//    }


//    public String startWord(String str, String word) {
//        if (str.equals("") && word.length() == 1) {
//            return "";
//        }
//        if (word.length() == 1) {
//            return str.substring(0, 1);
//        }
//        if (str.length() < word.length()) {
//            return "";
//        }
//
//        if (str.substring(1).equals(word.substring(1))){
//            return str;
//        }
//        if (word.length() == 2 && str.substring(0, 2).equals(word.substring(0, 2))) {
//            return str.substring(0, 2);
//        }
//        if (word.length() == 2 && str.substring(1, 2).equals(word.substring(1, 2))) {
//            return str.substring(0, 2);
//        }
//        if (word.length() == 2 && !(str.substring(1, 2).equals(word.substring(1, 2)))) {
//            return "";
//        }
//        if (!(str.substring(2,3).equals(word.substring(2,3)))){
//            return "";
//        }
//        if (str.substring(1, 2).equals(word.substring(1, 2))) {
//            return str.substring(0, 3);
//        }
//        if (word.length() == 3 && str.substring(1, 2).equals(word.substring(1, 2))) {
//            return str.substring(0, 3);
//        }
//        if (word.length() == 3 && !(str.substring(2, 3).equals(word.substring(2, 3)))) {
//            return "";
//        }
//        return "";
//
//    }


//    public String middleTwo(String str) {
//        if (str.length()<=3){
//            return str;
//
//        }
//        return str.substring((str.length()/2-1),(str.length()/2+1));
//
//
//    }




//    public String twoChar(String str, int index) {
//        if (index <= 2){
//            return str.substring(index+1);
//        }
//        if (index == 0 && str.length()<=4){
//            return str.substring(0,2);
//        }
//        if (str.length()>= 4){
//            return str.substring(0,2);
//        }
//        if (index >= 3) {
//            return str.substring(0,2);
//
//        }
//
//        return str.substring(index);
//    }




//    public String stringX(String str) {
//        String a = "";
//
//        for(int i = 0; i < str.length(); i++){
//            if(!(str.substring(i,i+1).equals("x") && i>0 && i <str.length()-1))
//                a += str.substring(i,i+1);
//        }
//        return a;
//    }

//    public String stringYak(String str) {
//        StringBuilder a = new StringBuilder();
//
//        for (int i=0; i<str.length(); i++) {
//            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
//                i =  i + 2;
//            } else {
//                a.append(str.charAt(i));
//            }
//        }
//
//        return a.toString();
//    }


//    public String endUp(String str) {
//        if (str.length()<=2){
//            return str.toUpperCase();
//        }
//        String a = str.substring(0,str.length()-3);
//        String b = str.substring(str.length()-3);
//        return a + b.toUpperCase();
//
//    }

//
//    public String everyNth(String str, int n) {
//        String a = "";
//
//        for (int i = 0; i < str.length(); i = i + n) {
//            a = a + str.charAt(i);
//        }
//        return a;
//    }


//    public boolean stringE(String str) {
//        int a = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'e') {
//                a++;
//            }
//
//        }
//
//        return (a >= 1 && a <= 3);
//    }



//    public String theEnd(String str, boolean front) {
//        if (front){
//            return str.substring(0,1);
//        }
//        return str.substring(str.length()-1);
//
//    }


}

