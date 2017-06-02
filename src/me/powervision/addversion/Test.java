package me.powervision.addversion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xuyx on 2017/4/29.
 */
public class Test {
    public static void main(String[] args) {
        String innerHtml = new String("           <h3><i class=\'perIcon myPost\'></i><a href=\'../user_center/personalCenter.html\'>个人资料</a></h3>");
        innerHtml = innerHtml.replaceAll("\\u002Ehtml\\\'",".html?v=22222\\\'");
        System.out.println(innerHtml);

//        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss-MMdd");
//        String time = sdf.format(new Date());
//        System.out.println(time);

//        String str = "/cn/html/pv/powerray.html\" dddddkf f j";
//        int i1 = str.indexOf(".html");
//        int i2 = str.indexOf("\"",i1);
//        System.out.println(i1+"  "+i2+"   "+str.substring(i1-8,i2+11));
//        str =  new StringBuffer(str).replace(i1+5,i2,"?v=22222").toString();
//        System.out.println(str);


//        StringBuffer sb = new StringBuffer("maimmaimffdsfsffmaimdffff");
//        System.out.println(replaceAll(sb, "maim", "="));
//          String str    = "abcde";
//          str+="fghijklmnopk";
//          System.out.println(str);

//        String str  = ".html?proId=3&v=172239-0510";
//        int i = str.indexOf("?");
//        int j = str.indexOf("=", i);
//        String sub = str.substring(i+1, j);
//        System.out.println(sub);
//
//        String[] split = str.split("=");
//        for(String stra:split){
//            System.out.println("--  "+stra);
//        }

    }


    public static StringBuffer replaceAll(StringBuffer sb, String oldStr, String newStr) {
        int i = sb.indexOf(oldStr);
        int oldLen = oldStr.length();
        int newLen = newStr.length();
        while (i > -1) {
            sb.delete(i, i + oldLen);
            sb.insert(i, newStr);
            i = sb.indexOf(oldStr, i + newLen);
        }
        return sb;
    }

}

