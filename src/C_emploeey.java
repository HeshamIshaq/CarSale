/**
 * Created by Hesham Mohammed on 15/04/2021.
 */
public class C_emploeey extends C_user {

    private String major_emploeey;

    public C_emploeey(int number, String name) {
        super(number, name);
    }

    public C_emploeey() {
    }


    public C_emploeey(String major_emploeey, int number, String name) {
        super(number, name);
        this.major_emploeey = major_emploeey;
    }



    public String getMajor_emploeey() {
        return major_emploeey;
    }

    public void setMajor_emploeey(String major_emploeey) {
        this.major_emploeey = major_emploeey;
    }

    @Override
    public String toString() {
        return super.toString() + "\n C_emploeey{" + "major_emploeey=" + major_emploeey + '}';
    }








}

