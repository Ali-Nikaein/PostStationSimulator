public class House extends Data<Integer> {
    int ownerNationalCode;
    int costOfHouse;
    int area;
    String address;

    public House(int ownerNationalCode, int postalCode, String address, int costOfHouse, int area) {
        super(postalCode);
        this.ownerNationalCode = ownerNationalCode;
        this.costOfHouse = costOfHouse;
        this.area = area;
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "ownerNationalCode=" + ownerNationalCode +
                ", costOfHouse=" + costOfHouse +
                ", area=" + area +
                ", address='" + address + '\'' +
                ", key=" + key +
                '}';
    }
}
