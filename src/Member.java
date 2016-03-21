/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Windows 8.1
 */
public class Member {
    private String nama;
    private String team;
    private int umur;
    private int nilaitampil;
    private int nilaisuara;
    private int nilaisikap;
    public Member(String nama, String team, int umur, int nilaitampil, int nilaisuara, int nilaisikap){
        this.nama=nama;
        this.team=team;
        this.umur=umur;
        this.nilaitampil=nilaitampil;
        this.nilaisuara=nilaisuara;
        this.nilaisikap=nilaisikap;
    }
    public String getNama(){
        return nama;
    }
    public String getTeam(){
        return team;
    }
    public int getUmur(){
        return umur;
    }
    public int getNilaiTampil(){
        return nilaitampil;
    }
    public int getNilaiSuara(){
        return nilaisuara;
    }
    public int getNilaiSikap(){
        return nilaisikap;
    }
    public int getNilai(){
        return (this.nilaisikap+this.nilaisuara+this.nilaitampil)/3;
    }
    
}
