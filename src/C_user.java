/**
 * Created by Hesham Mohammed on 15/04/2021.
 */
public class C_user {
    private int number;
    private String name;

    public C_user() {
    }


    public C_user(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "number=" + number + ", name=" + name ;
    }



}

