package day07_scanner;

public class GiftCard {
    /*

    create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times use by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end


     */
    public static void main(String[] args) {

        double giftcard = 500 ;
        int uses = 3;
        System.out.println("using giftcard. $150 removed");
        giftcard -= 150; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Using giftcard. $99 removed");
        giftcard -= 99; // giftCard = giftCard - 150;
        System.out.println("Gift card balance left $ " + giftcard);
        System.out.println("Number of times card can be used: " + uses);
    }
}
