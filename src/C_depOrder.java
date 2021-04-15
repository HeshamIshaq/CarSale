/**
 * Created by Hesham Mohammed on 15/04/2021.
 */
public class C_depOrder {

    private C_order C_order;
    private C_customer C_customer;
    private C_products C_products;
    private C_emploeey C_emploeey;

    public C_depOrder() {
    }

    public C_depOrder(C_order C_order, C_customer C_customer, C_products C_products, C_emploeey C_emploeey) {
        this.C_order = C_order;
        this.C_customer = C_customer;
        this.C_products = C_products;
        this.C_emploeey = C_emploeey;
    }

    public C_order getC_order() {
        return C_order;
    }

    public void setC_order(C_order C_order) {
        this.C_order = C_order;
    }

    public C_customer getC_customer() {
        return C_customer;
    }

    public void setC_customer(C_customer C_customer) {
        this.C_customer = C_customer;
    }

    public C_products getC_products() {
        return C_products;
    }

    public void setC_products(C_products C_products) {
        this.C_products = C_products;
    }

    public C_emploeey getC_emploeey() {
        return C_emploeey;
    }

    public void setC_emploeey(C_emploeey C_emploeey) {
        this.C_emploeey = C_emploeey;
    }

    @Override
    public String toString() {
        return "C_depOrder{" + "C_order=" + C_order + ", C_customer=" + C_customer + ", C_products=" + C_products + ", C_emploeey=" + C_emploeey + '}';
    }


}