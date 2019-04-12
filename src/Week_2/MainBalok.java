/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_2;

/**
 *
 * @author asus
 */
public class MainBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassBalok blk1 = new ClassBalok();
        ClassBalok blk2 = new ClassBalok(7.8);
        ClassBalok blk3 = new ClassBalok();
        ClassBalok blk4 = new ClassBalok(7.8, 6.5, 7);
        ClassBalok blk5 = new ClassBalok(7, 6);
        
        System.out.println(blk1.toString());
        System.out.println(blk2.toString());
        System.out.println(blk3.toString());
        System.out.println(blk4.toString());
        System.out.println(blk5.toString());
        
        
        System.out.println("Volume blk1 = " + blk1.volume());
        System.out.println("Volume blk2 = " + blk1.volume());
        System.out.println("Volume blk3 = " + blk1.volume());
        System.out.println("Volume blk4 = " + blk1.volume());
        System.out.println("Volume blk5 = " + blk1.volume());
        
        System.out.println("Volume blk5 = " + blk5.volume(8.5));
        System.out.println("Volume blk5 = " + blk5.volume(8));
        System.out.println("Volume blk5 = " + blk5.volume(8.5, 7));
        System.out.println("Volume blk5 = " + blk5.volume(8, 7.5));
    }
}
