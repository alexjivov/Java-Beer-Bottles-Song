public class BeerBottlesSong {
    public static void main(String[] args) {
        // initial beer number
        int beerNum = 99;
        // declares word variable with value of "bottles"
        String word = "bottles";

        while (beerNum > 0) {
        // When for singular bottles during the song
      
        // Song output
        System.out.println(beerNum + " " + word + " of beer on the wall!");
        System.out.println(beerNum + " " + word + " of beer!");
        System.out.println("Take one down.");
        System.out.println("Pass it around!");
        // subtract one beer from total beerNum
        beerNum = beerNum - 1;
        if (beerNum == 1){
            word = "bottle"; 
        }


        if (beerNum > 0) {
            System.out.println(beerNum + " " + word + " of beer on the wall");

        } else {
            System.out.println("No more bottles of beer on the wall!");
        } // end else

    } // end while loop
} // end main method
} // end class
