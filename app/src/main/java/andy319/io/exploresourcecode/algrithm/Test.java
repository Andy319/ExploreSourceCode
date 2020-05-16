package andy319.io.exploresourcecode.algrithm;

/**
 * 描述：
 * 作者：mady@akulaku.com
 * 时间： 2019/2/28
 */
public class Test {

    public static void main(String args[]){
        String s=fun("Tencent");
        System.out.println(s);
    }

    static String fun(String s){ //递归是最内层的s.charAt先加。
        System.out.println(s);
        String s1=s.length()>0?fun(s.substring(1))+s.charAt(0):"";
        System.out.println(s1+"==");
        return s1;
    }
}
