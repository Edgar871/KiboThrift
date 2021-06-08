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
public class MainQuery {
    public String get = "SELECT * FROM data";
    public String create = "INSERT INTO data (name, email, product, qty, size, "
            + "clothes, address, city, state, phone) VALUES(?,?,?,?,?,?,?,?,?,?)";
    public String show = "SELECT * FROM data WHERE id = ?";
    public String update = "UPDATE data SET name = ?, email = ?, product = ?,"
            + "qty = ?, size = ?, clothes = ?, address = ?, city = ?, state = ?,"
            + "phone = ? WHERE id = ?";
    public String delete = "DELETE FROM data WHERE id = ?";
}
