/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

/**
 *
 * @author Edgar Hadhyra J
 */
public class UserQuery {
    public final String register = "INSERT INTO lguser (name,email,password) VALUES (?,?,?)";
    public final String login = "SELECT id,email FROM lguser WHERE email = ? AND password = ?";
    public final String show = "SELECT id,email FROM lguser WHERE id = ?";
    public final String update = "UPDATE lguser SET name = ?, email = ?, password = ?"
            + "WHERE id = ?";
}
