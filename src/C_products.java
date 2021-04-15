/**
 * Created by Hesham Mohammed on 15/04/2021.
 */
public class C_products {

    private int number_pro = 1 , cost_pro = 20000 , Quantity_pro = 5 ;
    private String name_pro = "Memory Card";
    private C_customer customer ;

    public C_products() {
    }



    public C_products(int number_pro, int cost_pro, int Quantity_pro, String name_pro) {
        this.number_pro = number_pro;
        this.cost_pro = cost_pro;
        this.Quantity_pro = Quantity_pro;
        this.name_pro = name_pro;
        this.customer = customer;
    }

    public int getNumber_pro() {
        return number_pro;
    }

    public void setNumber_pro(int number_pro) {
        this.number_pro = number_pro;
    }

    public int getCost_pro() {
        return cost_pro;
    }

    public void setCost_pro(int cost_pro) {
        this.cost_pro = cost_pro;
    }

    public int getQuantity_pro() {
        return Quantity_pro;
    }

    public void setQuantity_pro(int Quantity_pro) {
        this.Quantity_pro = Quantity_pro;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    @Override
    public String toString() {
        return  "number_pro=" + number_pro + ", cost_pro=" + cost_pro +
                ", Quantity_pro=" + Quantity_pro + ", name_pro=" + name_pro ;
    }







}

