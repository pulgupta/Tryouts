package org.study.threading;

class State {
    ThreadLocal<String> threadLocal;
    String nonThreadLocal;

    public State(String value1, String value2) {
        threadLocal = new ThreadLocal<>();
        threadLocal.set(value1);
        nonThreadLocal = value2;
    }
}

class MyTask1 implements Runnable {
    State state;

    public MyTask1(State state) {
        this.state = state;
    }

    @Override
    public void run() {
        state.threadLocal.set(Thread.currentThread().getName());
        state.nonThreadLocal = Thread.currentThread().getName();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(state.threadLocal.get());
    }

}

public class ThreadLocalExample{

    public static void main(String[] args) {
        State state = new State("ThreadLocalDefault", "nonThreadLocalDefault");
        MyTask1 task = new MyTask1(state);
        Thread t1 = new Thread(task, "Thread1");
        Thread t2 = new Thread(task, "Thread2");
        t1.start();
        t2.start();
        // Even though we have set the value of the thread local variable lets see if it has changed the original value
        System.out.println("State value of threadLocal is " + state.threadLocal.get());
        System.out.println("State value of the nonThreadLocal is " + state.nonThreadLocal);
    }
}



