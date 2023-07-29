import java.util.Scanner;

class project {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        Coffee c1 = new Coffee();
        Pizza p1 = new Pizza();
        Burger b1 = new Burger();
        GarBr gb1 = new GarBr();
        Fries f1 = new Fries();
        pasta pa1 = new pasta();
        Scanner sc = new Scanner(System.in);

        int i, j;

        do {
            System.out.println("---Welcome To hungers choice---");
            System.out.println("Choose One of the Option");
            System.out.println("1.Show Menu");
            System.out.println("2.Order Your Meal");
            System.out.println("3.Show Bill");
            System.out.println("4.Delete Any Item");
            System.out.println("Press 0 to Exit");
            i = sc.nextInt();

            switch (i) {
                case 0:
                    System.out.println("Thanks For Coming..!");
                    break;

                case 1:
                    m1.name();
                    System.out.println("");
                    m1.menu();
                    break;
                case 2:
                    do {
                        System.out.println("Choose The Number to order.");
                        System.out.println("1.Coffee");
                        System.out.println("2.Pizza");
                        System.out.println("3.Pasta");
                        System.out.println("4.Fries");
                        System.out.println("5.Garlic Bread");
                        System.out.println("6.Burger");
                        System.out.println("Press 0 to go to see menu / order meal / show bill.");
                        System.out.println("Press 9 to go to menu.");
                        j = sc.nextInt();
                        switch (j) {
                            case 0:
                                break;
                            case 1:
                                c1.show();
                                c1.orderc();
                                break;
                            case 2:
                                p1.showp();
                                p1.orderp();
                                break;
                            case 3:
                                pa1.showpa();
                                pa1.orderpa();
                                break;
                            case 4:
                                f1.showf();
                                f1.orderfr();
                                break;
                            case 5:
                                gb1.showgb();
                                gb1.ordergb();
                                break;
                            case 6:
                                b1.showbu();
                                b1.oredrbu();
                                break;

                        }

                    } while (j != 0);
                    break;
                case 3:
                    int finalBill = c1.bb1 + p1.b2 + b1.b6 + gb1.b5 + f1.b4 + pa1.b3;
                    System.out.println("Final bill : " + finalBill);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Select A valid Option");
                    break;
            }
        } while (i != 0);
        sc.close();
    }
}

class Menu {
    public void name() {
        for (int i = 0; i <= 80; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <= 30; i++) {
            System.out.print(" ");
        }
        System.out.println("Hunger's Choice");
        for (int i = 0; i <= 80; i++) {
            System.out.print("*");
        }
    }

    public void menu() {
        System.out.println("1.Coffee                                  2.Pizza");
        System.out.println("   Americano          100Rs.                 Margherita Pizza          120rs.");
        System.out.println("   Expresso           100Rs.                 Paneer Onion Pizza        120rs.");
        System.out.println("   Capuccino          100Rs.                 Capsicum Pizza            120rs.");
        System.out.println("   Lattee             100Rs.                 FARMHOUSE Pizza           120rs.");
        System.out.println("");
        System.out.println("3.Pasta                                  4.Fries");
        System.out.println("   Creamy Pesto       150Rs.                 Plain French Fries        170rs.");
        System.out.println("   Alfredo            150Rs.                 Peri-Peri Fries           170rs.");
        System.out.println("   Mix Sauce          150Rs.                 Schezwan Fries            170rs.");
        System.out.println("   ChessePenne        150Rs.                 CheeseBurst Fries         170rs.");
        System.out.println("");
        System.out.println("5.Garlic Bread                            6.Burger");
        System.out.println("   Plain GB            180Rs.                 Classic Veg.              200rs.");
        System.out.println("   Chesse GB           180Rs.                 Gourmet Cheese Veg.       200rs.");
        System.out.println("   Tandoori GB         180Rs.                 Paneer Double Decker      200rs.");
        System.out.println("   Chilli GB           180Rs.                 Mexican Veg.              200rs.");
    }
}

class Coffee {

    int a = 0, e = 0, c = 0, l = 0, bb1 = 0;
    int oc;

    Scanner cs = new Scanner(System.in);

    public void show() {
        System.out.println("1.Americano");
        System.out.println("2.Expresso");
        System.out.println("3.Capuccino");
        System.out.println("4.Lattee");
        System.out.println("Press 0 to go to see menu / order meal / show bill.");
        System.out.println("Press 9 to go to menu.");
    }

    public void orderc() {

        do {
            oc = cs.nextInt();
            switch (oc) {
                case 0:
                    break;
                case 1:
                    a = a + 1;
                    bb1 = bb1 + (a * 100);
                    break;
                case 2:
                    e = e + 1;
                    bb1 = bb1 + (e * 100);
                    break;
                case 3:
                    c = c + 1;
                    bb1 = bb1 + (c * 100);
                    break;
                case 4:
                    l = l + 1;
                    bb1 = bb1 + (l * 100);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Choose Proper Item.");
                    break;
            }

        } while (oc != 9);

    }

}

class Pizza {
    int mp = 0, pop = 0, cp = 0, fp = 0, b2 = 0;
    int pi;
    Scanner p = new Scanner(System.in);

    public void showp() {
        System.out.println("1.Margherita Pizza");
        System.out.println("2.Paneer Onion Pizza");
        System.out.println("3.Capsicum Pizza");
        System.out.println("4.FARMHOUSE Pizza");
        System.out.println("Press 0 to go to see menu / order meal / show bill.");
        System.out.println("Press 9 to go to menu.");
    }

    public void orderp() {

        do {
            pi = p.nextInt();
            switch (pi) {
                case 0:
                    break;
                case 1:
                    mp = mp + 1;
                    b2 = b2 + (mp * 120);
                    break;
                case 2:
                    pop = pop + 1;
                    b2 = b2 + (pop * 120);
                    break;
                case 3:
                    cp = cp + 1;
                    b2 = b2 + (cp * 120);
                    break;
                case 4:
                    fp = fp + 1;
                    b2 = b2 + (fp * 120);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Choose Proper Item.");
                    break;
            }

        } while (pi != 9);

    }

}

class pasta {
    int crp = 0, al = 0, chep = 0, mixs = 0, b3 = 0;
    int pas;
    Scanner past = new Scanner(System.in);

    public void showpa() {
        System.out.println("1.Creamy Pesto");
        System.out.println("2.Alfredo");
        System.out.println("3.Mix Sauce");
        System.out.println("4.ChessePenne");
        System.out.println("Press 0 to go to see menu / order meal / show bill.");
        System.out.println("Press 9 to go to menu.");
    }

    public void orderpa() {

        do {
            pas = past.nextInt();
            switch (pas) {
                case 0:
                    break;
                case 1:
                    crp = crp + 1;
                    b3 = b3 + (crp * 150);
                    break;
                case 2:
                    al = al + 1;
                    b3 = b3 + (al * 150);
                    break;
                case 3:
                    mixs = mixs + 1;
                    b3 = b3 + (mixs * 150);
                    break;
                case 4:
                    chep = chep + 1;
                    b3 = b3 + (chep * 150);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Choose Proper Item.");
                    break;
            }

        } while (pas != 9);

    }
}

class Fries {
    int pfr = 0, pepef = 0, ScF = 0, CBf = 0, b4 = 0;
    int fri;
    Scanner fries = new Scanner(System.in);

    public void showf() {
        System.out.println("1.Plain French Fries");
        System.out.println("2.Peri-Peri Fries");
        System.out.println("3.Schezwan Fries");
        System.out.println("4.CheeseBurst Fries");
        System.out.println("Press 0 to go to see menu / order meal / show bill.");
        System.out.println("Press 9 to go to menu.");
    }

    public void orderfr() {

        do {
            fri = fries.nextInt();
            switch (fri) {
                case 0:
                    break;
                case 1:
                    pfr = pfr + 1;
                    b4 = b4 + (pfr * 170);
                    break;
                case 2:
                    pepef = pepef + 1;
                    b4 = b4 + (pepef * 170);
                    break;
                case 3:
                    ScF = ScF + 1;
                    b4 = b4 + (ScF * 170);
                    break;
                case 4:
                    CBf = CBf + 1;
                    b4 = b4 + (CBf * 170);
                    break;
                case 9:
                    break;
            }

        } while (fri != 9);

    }

}

class GarBr {
    int pgb = 0, cgb = 0, tgb = 0, chgb = 0, b5 = 0;
    int garb;
    Scanner gb = new Scanner(System.in);

    public void showgb() {
        System.out.println("1.Plain Garlic Bread");
        System.out.println("2.Chesse Garlic Bread");
        System.out.println("3.Tandoori Garlic Bread");
        System.out.println("4.Chilli Garlic Bread");
        System.out.println("Press 0 to go to see menu / order meal / show bill.");
        System.out.println("Press 9 to go to menu.");
    }

    public void ordergb() {

        do {
            garb = gb.nextInt();
            switch (garb) {
                case 0:
                    break;
                case 1:
                    pgb = pgb + 1;
                    b5 = b5 + (pgb * 180);
                    break;
                case 2:
                    cgb = cgb + 1;
                    b5 = b5 + (cgb * 180);
                    break;
                case 3:
                    tgb = tgb + 1;
                    b5 = b5 + (tgb * 180);
                    break;
                case 4:
                    chgb = chgb + 1;
                    b5 = b5 + (chgb * 180);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Choose Proper Item.");
                    break;
            }

        } while (garb != 9);

    }
}

class Burger {
    int cvb = 0, gcvb = 0, pddb = 0, mvb = 0, b6 = 0;
    int bur;
    Scanner Bu = new Scanner(System.in);

    public void showbu() {
        System.out.println("1.Classic Veg. Burger");
        System.out.println("2.Gourmet Cheese Veg. Burger");
        System.out.println("3.Paneer Double Decker Burger");
        System.out.println("4.Mexican Veg. Burger");
        System.out.println("Press 0 to go to see menu / order meal / show bill.");
        System.out.println("Press 9 to go to menu.");
    }

    public void oredrbu() {

        do {
            bur = Bu.nextInt();
            switch (bur) {
                case 0:
                    break;
                case 1:
                    cvb = cvb + 1;
                    b6 = b6 + (cvb * 200);
                    break;
                case 2:
                    gcvb = gcvb + 1;
                    b6 = b6 + (gcvb * 200);
                    break;
                case 3:
                    pddb = pddb + 1;
                    b6 = b6 + (pddb * 200);
                    break;
                case 4:
                    mvb = mvb + 1;
                    b6 = b6 + (mvb * 200);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Choose valid Item");
                    break;
            }

        } while (bur != 9);

    }
}