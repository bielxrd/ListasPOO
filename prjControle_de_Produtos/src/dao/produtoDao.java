/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import factory.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author gabriel.dramos1
 */
public class produtoDao {
    
    private final Connection connection;
    int id;
    String nome;
    int quantidade;
    double preco;
    
    public produtoDao() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public List<Produto> listar() {
        
        try {
            
            List<Produto> lista = new ArrayList<>();
            
            String SQL = "SELECT * FROM PRODUTO";
            
            PreparedStatement stmt = this.connection.prepareStatement(SQL);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Produto v = new Produto();
                v.setId(rs.getInt("id"));
                v.setName(rs.getString("nome"));
                v.setQuantidade(Integer.parseInt(rs.getString("quantidade")));
                v.setPreco(Double.parseDouble(rs.getString("preco")));
                lista.add(v);
            }
            
            return lista;
            
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    public void adiciona(Produto p) {
        String SQL = "INSERT INTO produto(nome,quantidade,preco) VALUES(?,?,?)";
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(SQL);
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            stmt.execute();
            
        } catch(SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    
    
    
}
