/* 스레드 - 스레드 사용 후
 * => 어떤 경우에는 특정 코드를 실행시켜 놓고
 *    즉시 다른 코드를 실행해야 할 때가 있다.
 *    예1) 웹브라우저에서 HTML을 출력하다가 <img> 태그를 만나면 
 *         src 속성에서 지정한 파일을 다운로드 받아야 한다.
 *         이때 웹브라우저는 이미지 파일 다운로드를 별도로 실행시켜 놓고,
 *         즉시 다음 HTML 코드를 출력한다.
 *         이미지 파일을 다운로드 받으면 이미지가 놓일 위치에 출력한다.
 *         만약 이미지 파일을 다 받을 때까지 다음 HTML 코드를 실행하지 않는다면
 *         이미지가 출력될 위치 다음의 화면은 하얗게 비어 있어야 한다.
 *         보기가 좋지 않을 것이다.
 * => 방법
 *    - 동시에 실행할 코드를 별도로 분리해 놓고 실행시킨다.
 *    - OS는 원래 코드와 분리된 코드를 번갈아 가면서 실행한다.
 *          
 */
package step25;

public class Test02 {
  
  //1) 분리된 코드를 놓을 클래스와 메서드를 만든다.
  //=> 반드시 Thread를 상속 받아야 한다.
  static class MyThread extends Thread {
    // => run() 메서드를 재정의하여 그 메서드에 분리된 코드를 둔다.
    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("Thread1 ----> %d\n", i);
      }
    }
  }

  public static void main(String[] args) {
    // 2) 분리된 코드가 들어 있는 스레드의 객체를 만든다.
    MyThread t = new MyThread();
    
    // 3) 분리된 코드의 실행을 요청한다.
    t.start(); // 중요! 코드 실행을 요청한 후 즉시 리턴한다.
               // OS가 해당 클래스의 run() 메서드를 실행할 것이다.
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main2 - %d\n", i);
    }
  }
}

/* 용어 정리!
 * [멀티태스킹]
 * - 여러 개의 프로세스(실행 프로그램)를 동시 실행시키는 것.
 *   (동시에 실행되는 것처럼 여러 프로세스를 돌아가면서 실행한다)
 * - 종류
 *   1) 멀티 프로세싱
 *      - 여러 개의 프로세스를 돌아가면서 실행한다.
 *      - 각 메모리를 독립적으로 관리한다.
 *        그래서 메모리 사용량이 많다.
 *   2) 멀티 스레딩 
 *      - 여러 개의 작은 명령을 돌아가면서 실행한다.
 *      - 스레드는 프로세스에서 떼어 낸 일부 명령어 집합이기 때문에 
 *        프로세스에 종속된다.
 *      - 즉 프로세스가 종료되면 그 프로세스에 종속된 스레드도 함께 종료된다.
 *      - 스레드는 프로세스의 힙메모리를 공유하기 때문에 메모리 사용량이 작다.
 *      - 그래서 현대의 프로그램들은 프로세스를 복제하여 멀티 태스킹을 구축하는 방식보다
 *        멀티 스레드를 사용하는 방식을 더 선호한다.
 *        
 * [프로세스 스케줄링/CPU 스케줄링]
 * - 여러 프로세스 및 스레드가 동시에 실행되는 것처럼 보이기 위해
 *   명령어를 돌아가면서 처리하는 것.
 * - 종류
 *   1) 라운드 로빈(round-robin) 방식
 *      - 윈도우 OS에서 사용하는 방식
 *      - 일정시간 돌아가면서 처리한다.
 *   2) 우선순위(Priority + Aging) 방식
 *      - 리눅스, 유닉스에서 사용하는 방식
 *      - 우선 순위가 높은 프로세스나 스레드를 우선으로 실행한다.
 *      - 단 우선순위에 밀릴 때 마다 우선 순위를 높혀 결국 실행되게 한다.
 * 
 * [크리티컬 섹션(리전); critical section(region)]
 * - 여러 스레드가 동시에 실행할 때 문제가 발생할 수 있는 코드.
 * - 이런 코드는 한 번에 한 스레드 만이 접근해서 실행해야 한다.
 * - 방법?
 *   코드에 진입하는 순간 lock을 건다.
 *   다른 스레드가 진입하려 하면 lock이 풀릴 때까지 기다린다.
 *   코드 실행이 끝나면 다른 스레드가 실행할 수 있도록 lock을 푼다.
 * - 이렇게 한 번에 한 스레드 만이 접근하게 만드는 것을 
 *   "synchronize(동기화)"라 부른다.
 *   
 * [동기화를 하는 방법]
 * - 종류
 *   1) 뮤텍스(mutex) = 세마포어(1)
 *      - 한 번에 한 스레드 만이 진입하는 방식
 *      - 자바에서는 뮤텍스만 지원한다.
 *   2) 세마포어(Semaphore) = 세마포어(n)
 *      - 한 번에 지정된 개수 만큼 진입을 허용하는 방식   
 *    
 */














