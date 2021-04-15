/**
 * Created by Hesham Mohammed on 15/04/2021.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
public class C_controller {

    private C_customer OFcustomer;
    private C_emploeey OFemploeey;
    private C_products OFproduct;
    private C_order    OForder;
    private LinkedList<C_products> Linkedproduct  = new LinkedList<>();
    private LinkedList<C_customer> Linkedcustomer = new LinkedList<>();
    private LinkedList<C_order>    Linkedorder    = new LinkedList<>();
    private LinkedList<C_depOrder> LinkedDeporder   = new LinkedList<>();
    private LinkedList<C_emploeey> Linkedemploeey = new LinkedList<>();

    //method Of add Order by collection
    public void addOrder (int IDorder ,int ID_customer, String adrress_customer, int number, String name,
                          int number_pro, int cost_pro, int Quantity_pro, String name_pro , String major_emploeey)
    {
        C_order C_ord = new C_order(IDorder);
        Linkedorder.add(C_ord);
        C_customer C_cust = new C_customer(ID_customer, adrress_customer,  number,  name);
        Linkedcustomer.add(C_cust);
        C_products C_pro = new C_products(number_pro, cost_pro,  Quantity_pro,  name_pro );
        Linkedproduct.add(C_pro);
        C_emploeey C_emp = new C_emploeey(major_emploeey, number, name);
        Linkedemploeey.add(C_emp);
        C_depOrder C_dep = new C_depOrder(C_ord, C_cust, C_pro, C_emp);
        LinkedDeporder.add(C_dep);
        return;
    }

    //method Of View Order Of collection
    public void ViewOrder ()
    {
        for (int i = 0; i < Linkedorder.size(); i++) {
            System.out.println(Linkedorder.toString()); }
        for (int i = 0; i < Linkedcustomer.size(); i++) {
            System.out.println(Linkedcustomer.toString());}
        for (int i = 0; i < Linkedproduct.size(); i++) {
            System.out.println(Linkedproduct.toString());}
        for (int i = 0; i < Linkedemploeey.size(); i++) {
            System.out.println(Linkedemploeey.toString());}

    }
    //This method views the dependend orders.
    public void ViewOrderDependence ()
    {
        System.out.println(LinkedDeporder.toString());
    }
    //This method views the list of customer.
    public void Viwcustomer()
    {
        for (int i = 0; i < Linkedcustomer.size(); i++) {
            System.out.println(Linkedcustomer.toString());}
    }
    //This method shos the list of product.
    public void Showpro()
    {
        Fproducts fpoo = new Fproducts();
        try {
            Connection conn= DriverManager.getConnection("jdbc:ucanaccess://d:\\db1.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM PRODUCTS");
            while(rs.next()){
                String ar [] = {String.valueOf(rs.getString("Quantity")), String.valueOf(rs.getInt("SL_PRODUCT")),rs.getString("NA_PRODUCT"),
                        String.valueOf(rs.getInt("NO_PRODUCT"))};
                DefaultTableModel tb = (DefaultTableModel)fpoo.jTable2.getModel();
                tb.addRow(ar);
            }}catch (SQLException e) {e.printStackTrace();}

    }
    //This method adds product to table.
    public void AddProToTab ()
    {
//        Fproducts fpoo = new Fproducts();
//        DefaultTableModel tb = (DefaultTableModel)fpoo.jTable2.getModel();
//        tb.insertRow(tb.getRowCount(), new Object []{fpoo.jTextField1.getText(),fpoo.jTextField2.getText(),
//        fpoo.jTextField3.getText(),fpoo.jTextField4.getText()});

    }
    //This method Of search Of order
    public void SearchOfOrder(int IDorder)
    {
        for (C_order ao:Linkedorder)
        {
            if(ao.getIDorder() == IDorder) System.out.println(ao.toString());
            else System.out.println("Not fund");
        }
    }

    //This method Of search Of customer
    public void SearchOfcustomer(int IDcust)
    {
        for (C_customer cs:Linkedcustomer)
        {
            if(cs.getID_customer() == IDcust) System.out.println(cs.toString());
            else System.out.println("Not fund");
        }
    }

    //This method Of search Of products
    public void SearchOfproducts(int IDpro)
    {
        for (C_products cp:Linkedproduct)
        {
            if(cp.getNumber_pro() == IDpro) System.out.println(cp.toString());
            else System.out.println("Not fund");
        }
    }

    //This method Of removeOrder
    public void removeOrder(int removeOrdwe)
    {
        for (int i = 0; i < Linkedorder.size(); i++) {
            if(Linkedorder.get(i).getIDorder() == removeOrdwe)
            {Linkedorder.remove(i);
                System.out.println("Removed done");}
            else System.out.println("Not fund");
        }
    }

    public void dependenceOforder(int dord)
    {
        for (int i = 0; i < Linkedorder.size(); i++) {
            if(Linkedorder.get(i).getIDorder() == dord)
            {


                System.out.println("dependence is OK ");
            }
            else System.out.println("Error");

        }
    }
    //This method shows the depended orders
    public void ARRAYDeporder()
    {
        System.out.println(LinkedDeporder.toString());
    }





}
