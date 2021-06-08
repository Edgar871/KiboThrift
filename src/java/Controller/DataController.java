/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MainModel;
import Query.MainQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edgar Hadhyra J
 */
public class DataController extends BaseController{
    MainQuery query = new MainQuery();
    ArrayList arraylist = new ArrayList();
    
    public ArrayList get() throws SQLException{
        String query = this.query.get;
        ResultSet rs = this.get(query);
    
        try{
            while(rs.next()){
                MainModel model = new MainModel();
                model.setId(rs.getString("id"));
                model.setName(rs.getString("name"));
                model.setEmail(rs.getString("email"));
                model.setProduct(rs.getString("product"));
                model.setQty(rs.getInt("qty"));
                model.setSize(rs.getString("size"));
                model.setClothes(rs.getString("clothes"));
                model.setAddress(rs.getString("address"));
                model.setCity(rs.getString("city"));
                model.setState(rs.getString("state"));
                model.setPhone(rs.getInt("phone"));
                arraylist.add(model);
            }
        }catch (SQLException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return arraylist;
        }
    }
    
    public boolean create(MainModel model) throws SQLException{
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getEmail());
        map.put(3, model.getProduct());
        map.put(4, model.getQty());
        map.put(5, model.getSize());
        map.put(6, model.getClothes());
        map.put(7, model.getAddress());
        map.put(8, model.getCity());
        map.put(9, model.getState());
        map.put(10, model.getPhone());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public MainModel show(String id) throws SQLException{
        MainModel model = new MainModel();
        
        Map<Integer, Object>Map = new HashMap<>();
        Map.put(1, id);
        
        String sql = this.query.show;
        ResultSet rs = this.getWithParam(Map, sql);
        
        if(rs.next()){
            model.setId(rs.getString("id"));
            model.setName(rs.getString("name"));
            model.setEmail(rs.getString("email"));
            model.setProduct(rs.getString("product"));
            model.setQty(rs.getInt("qty"));
            model.setSize(rs.getString("size"));
            model.setClothes(rs.getString("clothes"));
            model.setAddress(rs.getString("address"));
            model.setCity(rs.getString("city"));
            model.setState(rs.getString("state"));
            model.setPhone(rs.getInt("phone"));
        }
        return model;
    }
    
    public boolean update(MainModel model) throws SQLException{
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getEmail());
        map.put(3, model.getProduct());
        map.put(4, model.getQty());
        map.put(5, model.getSize());
        map.put(6, model.getClothes());
        map.put(7, model.getAddress());
        map.put(8, model.getCity());
        map.put(9, model.getState());
        map.put(10, model.getPhone());
        map.put(11, model.getId());
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean delete(String id) {
        String sql = this.query.delete;
        
        Map<Integer,Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.preparedStatement(map, sql);
    }
    
    public static void main(String[] args) {
        try {
            DataController main = new DataController();
            ArrayList<MainModel> list = main.get();
            System.out.println(list.get(0).getId());
            System.out.println(list.get(0).getName());
            System.out.println(list.get(0).getAddress());
            System.out.println(list.get(0).getCity());
            System.out.println(list.get(0).getState());
            System.out.println(list.get(0).getPhone());
        } catch (SQLException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
