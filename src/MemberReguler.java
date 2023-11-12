public class MemberReguler extends Member implements CanGetDiskon{

    public MemberReguler (){
        super();
    }

    public Integer getPoin(){
        return poin;
    }
    
    @Override //Polymorphism
    public Integer hitungTotalBayar (Integer totalBelanja){
        if (totalBelanja < 500000){
            totalBelanja = totalBelanja - totalBelanja*0/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 1000000){
            totalBelanja = totalBelanja - totalBelanja*1/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja <= 7000000){
            totalBelanja = totalBelanja - totalBelanja*2/100;
            poin += totalBelanja /10000;
        }
        else if (totalBelanja > 7000000){
            totalBelanja = totalBelanja - totalBelanja*3/100;
            poin += totalBelanja /10000;
        }
        return totalBelanja;

    }
}
