package yb.github.moorish;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import yb.github.moorish.model.Role;
import yb.github.moorish.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User user = new User();
        
        Role role = new Role();
        role.setId(1L);
        role.setName("client");       
        
        Role role1 = new Role();
        role1.setId(2L);
        role1.setName("admin");
        
       
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        roles.add(role1);
        
        user.setRoles(roles);
        
       String s =  String.join(",", user.getRoles()
                .stream()
                .map(Role::getName)
                .collect(Collectors.joining(",")));
       String g = "" +  user.getRoles()
       .stream()
       .map(Role::getName)
       .collect(Collectors.joining(","));
       
       System.out.println(g);
       
    }
}
 