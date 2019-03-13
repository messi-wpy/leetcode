import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String originalString = "头部123456@qq.com中间的文字吧啦吧啦balabala@sina.com.cn快结束了吧啦吧啦my_mail@163.com测试相同子串123456@qq.com";
        String searchString = originalString;
        String regexString = "[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+";
        Pattern datePattern = Pattern.compile(regexString);
        Matcher dateMatcher = datePattern.matcher(searchString);
        int beEndIndex = 0;
        while(dateMatcher.find()) {
            String subString = dateMatcher.group();
            System.out.print("子串:"+subString+"  ");
            int subIndex = searchString.indexOf(subString);
            System.out.print("位置:"+(subIndex + beEndIndex)+"  ");
            int subLength = subString.length();
            System.out.println("长度:"+subLength);
            beEndIndex = subIndex + subLength + beEndIndex;
            searchString = originalString.substring(beEndIndex);
            dateMatcher = datePattern.matcher(searchString);
        }
        System.out.println("end");
    }
}
