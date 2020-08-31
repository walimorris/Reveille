package com.morris.Reveille;

/** 
 * Reveille! was a big part of my military career. Every morning, colors played and I was
 * proud. Proud to wake up and serve my country, community and along side some of the best
 * men and women in America. When Reveille! played, it was a tune to get the day going, to
 * to put your best foot forward and continue on. Now, as I develop my programming skills
 * I've made a scheduled Reveille! call for 7:30 am every morning, so Reveille! will run in
 * the background on my personal computer. This is a reminder that no matter where I am, or
 * what profession I undertake or how I'll strive to make an impact; I should always get up
 * early, serve along side some of the world's greatest programmers and put my very best
 * foot forward. Reveille!
 *
 * @author Wali Morris
 * @since 08/06/2020
 */

public class Main {
    public static void main(String[] args) {
        ScheduledRunner reveille = new ScheduledRunner();
        reveille.reveille();
    }
}
