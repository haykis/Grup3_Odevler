package yasarYilmaz;

import java.util.ArrayList;
import java.util.List;
public class Odev11_aMemur extends Odev11_Muhasebe {
    public Odev11_aMemur(String isim,String soyIsim,String address,String statu,String telefon) {
        
        super.isim=isim;
        super.soyIsim=soyIsim;
        super.address=address;
        super.statu=statu;
        super.telefon=telefon;
        
    }
    
    public Odev11_aMemur() {
        
    }
    
    
    public static void memur() {
        // TODO Auto-generated method stub
        Odev11_aMemur memur1=new Odev11_aMemur("veli","Can","kanlica","memur","06324757685");
        
        
        String id4String=String.valueOf(memur1.idAtama());
    
        String maas4String=String.valueOf(memur1.maasHesapla(95));
        
        List<String>list4= new ArrayList<>();
        list4.add(memur1.isim);
        list4.add(memur1.soyIsim);
        list4.add(memur1.address);
        list4.add(memur1.statu);
        list4.add(memur1.telefon);
        
        list4.add(maas4String);
        list4.add(id4String);
        System.out.println(list4);
        
        
Odev11_aMemur memur2=new Odev11_aMemur("deli","deliCan","darilica","kidemli memur","07324757685");
        
        
        String id5String=String.valueOf(memur2.idAtama());
    
        String maas5String=String.valueOf(memur2.maasHesapla(100));
        
        List<String>list5= new ArrayList<>();
        list5.add(memur2.isim);
        list5.add(memur2.soyIsim);
        list5.add(memur2.address);
        list5.add(memur2.statu);
        list5.add(memur2.telefon);
        
        list5.add(maas5String);
        list5.add(id5String);
        System.out.println(list5);
    
        
Odev11_aMemur memur3=new Odev11_aMemur("kupeli","medeliCan","hanlilica","kidemli mudur","09324757685");
        
        
        String id6String=String.valueOf(memur3.idAtama());
    
        String maas6String=String.valueOf(memur3.maasHesapla(150));
        
        List<String>list6= new ArrayList<>();
        list6.add(memur3.isim);
        list6.add(memur3.soyIsim);
        list6.add(memur3.address);
        list6.add(memur3.statu);
        list6.add(memur3.telefon);
        
        list6.add(maas6String);
        list6.add(id6String);
        System.out.println(list6);
    }
