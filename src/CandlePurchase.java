public class CandlePurchase {

    public static void main(String[] args) {

        // Candle 1 details
        String candle1Name = "Radiant Glow";
        int candle1Amount = 3;
        double candle1BurnTime = 5;
        double candle1PricePerHour = 1.5;

        double candle1TotalPrice = candle1Amount * candle1BurnTime * candle1PricePerHour;

        // Candle 2 details
        String candle2Name = "Mystical Moonlight";
        int candle2Amount = 5;
        double candle2BurnTime = 7;
        double candle2PricePerHour = 2.68;

        double candle2TotalPrice = candle2Amount * candle2BurnTime * candle2PricePerHour;

        // Candle 3 details
        String candle3Name = "Cozy Cabin";
        int candle3Amount = 2;
        double candle3BurnTime = 12;
        double candle3PricePerHour = 1.0;

        double candle3TotalPrice = candle3Amount * candle3BurnTime * candle3PricePerHour;

        // Totals
        double totalBurnTime = candle1BurnTime + candle2BurnTime + candle3BurnTime;
        double totalPricePerHour = candle1PricePerHour + candle2PricePerHour + candle3PricePerHour;
        double totalPrice = candle1TotalPrice + candle2TotalPrice + candle3TotalPrice;

        // Print output
        System.out.println(candle1Name + " Amount: " + candle1Amount + " Burn Time: " + candle1BurnTime + " Dollar per Burn Time: " + candle1PricePerHour + " Price: $" + candle1TotalPrice);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(candle2Name + " Amount: " + candle2Amount + " Burn Time: " + candle2BurnTime + " Dollar per Burn Time: " + candle2PricePerHour + " Price: $" + candle2TotalPrice);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(candle3Name + " Amount: " + candle3Amount + " Burn Time: " + candle3BurnTime + " Dollar per Burn Time: " + candle3PricePerHour + " Price: $" + candle3TotalPrice);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Total Burn Time: " + totalBurnTime + " Total Dollar per Burn Time: " + totalPricePerHour + " Total Price: " + totalPrice);

    }

}