# programs to:
1. Design an Applet to simulate a traffic signal.
2. Implement Thread Programming to solve reader-writer problem.
3. Implement Thread Programming to solve producer – consumer problem.

## Life Cycle of a Thread
A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies. The following diagram shows the complete life cycle of a
thread.

Following are the stages of the life cycle −
- New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
- Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
- Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
- Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
- Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.

## Thread Priorities
Every Java thread has a priority that helps the operating system determine the order in which hreads are scheduled. Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10). By default, every thread is given priority NORM_PRIORITY (a constant of 5). Threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads. However, thread priorities cannot guarantee the order in which threads execute and are very much platform dependent

## Inter-thread communication
Interthread communication is important when you develop an application where two or more threads exchange some information.
There are three simple methods and a little trick which makes thread communication possible. All the three methods are listed below −

![image](https://user-images.githubusercontent.com/26967135/115551355-8bf23f80-a2c8-11eb-80ee-8ae6fcc7f3ac.png)
          
These methods have been implemented as final methods in Object, so they are available in all the classes. All three methods can be called only from within a synchronized context.
