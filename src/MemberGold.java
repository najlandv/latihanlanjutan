public class MemberGold extends Member implements CanGetDiskon, CanRequestCicilan, CanRequestDelivery{
    
    public MemberGold (){
        super();
    }
    
    
    @Override //Polymorphism
    public Integer hitungTotalBayar (Integer totalBelanja){
        if (totalBelanja < 500000){
            totalBelanja = totalBelanja - totalBelanja*0/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 1000000){
            totalBelanja = totalBelanja - totalBelanja*2/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 7000000){
            totalBelanja = totalBelanja - totalBelanja*4/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja > 7000000){
            totalBelanja = totalBelanja - totalBelanja*6/100;
            poin += totalBelanja /10000;
        }
        return totalBelanja;
    }

    @Override //Polymorphism
    public Double hitungOngkir (Double jarakTujuan){
        double ongkir = 0.0;
        if (jarakTujuan < 7){
            ongkir = 0;
        }
        else if (jarakTujuan >= 7){
            ongkir = 1000*(Math.ceil(jarakTujuan)-7);
        }
        return ongkir;
    }
    
    @Override //Polymorphism
    public Integer hitungCicilanPerBulan (Integer totalBelanja, Integer jumlahBulan){
        jumlahBulan = 24;
        if (totalBelanja > 5000000){
            return totalBelanja / jumlahBulan;
        }
        return 0;
    }
    
}