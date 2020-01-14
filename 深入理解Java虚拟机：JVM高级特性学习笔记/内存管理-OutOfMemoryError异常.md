# 内存管理

## OutOfMemoryError异常

- 堆内存溢出异常测试

  ```
  package com.zixin.jvm;
  
  import java.util.ArrayList;
  import java.util.List;
  
  /**
   * @ClassName Test1
   * @Description TODO
   * @Author zishen
   * @Date 2020/1/9 17:45
   * @Version 1.0
   **/
  public class Test1 {
  
      static class OOMObject{
  
      }
      public static void main(String[] args) {
  
          List<OOMObject> list = new ArrayList<OOMObject>();
          while(true){
              list.add(new OOMObject());
          }
      }
  }
  
  ```

  ```java
  [GC (Allocation Failure) [PSYoungGen: 8192K->1008K(9216K)] 8192K->4814K(19456K), 0.1177249 secs] [Times: user=0.03 sys=0.00, real=0.13 secs] 
  [GC (Allocation Failure) --[PSYoungGen: 9200K->9200K(9216K)] 13006K->19436K(19456K), 0.1266323 secs] [Times: user=0.05 sys=0.00, real=0.13 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 9200K->0K(9216K)] [ParOldGen: 10236K->10068K(10240K)] 19436K->10068K(19456K), [Metaspace: 3457K->3457K(1056768K)], 0.2666758 secs] [Times: user=0.22 sys=0.00, real=0.27 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8192K->8175K(9216K)] [ParOldGen: 10068K->8253K(10240K)] 18260K->16428K(19456K), [Metaspace: 3473K->3473K(1056768K)], 0.4695049 secs] [Times: user=0.22 sys=0.00, real=0.47 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8192K->8175K(9216K)] [ParOldGen: 8253K->8253K(10240K)] 16445K->16429K(19456K), [Metaspace: 3476K->3476K(1056768K)], 0.3483437 secs] [Times: user=0.20 sys=0.00, real=0.35 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8192K->8175K(9216K)] [ParOldGen: 8253K->8253K(10240K)] 16445K->16429K(19456K), [Metaspace: 3482K->3482K(1056768K)], 0.2891852 secs] [Times: user=0.09 sys=0.00, real=0.29 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8192K->8175K(9216K)] [ParOldGen: 8253K->8253K(10240K)] 16445K->16429K(19456K), [Metaspace: 3486K->3486K(1056768K)], 0.2468448 secs] [Times: user=0.16 sys=0.00, real=0.25 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8192K->8184K(9216K)] [ParOldGen: 8253K->8236K(10240K)] 16445K->16420K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1905990 secs] [Times: user=0.17 sys=0.00, real=0.19 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8192K->8191K(9216K)] [ParOldGen: 8236K->8236K(10240K)] 16428K->16428K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.6172547 secs] [Times: user=0.14 sys=0.00, real=0.62 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8236K->8236K(10240K)] 16428K->16428K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.4634334 secs] [Times: user=0.19 sys=0.00, real=0.46 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8237K->8237K(10240K)] 16429K->16429K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.4074790 secs] [Times: user=0.14 sys=0.00, real=0.41 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8238K->8238K(10240K)] 16430K->16430K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2842232 secs] [Times: user=0.14 sys=0.00, real=0.28 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8239K->8238K(10240K)] 16431K->16430K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3058616 secs] [Times: user=0.14 sys=0.00, real=0.31 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8239K->8239K(10240K)] 16431K->16431K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1794932 secs] [Times: user=0.14 sys=0.00, real=0.18 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8240K->8240K(10240K)] 16432K->16432K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1550187 secs] [Times: user=0.14 sys=0.00, real=0.15 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8241K->8241K(10240K)] 16433K->16433K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2675107 secs] [Times: user=0.14 sys=0.00, real=0.27 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8242K->8242K(10240K)] 16434K->16434K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3104477 secs] [Times: user=0.16 sys=0.00, real=0.31 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8243K->8243K(10240K)] 16435K->16435K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2374684 secs] [Times: user=0.19 sys=0.00, real=0.24 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8244K->8244K(10240K)] 16436K->16436K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1593846 secs] [Times: user=0.14 sys=0.00, real=0.16 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8245K->8245K(10240K)] 16437K->16437K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.4983899 secs] [Times: user=0.06 sys=0.00, real=0.50 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8246K->8246K(10240K)] 16438K->16438K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1865627 secs] [Times: user=0.11 sys=0.00, real=0.19 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8247K->8247K(10240K)] 16439K->16439K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3621621 secs] [Times: user=0.14 sys=0.02, real=0.36 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8248K->8248K(10240K)] 16440K->16440K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3202772 secs] [Times: user=0.19 sys=0.00, real=0.32 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8249K->8249K(10240K)] 16441K->16441K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3614953 secs] [Times: user=0.13 sys=0.00, real=0.36 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8250K->8250K(10240K)] 16442K->16442K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.4219238 secs] [Times: user=0.08 sys=0.00, real=0.42 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8251K->8251K(10240K)] 16443K->16443K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.5721366 secs] [Times: user=0.09 sys=0.00, real=0.57 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8252K->8252K(10240K)] 16444K->16444K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2370411 secs] [Times: user=0.13 sys=0.00, real=0.24 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8253K->8253K(10240K)] 16445K->16445K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3405378 secs] [Times: user=0.11 sys=0.00, real=0.34 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8254K->8254K(10240K)] 16446K->16446K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1738097 secs] [Times: user=0.08 sys=0.00, real=0.17 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8255K->8255K(10240K)] 16447K->16447K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2494056 secs] [Times: user=0.11 sys=0.00, real=0.25 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8256K->8256K(10240K)] 16448K->16448K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1866181 secs] [Times: user=0.11 sys=0.00, real=0.19 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8257K->8257K(10240K)] 16449K->16449K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.4089105 secs] [Times: user=0.14 sys=0.00, real=0.41 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8258K->8258K(10240K)] 16450K->16450K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1451805 secs] [Times: user=0.14 sys=0.00, real=0.15 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8259K->8259K(10240K)] 16451K->16451K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1685110 secs] [Times: user=0.09 sys=0.00, real=0.17 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8277K->8276K(10240K)] 16469K->16468K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.3203551 secs] [Times: user=0.13 sys=0.00, real=0.32 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8277K->8277K(10240K)] 16469K->16469K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2385266 secs] [Times: user=0.14 sys=0.00, real=0.24 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8278K->8278K(10240K)] 16470K->16470K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1574756 secs] [Times: user=0.09 sys=0.00, real=0.16 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8279K->8279K(10240K)] 16471K->16471K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1664916 secs] [Times: user=0.11 sys=0.00, real=0.17 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8280K->8280K(10240K)] 16472K->16472K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1810858 secs] [Times: user=0.13 sys=0.00, real=0.18 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8281K->8281K(10240K)] 16473K->16473K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1809558 secs] [Times: user=0.13 sys=0.00, real=0.18 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8282K->8282K(10240K)] 16474K->16474K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1608762 secs] [Times: user=0.08 sys=0.00, real=0.16 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8283K->8283K(10240K)] 16475K->16475K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1845451 secs] [Times: user=0.16 sys=0.00, real=0.18 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8284K->8284K(10240K)] 16476K->16476K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1631815 secs] [Times: user=0.11 sys=0.00, real=0.16 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8285K->8285K(10240K)] 16477K->16477K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1963231 secs] [Times: user=0.11 sys=0.00, real=0.20 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8286K->8286K(10240K)] 16478K->16478K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.1638539 secs] [Times: user=0.13 sys=0.00, real=0.16 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8287K->8287K(10240K)] 16479K->16479K(19456K), [Metaspace: 3489K->3489K(1056768K)], 0.2490067 secs] [Times: user=0.13 sys=0.00, real=0.25 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8309K->8289K(10240K)] 16501K->16481K(19456K), [Metaspace: 3525K->3525K(1056768K)], 0.2482278 secs] [Times: user=0.11 sys=0.00, real=0.25 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8290K->8290K(10240K)] 16482K->16482K(19456K), [Metaspace: 3525K->3525K(1056768K)], 0.2515228 secs] [Times: user=0.13 sys=0.00, real=0.25 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8291K->8291K(10240K)] 16483K->16483K(19456K), [Metaspace: 3525K->3525K(1056768K)], 0.1976164 secs] [Times: user=0.16 sys=0.00, real=0.20 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8292K->8292K(10240K)] 16484K->16484K(19456K), [Metaspace: 3525K->3525K(1056768K)], 0.1311626 secs] [Times: user=0.08 sys=0.00, real=0.13 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8293K->8293K(10240K)] 16485K->16485K(19456K), [Metaspace: 3525K->3525K(1056768K)], 0.1867945 secs] [Times: user=0.16 sys=0.00, real=0.19 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8294K->8294K(10240K)] 16486K->16486K(19456K), [Metaspace: 3525K->3525K(1056768K)], 0.2679302 secs] [Times: user=0.11 sys=0.00, real=0.27 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8315K->8295K(10240K)] 16507K->16487K(19456K), [Metaspace: 3557K->3557K(1056768K)], 0.1588314 secs] [Times: user=0.13 sys=0.00, real=0.16 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8298K->8298K(10240K)] 16490K->16490K(19456K), [Metaspace: 3557K->3557K(1056768K)], 0.1379473 secs] [Times: user=0.13 sys=0.00, real=0.14 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8307K->8299K(10240K)] 16499K->16491K(19456K), [Metaspace: 3570K->3570K(1056768K)], 0.1507495 secs] [Times: user=0.11 sys=0.00, real=0.15 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8323K->8302K(10240K)] 16515K->16494K(19456K), [Metaspace: 3598K->3598K(1056768K)], 0.2009461 secs] [Times: user=0.09 sys=0.00, real=0.20 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8303K->8303K(10240K)] 16495K->16495K(19456K), [Metaspace: 3598K->3598K(1056768K)], 0.1704141 secs] [Times: user=0.11 sys=0.00, real=0.17 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8305K->8305K(10240K)] 16497K->16497K(19456K), [Metaspace: 3598K->3598K(1056768K)], 0.1533470 secs] [Times: user=0.14 sys=0.00, real=0.15 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8305K->8305K(10240K)] 16497K->16497K(19456K), [Metaspace: 3598K->3598K(1056768K)], 0.1359960 secs] [Times: user=0.13 sys=0.00, real=0.14 secs] 
  [Full GC (Allocation Failure) [PSYoungGen: 8191K->8191K(9216K)] [ParOldGen: 8305K->8304K(10240K)] 16497K->16496K(19456K), [Metaspace: 3598K->3598K(1056768K)], 0.1739487 secs] [Times: user=0.08 sys=0.00, real=0.17 secs] 
  [Full GC (Ergonomics) [PSYoungGen: 8191K->0K(9216K)] [ParOldGen: 8306K->670K(10240K)] 16498K->670K(19456K), [Metaspace: 3603K->3603K(1056768K)], 0.0150429 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
  Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
  	at java.util.Arrays.copyOf(Arrays.java:3210)
  	at java.util.Arrays.copyOf(Arrays.java:3181)
  	at java.util.ArrayList.grow(ArrayList.java:261)
  	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
  	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
  	at java.util.ArrayList.add(ArrayList.java:458)
  	at com.zixin.jvm.Test1.main(Test1.java:22)
  Heap
   PSYoungGen      total 9216K, used 1002K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
    eden space 8192K, 12% used [0x00000000ff600000,0x00000000ff7056c8,0x00000000ffe00000)
    from space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
    to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
   ParOldGen       total 10240K, used 670K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
    object space 10240K, 6% used [0x00000000fec00000,0x00000000feca78c0,0x00000000ff600000)
   Metaspace       used 4029K, capacity 4572K, committed 4864K, reserved 1056768K
    class space    used 450K, capacity 460K, committed 512K, reserved 1048576K
  ```

  要解决这个内存区域的异常，常规的处理方法是首先通过内存映像分析工具（如EclipseMemory Analyzer）对Dump出来的堆转储快照进行分析。第一步首先应确认内存中导致OOM的对象是否是必要的，也就是要先分清楚到底是出现了内存泄漏（Memory Leak）还是内存溢出（Memory Overflow）。

  如果是内存泄漏，可进一步通过工具查看泄漏对象到GC Roots的引用链，找到泄漏对象是通过怎样的引用路径、与哪些GC Roots相关联，才导致垃圾收集器无法回收它们，根据泄漏对象的类型信息以及它到GC Roots引用链的信息，一般可以比较准确地定位到这些对象创建的位置，进而找出产生内存泄漏的代码的具体位置。

## 虚拟机栈和本地方法栈溢出

- 如果线程请求的栈深度大于虚拟机所允许的最大深度，将抛出`StackOverflowError`异常
- 如果虚拟机的栈内存允许动态扩展，当扩展栈容量无法申请到足够的内存时，将抛出`OutOfMemoryError`异常

### 元空间防御措施参数设置

- -XX：MaxMetaspaceSize:设置元空间最大值，默认是-1，即不限制，或者只受限于本地内存大小
- -XX:MetaspaceSize:指定元空间的初始空间大小，以字节为单位，达到该值就会触发垃圾收集进行类卸载，同事收集器会对该值进行调整；如果释放了大量的空间，就适当降低该值；如果释放了很少的空间，那么在不超过-XX：MaxMetaspaceSize的情况下适当提高该值。
- -XX:minMetaspaceFreeRatio:在垃圾收集之后控制最小的元空间剩余容量的百分比，可减少因为元空间不足导致的垃圾收集的频率。
- -XX：MinMetaspaceFreeRatio:控制最大的元空间剩余容量的百分比。

