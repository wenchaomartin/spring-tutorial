package me.springtutorial;

/**
 * Create by songwenchao on 2019-08-01
 */
public class Test {
  public static void main(String[] args) {
    System.out.println(compressStr("bcddaabe"));
  }

  public static String compressStr(String s) {
    StringBuffer stringBuffer = new StringBuffer();
    char[] strArr = s.toCharArray();
    int i = 0;
    while (i < strArr.length) {
      int accum = 1;
      int j = i + 1;
      while (j < strArr.length) {
        if (strArr[i] == strArr[j]) {
          accum++;
          j++;
        } else {
          break;
        }

      }
      stringBuffer.append(strArr[i]);
      if(accum>1){
        stringBuffer.append(accum);
      }
      i = j;
    }
    return stringBuffer.toString();
  }
}
