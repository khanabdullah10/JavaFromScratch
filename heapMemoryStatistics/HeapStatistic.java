package src.heapMemoryStatistics;

import java.lang.Runtime;
public class HeapStatistic {


    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        double mb = 1024*1024;

        System.out.println("Max memory : "+r.maxMemory()/mb +" MB");
        System.out.println("Free memory : "+r.freeMemory()/mb +" MB");
        System.out.println("Initial memory : "+r.totalMemory()/mb +" MB");
        System.out.println("Consumed memory: "+( r.totalMemory() - r.freeMemory())/mb +" MB");



    }






}
