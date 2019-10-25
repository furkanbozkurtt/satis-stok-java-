/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazamodul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bozku
 */
public class Magazamodul {
    Connection con= null;
    Statement sta= null;
    PreparedStatement psta=null;
    ResultSet rs=null;
    
    database db=new database();
    public static int yet;
    
    
    public boolean log(String ad,String password){
        String sorgu="Select * from kullanici where KullaniciAdi =? and Sifre=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.setString(2, password);
            
            rs=psta.executeQuery();
            if(rs.next()){
                int yetki=rs.getInt("Yetki");
                if(yetki==1){
                    yet=1;
                }
                else if(yetki==2){
                    yet=2;
                }
            }
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<String> meslekgetir(){
        String sorgu="select distinct MeslekAdi from meslek";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String meslekad=rs.getString("MeslekAdi");
                list.add(meslekad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> departmangetir(){
        String sorgu="select distinct DepartmanAdi from departman";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String departmanad=rs.getString("DepartmanAdi");
                list.add(departmanad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> magazagetir(){
        String sorgu="select distinct SubeAdi from magaza";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String magazaad=rs.getString("SubeAdi");
                list.add(magazaad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> personelgetir(){
        String sorgu="select distinct PersonelAdi from personel";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String personelad=rs.getString("PersonelAdi");
                list.add(personelad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> kategorigetir(){
        String sorgu="select distinct KategoriAdi from kategoriad";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String kategoriad=rs.getString("KategoriAdi");
                list.add(kategoriad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> renkgetir(){
        String sorgu="select distinct RenkKodu from renk";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String renkkod=rs.getString("RenkKodu");
                list.add(renkkod);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> desengetir(){
        String sorgu="select distinct DesenAdi from desen";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String desenad=rs.getString("DesenAdi");
                list.add(desenad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> markagetir(){
        String sorgu="select distinct MarkaAdi from marka";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String markaad=rs.getString("MarkaAdi");
                list.add(markaad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> bedengetir(){
        String sorgu="select distinct BedenAdi from beden";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String bedenad=rs.getString("BedenAdi");
                list.add(bedenad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> tipgetir(){
        String sorgu="select distinct TipAdi from tip";
        ArrayList <String> list= new ArrayList<String>();
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String tipad=rs.getString("TipAdi");
                list.add(tipad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void personelekle(String ad,String soyad,String meslek,String departman,String magaza, String tel, String maas,String adres){
        String sorgu="insert into personel (PersonelAdi,PersonelSoyadi,PersonelTel,PersonelAdres,Maas,DepartmanId,MeslekId,MagazaId) values (?,?,?,?,?,(select DepartmanId from departman where DepartmanAdi=?),(select MeslekId from meslek where MeslekAdi=?),(select MagazaId from magaza where SubeAdi=?))";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.setString(2, soyad);
            psta.setString(3, tel);
            psta.setString(4, adres);
            psta.setString(5, maas);
            psta.setString(6, departman);
            psta.setString(7, meslek);
            psta.setString(8, magaza);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Personel Eklenmiştir");
            
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void urunekle(String ad,String barkod,String fiyat, String kategori){
        String sorgu="insert into urun (UrunAdi,UrunFiyati,KategoriId,Barkod) values (?,?,(select KategoriID from kategori where KategoriAdId=(select KategoriAdId from kategoriad where KategoriAdi=?)),?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.setString(2, fiyat);
            psta.setString(3, kategori);
            psta.setString(4, barkod);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null,"urun Eklenmiştir");
            
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void kategoriadekle(String ad){
        String sorgu="insert into kategoriad(KategoriAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null, "kategori adı eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public void desenekle(String ad){
        String sorgu="insert into desen(DesenAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null, "desen adı eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void renkekle(String ad){
        String sorgu="insert into renk(RenkKodu) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null, "renk adı eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       public void markaekle(String ad){
        String sorgu="insert into marka(MarkaAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null, "marka adı eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        public void bedenekle(String ad){
        String sorgu="insert into beden(BedenAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null, "beden adı eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
         public void tipekle(String ad){
        String sorgu="insert into tip(TipAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null, "tip adı eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
   /* public String stokgetir(String barkod){
        String sorgu="select * from stok where UrunId=(select UrunId from urun where Barkod=?)";
        String stk;
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, barkod);
            psta.executeQuery();
            return stk;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    public void stokdus(String barkod){
        String sorgu="update stok set StokAdedi=StokAdedi-1 where UrunId=(select UrunId from urun where Barkod=?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, barkod);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void stokartir(String barkod){
        String sorgu="update stok set StokAdedi=StokAdedi+1 where UrunId=(select UrunId from urun where Barkod=?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, barkod);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void faturaekle(String barkod){
        String sorgu="insert into fatura (SatisId) values ((select SatisId from satis where UrunId=(select UrunId from urun where Barkod=?))) ";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, barkod);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void satisekle(String barkod,String date,String adet){
        login lgn=new login();
        String kadi=lgn.kadi;
        String sorgu="insert into satis (SatisAdedi,SatisTarihi,UrunId,MagazaId,PersonelId) values (?,?,(select UrunId from urun where Barkod=?),(select MagazaId from personel where PersonelId=(select PersonelId from kullanici where KullaniciAdi=?)),(select PersonelId from kullanici where KullaniciAdi=?))";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, adet);
            psta.setString(2, date);
            psta.setString(3, barkod);
            psta.setString(4, kadi);
            psta.setString(5, kadi);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
    public ArrayList<String> kullanıcıgetir(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from kullanici";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            while(rs.next()){
                String id=rs.getString("KullaniciId");
                String ad=rs.getString("KullaniciAdi");
                String sifre=rs.getString("Sifre");
                String yetki=rs.getString("Yetki");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,sifre);
                list.add(3,yetki);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<String> magazagetirlist(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from magaza";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            while(rs.next()){
                String id=rs.getString("MagazaId");
                String ad=rs.getString("SubeAdi");
                String tel=rs.getString("MagazaTel");
                String adres=rs.getString("MagazaAdresi");
                String sehir=rs.getString("Sehir");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,tel);
                list.add(3,adres);
                list.add(4,sehir);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> meslekgetirlist(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from meslek";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            while(rs.next()){
                String id=rs.getString("MeslekId");
                String ad=rs.getString("MeslekAdi");
                list.add(0,id);
                list.add(1,ad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> departmangetirlist(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from departman";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            while(rs.next()){
                String id=rs.getString("DepartmanId");
                String ad=rs.getString("DepartmanAdi");
                list.add(0,id);
                list.add(1,ad);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> satisgetir(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from satis";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            while(rs.next()){
                String id=rs.getString("SatisId");
                String adet=rs.getString("SatisAdedi");
                String tarih=rs.getDate("SatisTarihi").toString();
                String urunid=rs.getString("UrunId");
                list.add(0,id);
                list.add(1,adet);
                list.add(2,tarih);
                list.add(3,urunid);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> personelsatisgetir(String ad){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from satis where PersonelId=(select PersonelId from personel where PersonelAdi='"+ad+"')";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String id=rs.getString("SatisId");
                String adet=rs.getString("SatisAdedi");
                String tarih=rs.getDate("SatisTarihi").toString();
                String urunid=rs.getString("UrunId");
                String magazaid=rs.getString("MagazaId");
                list.add(0,id);
                list.add(1,adet);
                list.add(2,tarih);
                list.add(3,urunid);
                list.add(4,magazaid);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> kategorigetirlist(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from kategori";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String id=rs.getString("KategoriId");
                String adid=rs.getString("KategoriAdId");
                String bedid=rs.getString("BedenId");
                String marid=rs.getString("MarkaId");
                String desid=rs.getString("DesenId");
                String renid=rs.getString("RenkId");
                String tipid=rs.getString("Tipıd");
                
                list.add(0,id);
                list.add(1,adid);
                list.add(2,bedid);
                list.add(3,marid);
                list.add(4,desid);
                list.add(5,renid);
                list.add(6,tipid);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> urungetir(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from urun ";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String id=rs.getString("UrunId");
                String ad=rs.getString("UrunAdi");
                String fiyat=rs.getString("UrunFiyati");
                String kategoriid=rs.getString("KategoriId");
                String barkod=rs.getString("Barkod");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,fiyat);
                list.add(3,kategoriid);
                list.add(4,barkod);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<String> personelgetirlist(){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from personel";
        try {
            sta=con.createStatement();
            rs=sta.executeQuery(sorgu);
            
            while(rs.next()){
                String id=rs.getString("PersonelId");
                String ad=rs.getString("PersonelAdi");
                String soyad=rs.getString("PersonelSoyadi");
                String tel=rs.getString("PersonelTel");
                String adres=rs.getString("PersonelAdres");
                String tarih=rs.getDate("GirisTarihi").toString();
                String maas=rs.getString("Maas");
                String depid=rs.getString("DepartmanId");
                String mesid=rs.getString("MeslekId");
                String magid=rs.getString("MagazaId");
                
                list.add(0,id);
                list.add(1,ad);
                list.add(2,soyad);
                list.add(3,tel);
                list.add(4,adres);
                list.add(5,tarih);
                list.add(6,maas);
                list.add(7,depid);
                list.add(8,mesid);
                list.add(9,magid);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
      
      
      
      
      
      
//    public void stokekle(String adet,String barkod,String fiyat, String kategori, String renk,String desen,String marka, String beden, String tip){
//        String sorgu="insert into urun (UrunAdi,UrunFiyati,KategoriId,Barkod) values (?,?,(select distinct KategoriId from kategori where KategoriAdId=? and BedenId=? and MarkaId=? and DesenId=? and RenkId=? and TipId=?),?)";
//        try {
//            psta=con.prepareStatement(sorgu);
//            psta.setString(1, ad);
//            psta.setString(2, fiyat);
//            psta.setString(3, kategori);
//            psta.setString(4, beden);
//            psta.setString(5, marka);
//            psta.setString(6, desen);
//            psta.setString(7, renk);
//            psta.setString(8, tip);
//            psta.setString(9, barkod);
//            psta.executeUpdate();
//            JOptionPane.showMessageDialog(null,"urun Eklenmiştir");
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public void kullanıcıekle(String ad,String sifre, String yetki, String personel){
        String sorgu="insert into kullanici (KullaniciAdi,Sifre,Yetki,PersonelId) values (?,?,?,(select PersonelId from personel where PersonelAdi=?))";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.setString(2, sifre);
            psta.setString(3, yetki);
            psta.setString(4, personel);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Kullanıcı Eklenmiştir");
            
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void magazaekle(String ad,String departman, String sehir, String tel,String adres){
        String sorgu="insert into magaza (SubeAdi,MagazaTel,MagazaAdresi,Sehir,DepartmanId) values (?,?,?,?,(select DepartmanId from departman where DepartmanAdi=?))";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.setString(2, tel);
            psta.setString(3, adres);
            psta.setString(4, sehir);
            psta.setString(5, departman);
            psta.executeUpdate();
            JOptionPane.showMessageDialog(null,"magaza Eklenmiştir");
            
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void departmanekle(String ad){//bunlara tekrardan bak bi hata yok ama çalışmıyor
        String sorgu="insert into departman (DepartmanAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            JOptionPane.showMessageDialog(null,"departman Eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void meslekekle(String ad){//bunlara tekrardan bak bi hata yok ama çalışmıyor
        String sorgu="insert into meslek (MeslekAdi) values (?)";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            JOptionPane.showMessageDialog(null,"meslek Eklenmiştir");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
//    public int yetkisorgula(String ad,String password){
//        String sorgu="Select Yetki from kullanici where KullaniciAdi="+ad+"' and Sifre='"+password+"'";
//        try {
//            psta=con.prepareStatement(sorgu);
//            psta.setString(1, ad);
//            psta.setString(2, password);
//            
//            ResultSet rs=psta.executeQuery();
//            if(rs.next()){
//                int yetki=rs.getInt("Yetki");
//                if(yetki==1){
//                    yet=1;
//                }
//                else if(yetki==2){
//                    yet=2;
//                }
//            }
//            return yet;
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
//            return 0;
//        }
//    }

    /**
     * @param args the command line arguments
     */
    
    public ArrayList<String> kullanıcıarama(String isim){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from kullanici where KullaniciAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, isim);
            rs=psta.executeQuery();
            while(rs.next()){
                String id=rs.getString("KullaniciId");
                String ad=rs.getString("KullaniciAdi");
                String sifre=rs.getString("Sifre");
                String yetki=rs.getString("Yetki");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,sifre);
                list.add(3,yetki);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public ArrayList<String> subearama(String isim){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from magaza where SubeAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, isim);
            rs=psta.executeQuery();
            while(rs.next()){
                String id=rs.getString("MagazaId");
                String ad=rs.getString("SubeAdi");
                String tel=rs.getString("MagazaTel");
                String adres=rs.getString("MagazaAdresi");
                String sehir=rs.getString("Sehir");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,tel);
                list.add(3,adres);
                list.add(4,sehir);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public ArrayList<String> deparama(String isim){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from departman where DepartmanAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, isim);
            rs=psta.executeQuery();
            while(rs.next()){
                String id=rs.getString("DepartmanId");
                String ad=rs.getString("DepartmanAdi");
                list.add(0,id);
                list.add(1,ad);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public ArrayList<String> mesarama(String isim){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from meslek where MeslekAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, isim);
            rs=psta.executeQuery();
            while(rs.next()){
                String id=rs.getString("MeslekId");
                String ad=rs.getString("MeslekAdi");
                list.add(0,id);
                list.add(1,ad);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public ArrayList<String> urunarama(String isim){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from urun where Barkod=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, isim);
            rs=psta.executeQuery();
            while(rs.next()){
                String id=rs.getString("UrunId");
                String ad=rs.getString("UrunAdi");
                String fiyat=rs.getString("UrunFiyati");
                String katid=rs.getString("KategoriId");
                String barkod=rs.getString("Barkod");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,fiyat);
                list.add(3,katid);
                list.add(4,barkod);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public ArrayList<String> perarama(String isim,String soyisim){
        ArrayList<String> list=new ArrayList<String>();
        String sorgu="select * from personel where PersonelAdi=? and PersonelSoyadi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, isim);
            psta.setString(2, soyisim);
            rs=psta.executeQuery();
            while(rs.next()){
                String id=rs.getString("PersonelId");
                String ad=rs.getString("PersonelAdi");
                String soyad=rs.getString("PersonelSoyadi");
                String tel=rs.getString("PersonelTel");
                String adres=rs.getString("PersonelAdres");
                String tarih=rs.getDate("GirisTarihi").toString();
                String maas=rs.getString("Maas");
                String depid=rs.getString("DepartmanId");
                String mesid=rs.getString("MeslekId");
                String magid=rs.getString("MagazaId");
                list.add(0,id);
                list.add(1,ad);
                list.add(2,soyad);
                list.add(3,tel);
                list.add(4,adres);
                list.add(5,tarih);
                list.add(6,maas);
                list.add(7,depid);
                list.add(8,mesid);
                list.add(9,magid);
                
                
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public void kullanıcısil(String id){
        String sorgu="delete from kullanici where KullaniciId=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void magazasil(String id){
        String sorgu="delete from magaza where MagazaId='"+id+"'";
        try {
            psta=con.prepareStatement(sorgu);
            //psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void mesleksil(String id){
        String sorgu="delete from meslek where MeslekId=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    public void departmansil(String id){
        String sorgu="delete from departman where DepartmanId=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void urunsil(String id){
        String sorgu="delete from urun where UrunId=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void personelsil(String id){
        String sorgu="delete from personel where PersonelId=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void kategorisil(String id){
        String sorgu="delete from kategori where KategoriId=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, id);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void kategoriadsil(String ad){
        String sorgu="delete from kategoriad where KategoriAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void desensil(String ad){
        String sorgu="delete from desen where DesenAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void renksil(String ad){
        String sorgu="delete from renk where RenkKodu=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void markasil(String ad){
        String sorgu="delete from marka where MarkaAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void bedensil(String ad){
        String sorgu="delete from beden where BedenAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void tipsil(String ad){
        String sorgu="delete from tip where TipAdi=?";
        try {
            psta=con.prepareStatement(sorgu);
            psta.setString(1, ad);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        login lgn = new login();
        lgn.setVisible(true);
        lgn.setLocationRelativeTo(null);
    }
    public Magazamodul(){
        String url="jdbc:mysql://"+db.host+":"+db.port+"/"+db.db_name;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,db.id,db.password);
            System.out.println("veritabanı başarıyla bağlandı");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("driver calışmadı");
        } catch (SQLException ex) {
            Logger.getLogger(Magazamodul.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("baglantı çalışmadı");
        }
        
    }
    
}
