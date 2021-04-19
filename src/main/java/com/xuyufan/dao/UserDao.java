package com.xuyufan.dao;

import com.xuyufan.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{
    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {

        String sql = "insert into usertable values(?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,user.getUsername());
        st.setString(2,user.getPassword());
        st.setString(3,user.getEmail());
        st.setString(4,user.getGander());
        st.setDate(5, (java.sql.Date) user.getBirthDate());
        int rs = st.executeUpdate();
        if(rs == 0){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {

        String sql = "delete from usertable where id = ?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,user.getId());
        int rs = st.executeUpdate();
        return rs;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {

        String sql = "update usertable set username=?,password=?,email=?,gender=?,birthDate=? where id = ?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,user.getUsername());
        st.setString(2,user.getPassword());
        st.setString(3,user.getEmail());
        st.setString(4,user.getGander());
        st.setDate(5, (java.sql.Date) user.getBirthDate());
        st.setInt(6,user.getId());
        int rs = st.executeUpdate();
        return rs;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {

        String sql = "select * from usertable where id=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,id);
        ResultSet rs = st.executeQuery();
        User user = null;
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
        }
        return user;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {

        String sql="select * from usertable where username=? and password=?";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,username);
        st.setString(2,password);
        ResultSet rs=st.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gander"));
            user.setBirthDate(rs.getDate("birthdate"));
        }
        return user;
    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        String sql = "select * from usertable where username=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,username);
        ResultSet rs = st.executeQuery();
        User user = new User();
        List<User> list = new ArrayList<>();
        if(rs.next()){
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
            list.add(user);
        }
        return list;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        String sql = "select * from usertable where password=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,password);
        ResultSet rs = st.executeQuery();
        User user = new User();
        List<User> list = new ArrayList<User>();
        if(rs.next()){
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
            list.add(user);
        }
        return list;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        String sql = "select * from usertable where email=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,email);
        ResultSet rs = st.executeQuery();
        User user = new User();
        List<User> list = new ArrayList<User>();
        if(rs.next()){
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
            list.add(user);
        }
        return list;
    }

    @Override
    public List<User> findByGender(Connection con, String gender) throws SQLException {
        String sql = "select * from usertable where gender=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,gender);
        ResultSet rs = st.executeQuery();
        User user = new User();
        List<User> list = new ArrayList<User>();
        if(rs.next()){
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
            list.add(user);
        }
        return list;
    }

    @Override
    public List<User> findByBirthdate(Connection con, Date birthDate) throws SQLException {
        String sql = "select * from usertable where birthDate=?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setDate(1, (java.sql.Date) birthDate);
        ResultSet rs = st.executeQuery();
        User user = new User();
        List<User> list = new ArrayList<User>();
        if(rs.next()){
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
            list.add(user);
        }
        return list;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        String sql = "select * from usertable";
        ResultSet rs = con.createStatement().executeQuery(sql);
        User user = new User();
        List<User> list = new ArrayList<User>();
        if(rs.next()){
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGander(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthDate"));
            list.add(user);
        }
        return list;
    }
}
