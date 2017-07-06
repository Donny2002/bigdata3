/* 문자의 유니코드 값을 저장할 메모리 만들기 II
 * => 문자의 유니코드 값을 알아내는 특별한 연산자
 *    '문자' ==> 문자에 해당하는 유니코드 값이 리턴된다.
 *    
 */
package step02;

public class Test06_2 {
  public static void main(String[] args) {
    char c1 = 0xd55c; // 한 이라는 글자의 유니코드 값을 저장하라!
    char c2 = '헐'/*0xd5d0*/; // '헐' 이라는 자리에 유니코드 값이 놓인다.
    
    /* 가끔 초보 개발자들이 c2 변수에 문자가 저장된다고 생각하는 경우가 있다.
     * 문자가 저장되는 것이 아니라 문자에 해당하는 유니코드(숫자) 값이 저장된다는 것을 확실히 알려주기 위해
     * 위의 예제를 작성한 것이다.
     * 절대 잊지말라!
     * char 변수는 유니코드 값을 저장하는 변수이지, 문자를 직접 저장하는 것이 아니다.
     * 작은 따옴표('')의 기능은 문자에 대한 유니코드 값을 리턴하는 일을 한다.
     */
    System.out.println(c1);
    System.out.println(c2);
  }

}
 