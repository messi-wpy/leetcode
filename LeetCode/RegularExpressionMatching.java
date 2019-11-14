package exercise.LeetCode;

public class RegularExpressionMatching {
    /**
     * dp解法
     * @param orgs
     * 注意match的参数比charAt多一（加了空串）
     * 有三种情况斜着，竖着，横着
     */
    public static void main(String[]orgs){
        System.out.print(isMatch("aa","a*"));

    }
    public static boolean isMatch(String s, String p) {
      if(s==null||p==null)return false;
      boolean[][] match=new boolean[s.length()+1][p.length()+1];
      //多一串空字符
      match[0][0] = true;
      //初始化第一串
      for (int i=1;i<=p.length();i++){
          if (p.charAt(i-1)=='*'){
              match[0][i]=match[0][i-2];
          }
      }
        //match的更新
      for (int i=1;i<=s.length();i++)
          for (int j=1;j<=p.length();j++) {
              //前一位
              if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                  match[i][j] = match[i - 1][j - 1];
              } else if (p.charAt(j-1) == '*') {
                  //如果当前的p-1与s相同，只需要
                  if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.')
                      match[i][j] = match[i][j - 2] || match[i - 1][j];
                  else
                      match[i][j] = match[i][j - 2];

              }
          }
          return match[s.length()][p.length()];
    }
}
