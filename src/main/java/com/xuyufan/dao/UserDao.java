package com.xuyufan.dao;

import com.xuyufan.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{

    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        String sql="insert into Usertable values(?,?,?,?,?)";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,user.getUsername());
        pstmt.setString(2,user.getPassword());
        pstmt.setString(3,user.getEmail());
        pstmt.setString(4,user.getGender());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        pstmt.setString(5,formatter.format(user.getBirthdate()));
        int a=pstmt.executeUpdate();
        if(a!=0) return true;
        else return false;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        String sql="delete from Usertable where id=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setInt(1,user.getId());
        return pstmt.executeUpdate();
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        String sql="update Usertable set username=?,password=?,email=?,gender=?,birthdate=? where id=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,user.getUsername());
        pstmt.setString(2,user.getPassword());
        pstmt.setString(3,user.getEmail());
        pstmt.setString(4,user.getGender());
        pstmt.setDate(5,new java.sql.Date(user.getBirthdate().getTime()));
        pstmt.setInt(6,user.getId());
        return pstmt.executeUpdate();
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        String sql="select * from Usertable where id=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setInt(1,id);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
        }
        return user;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql="select * from Usertable where username=? and password=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,username);
        pstmt.setString(2,password);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));

        }
        return user;
    }

    @Override
    public List<User> findByUsername(Connection con, String username) throws SQLException {
        String sql="select * from Usertable where username=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,username);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        List<User> Lu=new ArrayList<User>();
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
            Lu.add(user);
        }
        return Lu;
    }

    @Override
    public List<User> findByPassword(Connection con, String password) throws SQLException {
        String sql="select * from Usertable where password=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,password);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        List<User> Lu=new ArrayList<User>();
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
            Lu.add(user);
        }
        return Lu;
    }

    @Override
    public List<User> findByEmail(Connection con, String email) throws SQLException {
        String sql="select * from Usertable where email=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,email);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        List<User> Lu=new ArrayList<User>();
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
            Lu.add(user);
        }
        return Lu;
    }

    @Override
    public List<User> findByGender(Connection con, String gender) throws SQLException {
        String sql="select * from Usertable where gender=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setString(1,gender);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        List<User> Lu=new ArrayList<User>();
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
            Lu.add(user);
        }
        return Lu;
    }

    @Override
    public List<User> findByBirthdate(Connection con, Date birthDate) throws SQLException {
        String sql="select * from Usertable where birthdate=?";
        PreparedStatement pstmt= con.prepareStatement(sql);
        pstmt.setDate(1, (java.sql.Date) birthDate);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        List<User> Lu=new ArrayList<User>();
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
            Lu.add(user);
        }
        return Lu;
    }

    @Override
    public List<User> findAllUser(Connection con) throws SQLException {
        String sql="select * from Usertable";
        PreparedStatement pstmt= con.prepareStatement(sql);
        ResultSet rs= pstmt.executeQuery();
        User user=null;
        List<User> Lu=new ArrayList<User>();
        if(rs.next()){
            user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthDate(rs.getDate("birthdate"));
            Lu.add(user);
        }
        return Lu;
    }
}