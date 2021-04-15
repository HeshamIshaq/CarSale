/**
 * Created by Hesham Mohammed on 15/04/2021.
 */
public class C_order {
    private int IDorder;


    public C_order(int IDorder) {
        this.IDorder = IDorder;
    }



    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    @Override
    public String toString() {
        return "IDorder=" + IDorder ;
    }

}
