import android.graphics.drawable.Drawable;

/**
 * Created by HP on 30/07/2016.
 */
public class Object {
    String name;
    Drawable d;

    public Object(String name, Drawable d) {
        this.name = name;
        this.d = d;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getD() {
        return d;
    }

    public void setD(Drawable d) {
        this.d = d;
    }
}
