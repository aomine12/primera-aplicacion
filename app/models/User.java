package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: TAKESHI
 * Date: 4/05/13
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 */


@Entity
public class User extends Model {

    @Id
    public Long id;
    @Constraints.Required
    public String firstName;
    @Constraints.Required
    public String secondName;
    @Constraints.Required
    public String userName;

    public static Finder<Long,User> find = new Finder(Long.class,User.class);

    public static List<User> all(){
        return find.all();
    }

    public static void create(User user){
        user.save();
    }


}
