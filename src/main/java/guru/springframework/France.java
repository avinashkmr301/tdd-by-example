package guru.springframework;

public class France extends Money {

    France(int amount){
        this.amount=amount;
    }

    France times(int multiplier){
        return new France(amount*multiplier);

    }
}
