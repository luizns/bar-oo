package entities;

import util.Util;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public void setGender(char gender) {
        this.gender = gender;
    }


    public void setBeer(int beer) {
        this.beer = beer;
    }


    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover() {
        if (feeding() > 30.0)
            return 0.0;
        return Util.coverPrice;
    }

    public double feeding() {
        return beer * Util.beerPrice + barbecue * Util.barbecuePrice + softDrink * Util.sotfDrinkPrice;

    }

    public double ticket() {
        if (gender == 'F')
            return Util.genderFemale;
        else
            return Util.genderMale;
    }

    public double total() {
        return cover() + feeding() + ticket();
    }
}
