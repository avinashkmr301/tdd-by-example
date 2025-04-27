package guru.springframework;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
         /*if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        France france = (France) object;
        return amount == france.amount;*/
        Money money = (Money) obj;
        return amount == money.amount && this.getClass().equals(obj.getClass());
    }
}
