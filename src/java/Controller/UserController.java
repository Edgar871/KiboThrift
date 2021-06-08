/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserModel;
import Query.UserQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Edgar Hadhyra J
 */
public class UserController extends BaseController{
    private UserQuery query = new UserQuery();
    private List<UserModel> user = new ArrayList<>();
    
    public UserModel login(UserModel userModel) throws SQLException {
        String sql = this.query.login;
        
        Map<Integer,Object> map = new HashMap<>();
        map.put(1, userModel.getEmail());
        map.put(2, userModel.getPassword());
        
        ResultSet rs = this.getWithParam(map, sql);
        if (rs.next()) {
            
            UserModel model = new UserModel();
            model.setId(rs.getString("id"));
            model.setEmail(rs.getString("email"));
            
            return model;
        }else {
            return null;
        }
    }
    
    public UserModel show(String id) throws SQLException {
        String sql = this.query.show;
        
        Map<Integer,Object> map = new HashMap<>();
        map.put(1, id);
        
        ResultSet rs = this.getWithParam(map, sql);
        
        if (rs.next()) {
            UserModel user = new UserModel();
            user.setId(rs.getString("id"));
            user.setEmail(rs.getString("email"));
            return user;
        }else {
            return null;
        }
    }
    
    public boolean register(UserModel user) {
        String sql = this.query.register;
        
        Map<Integer,Object> map = new HashMap<>();
        map.put(1, user.getName());
        map.put(2, user.getEmail());
        map.put(3, user.getPassword());
        
        return this.preparedStatement(map, sql);
    }
}
