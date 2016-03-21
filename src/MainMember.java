/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Windows 8.1
 */
public class MainMember {
    public static void main(String[] args) {
        ArrayList<Member> Arr= new ArrayList<Member>();
        Arr.add(new Member("Rizqi","CF",19,90,90,90));
        Arr.add(new Member("Fauzi","CF",19,100,90,80));
        Arr.add(new Member("Rifa","CF",19,70,100,100));
        for(int i=0; i<Arr.size();i++){
            System.out.println("===================================");
            System.out.println("-----------Member Idol-------------");
            System.out.println("===================================");
            System.out.println("Nama Member : "+Arr.get(i).getNama());
            System.out.println("Team Member : "+Arr.get(i).getTeam());
            System.out.println("Umur Member : "+Arr.get(i).getUmur());
            System.out.println("Nilai Member: "+Arr.get(i).getNilai());
            System.out.println("-----------------------------------");
        }
    }
    
}
