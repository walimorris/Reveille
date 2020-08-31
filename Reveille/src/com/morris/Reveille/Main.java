package com.morris.Reveille;

/** 
 * MIT License
 * 
 * Copyright (c) 2020 Wali Morris
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * 
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
