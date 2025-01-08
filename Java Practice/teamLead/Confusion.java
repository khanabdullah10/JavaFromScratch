package teamLead;

import java.util.Arrays;

public class Confusion {

    public void m(int i, long j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(long i, int j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(long i, long j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(int i, int j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(Integer i, Long j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(Integer i, Integer j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(Long i, Integer j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(Long i, Long j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(Integer i, long j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(Long i, int j){
        System.out.println(i);
        System.out.println(j);
    }
    public void m(int...i){
        System.out.println(Arrays.toString(i));
    }
















    public static void main(String[] args) {
        Confusion con = new Confusion();
        Integer i = Integer.valueOf(0);
        Integer j = Integer.valueOf(0);


        con.m(i,j);
        con.m(0,0L);
        con.m(0,0,0,0,0,0,0,0);
    }



















































}
