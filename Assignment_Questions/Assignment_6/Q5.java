/*this program give output af salesman's commission according to area
 * there are three area like x,y and z.
 * first of all we get the sales amount from the user by the help of get_amount method
 * after getting sales amount display salesman commission on the bassis of his area
 */

import java.io.Console;

public class Q5 {

    int amnt, comsn;

    void get_amount() {
        Console c = System.console();
        amnt = Integer.parseInt(c.readLine("Enter the sales amount: "));
    }

    void x_area() {
        if (amnt < 1000)
            System.out.println(amnt * 10 / 100);

        if (amnt >= 1000 && amnt < 5000)
            System.out.println(amnt * 12 / 100);

        if (amnt >= 5000)
            System.out.println(amnt * 15 / 100);
    }

    void y_area() {
        if (amnt < 1500)
            System.out.println(amnt * 10 / 100);

        if (amnt >= 1500 && amnt < 7000)
            System.out.println(amnt * 12 / 100);

        if (amnt >= 7000)
            System.out.println(amnt * 15 / 100);
    }

    void z_area() {
        if (amnt < 1200)
            System.out.println(amnt * 10 / 100);

        if (amnt >= 1200 && amnt < 6500)
            System.out.println(amnt * 12 / 100);

        if (amnt >= 6500)
            System.out.println(amnt * 15 / 100);
    }

    public static void main(String args[]) {
        // create class object
        Q5 ob = new Q5();
        ob.get_amount();
        System.out.print("Commission of area x: ");
        ob.x_area();
        System.out.print("Commission of area : ");
        ob.y_area();
        System.out.print("Commission of area z: ");
        ob.z_area();

    }
}